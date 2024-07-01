package model;

import dal.*;
import java.io.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe auxiliar para operações relacionadas ao IFDM (Índice FIRJAN de Desenvolvimento Municipal).
 * 
 * Autor: Edson Baierle
 */
public class AuxiliarIfdm {

    private final DAO<Cidade> daoCidades;
    private final DAO<UnidadeFederacao> daoUfs;
    private ArrayList<UnidadeFederacao> lstTodasUFs = null;
    private ArrayList<Cidade> lstTodasCidades = null;

    /**
     * Construtor da classe AuxiliarIfdm.
     * 
     * @throws ClassNotFoundException se o driver JDBC não for encontrado
     * @throws SQLException se ocorrer um erro ao estabelecer a conexão
     */
    public AuxiliarIfdm() throws ClassNotFoundException, SQLException {
        daoCidades = new DAO<>();
        daoUfs = new DAO<>();
    }

    /**
     * Importa dados de unidades federativas a partir de um arquivo.
     * 
     * @param arq o caminho do arquivo a ser importado
     * @throws FileNotFoundException se o arquivo não for encontrado
     * @throws IOException se ocorrer um erro ao ler o arquivo
     * @throws SQLException se ocorrer um erro durante a inserção no banco de dados
     * @throws ClassNotFoundException se o driver JDBC não for encontrado
     */
    public void importaArqUF(String arq) throws FileNotFoundException, IOException, SQLException, ClassNotFoundException {
        FileReader fr = new FileReader(arq);
        BufferedReader br = new BufferedReader(fr);
        br.readLine(); // Ignora a primeira linha (cabeçalho)
        String linha = br.readLine();
        while (linha != null) {
            String[] cells = linha.split(";");
            if (cells.length == 2) {
                UnidadeFederacao uf = new UnidadeFederacao();
                uf.setUf(cells[0]);
                uf.setDescricao(cells[1]);

                daoUfs.inserir(uf);
            }
            linha = br.readLine();
        }
        br.close();
        fr.close();
    }

    /**
     * Importa dados de cidades a partir de um arquivo.
     * 
     * @param arq o caminho do arquivo a ser importado
     * @throws IOException se ocorrer um erro ao ler o arquivo
     * @throws SQLException se ocorrer um erro durante a inserção no banco de dados
     * @throws ClassNotFoundException se o driver JDBC não for encontrado
     */
    public void importaArqCidades(String arq) throws IOException, SQLException, ClassNotFoundException {
        FileReader fr = new FileReader(arq);
        BufferedReader br = new BufferedReader(fr);
        br.readLine(); // Ignora a primeira linha (cabeçalho)
        String linha = br.readLine();

        ArrayList<UnidadeFederacao> lstUfs = daoUfs.consultar(UnidadeFederacao.class, null, 0);

        while (linha != null) {
            String[] cells = linha.split(";");
            if (cells.length == 6) {
                Cidade c = new Cidade();

                // Procura a unidade federativa correspondente
                for (UnidadeFederacao uf : lstUfs) {
                    if (uf.getUf().equals(cells[0])) {
                        c.setUf(uf.getId());
                        break;
                    }
                }

                c.setDescricao(cells[1]);
                c.setIfdm(converter(cells[2]));
                c.setRenda(converter(cells[3]));
                c.setEducacao(converter(cells[4]));
                c.setSaude(converter(cells[5]));
                daoCidades.inserir(c);
            }
            linha = br.readLine();
        }
        br.close();
        fr.close();
    }

    /**
     * Converte uma string para um valor double, substituindo vírgulas por pontos.
     * 
     * @param s a string a ser convertida
     * @return o valor convertido
     */
    private double converter(String s) {
        double ret;
        try {
            ret = Double.parseDouble(s.replace(',', '.'));
        } catch (NumberFormatException ex) {
            ret = 0;
        }
        return ret;
    }

    /**
     * Consulta cidades no banco de dados com base no ID da unidade federativa.
     * 
     * @param uf_id o ID da unidade federativa
     * @return uma lista de cidades
     * @throws SQLException se ocorrer um erro durante a consulta
     * @throws ClassNotFoundException se o driver JDBC não for encontrado
     */
    public ArrayList<Cidade> consultarCidades(int uf_id) throws SQLException, ClassNotFoundException {
        return daoCidades.consultar(Cidade.class, null, uf_id);
    }

    /**
     * Limpa a base de dados, excluindo todas as cidades e unidades federativas.
     * 
     * @throws ClassNotFoundException se o driver JDBC não for encontrado
     * @throws SQLException se ocorrer um erro durante a exclusão
     */
    public void limparBase() throws ClassNotFoundException, SQLException {
        Conexao conn = new Conexao();
        String sql = "DELETE FROM cidade";
        PreparedStatement st = conn.prepareStatement(sql);
        st.executeUpdate();

        sql = "DELETE FROM unidade_federacao";
        st = conn.prepareStatement(sql);
        st.executeUpdate();
    }

    /**
     * Apura os rankings e médias para as unidades federativas e cidades.
     * 
     * @throws SQLException se ocorrer um erro durante a atualização
     * @throws ClassNotFoundException se o driver JDBC não for encontrado
     */
    public void apurarRankingsMedias() throws SQLException, ClassNotFoundException {
        ArrayList<UnidadeFederacao> lstUfs = daoUfs.consultar(UnidadeFederacao.class, null, 0);

        lstTodasCidades = new ArrayList<>();
        for (int i = 0; i < lstUfs.size(); i++) {
            UnidadeFederacao estado = lstUfs.get(i);
            ArrayList<Cidade> lstCid = consultarCidades(estado.getId());
            lstCid.sort(new ComparadorCidade());
            double somaEducacao = 0, somaSaude = 0, somaRenda = 0, somaIfdm = 0;
            for (int j = 0; j < lstCid.size(); j++) {
                Cidade c = lstCid.get(j);
                c.setRankingEstadual(j + 1);
                lstTodasCidades.add(c);
                somaEducacao += c.getEducacao();
                somaSaude += c.getSaude();
                somaRenda += c.getRenda();
                somaIfdm += c.getIfdm();
            }

            estado.setMediaEducacao(somaEducacao / lstCid.size());
            estado.setMediaSaude(somaSaude / lstCid.size());
            estado.setMediaRenda(somaRenda / lstCid.size());
            estado.setMediaIfdm(somaIfdm / lstCid.size());

            daoUfs.atualizar(estado);
        }

        lstTodasCidades.sort(new ComparadorCidade());
        for (int i = 0; i < lstTodasCidades.size(); i++) {
            Cidade c = lstTodasCidades.get(i);
            c.setRankingNacional(i + 1);
            daoCidades.atualizar(c);
        }
    }

    /**
     * Apura os rankings e médias para as unidades federativas e cidades em paralelo.
     * 
     * @throws SQLException se ocorrer um erro durante a atualização
     * @throws ClassNotFoundException se o driver JDBC não for encontrado
     */
    public void apurarRankingsMediasParalelo() throws SQLException, ClassNotFoundException {
        ArrayList<UnidadeFederacao> lstUfs = getLstTodasUFs();

        lstTodasCidades = new ArrayList<>();
        ArrayList<ThreadApurar> lstThreads = new ArrayList<>();
        for (int i = 0; i < lstUfs.size(); i++) {
            UnidadeFederacao estado = lstUfs.get(i);
            ArrayList<Cidade> lstCid = consultarCidades(estado.getId());
            lstTodasCidades.addAll(lstCid);
            ThreadApurar t = new ThreadApurar(estado, lstCid);
            lstThreads.add(t);
        }

        lstTodasCidades.sort(new ComparadorCidade());
        for (int i = 0; i < lstTodasCidades.size(); i++) {
            Cidade c = lstTodasCidades.get(i);
            c.setRankingNacional(i + 1);
        }

        for (int i = 0; i < lstThreads.size(); i++) {
            lstThreads.get(i).start();
        }
    }

    /**
     * Retorna a lista de todas as unidades federativas.
     * 
     * @return uma lista de unidades federativas
     * @throws SQLException se ocorrer um erro durante a consulta
     * @throws ClassNotFoundException se o driver JDBC não for encontrado
     */
    public ArrayList<UnidadeFederacao> getLstTodasUFs() throws SQLException, ClassNotFoundException {
        if (lstTodasUFs == null) {
            lstTodasUFs = daoUfs.consultar(UnidadeFederacao.class, null, 0);
        }
        return lstTodasUFs;
    }

    /**
     * Classe interna para execução paralela de apuração de rankings e médias.
     */
    public class ThreadApurar extends Thread {

        private UnidadeFederacao estado;
        private ArrayList<Cidade> lstCid;

        /**
         * Construtor da classe ThreadApurar.
         * 
         * @param estado a unidade federativa a ser processada
         * @param lstCid a lista de cidades da unidade federativa
         */
        public ThreadApurar(UnidadeFederacao estado, ArrayList<Cidade> lstCid) {
            this.estado = estado;
            this.lstCid = lstCid;
        }

        @Override
        public void run() {
            try {
                lstCid.sort(new ComparadorCidade());
                double somaEducacao = 0, somaSaude = 0, somaRenda = 0, somaIfdm = 0;
                for (int j = 0; j < lstCid.size(); j++) {
                    Cidade c = lstCid.get(j);
                    c.setRankingEstadual(j + 1);
                    lstTodasCidades.add(c);

                    somaEducacao += c.getEducacao();
                    somaSaude += c.getSaude();
                    somaRenda += c.getRenda();
                    somaIfdm += c.getIfdm();

                    daoCidades.atualizar(c);
                }
                estado.setMediaEducacao(somaEducacao / lstCid.size());
                estado.setMediaSaude(somaSaude / lstCid.size());
                estado.setMediaRenda(somaRenda / lstCid.size());
                estado.setMediaIfdm(somaIfdm / lstCid.size());

                daoUfs.atualizar(estado);

            } catch (SQLException ex) {
                Logger.getLogger(AuxiliarIfdm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(AuxiliarIfdm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
