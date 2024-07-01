package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.*;

/**
 * Esta classe gerencia as operações de banco de dados (DAO) para diferentes tipos de objetos.
 * 
 * Autor: Edson Baierle
 */
public class DAO<T> {
    private Conexao conn;

    /**
     * Construtor da classe DAO.
     * Inicializa uma nova conexão com o banco de dados.
     * 
     * @throws ClassNotFoundException se o driver JDBC não for encontrado
     * @throws SQLException se ocorrer um erro ao estabelecer a conexão
     */
    public DAO() throws ClassNotFoundException, SQLException {
        conn = new Conexao();
    }   

    /**
     * Insere um objeto no banco de dados.
     * 
     * @param obj o objeto a ser inserido
     * @throws SQLException se ocorrer um erro durante a inserção
     * @throws ClassNotFoundException se o driver JDBC não for encontrado
     */
    public void inserir(T obj) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO";
        PreparedStatement st;
        if (obj instanceof Cidade) {
            sql += " cidade (uf_id, descricao, ifdm, saude, educacao, renda, ranking_estadual, ranking_nacional) VALUES (?,?,?,?,?,?,?,?)";
            Cidade c = (Cidade) obj;

            st = conn.prepareStatement(sql);
            st.setInt(1, c.getUf());
            st.setString(2, c.getDescricao());
            st.setDouble(3, c.getIfdm());
            st.setDouble(4, c.getSaude());
            st.setDouble(5, c.getEducacao());
            st.setDouble(6, c.getRenda());
            st.setInt(7, c.getRankingEstadual());
            st.setInt(8, c.getRankingNacional());
        } else if (obj instanceof UnidadeFederacao) {
            sql += " unidade_federacao (uf, descricao, media_saude, media_educacao, media_renda, media_ifdm) VALUES (?,?,?,?,?,?)";

            UnidadeFederacao u = (UnidadeFederacao) obj;
            st = conn.prepareStatement(sql);
            st.setString(1, u.getUf());
            st.setString(2, u.getDescricao());
            st.setDouble(3, u.getMediaSaude());
            st.setDouble(4, u.getMediaEducacao());
            st.setDouble(5, u.getMediaRenda());
            st.setDouble(6, u.getMediaIfdm());
        } else {
            throw new IllegalArgumentException("Esta classe não possui tratamento para inserir no BD");
        }

        st.executeUpdate();
        st.close();
    }

    /**
     * Exclui um objeto do banco de dados.
     * 
     * @param obj o objeto a ser excluído
     * @throws SQLException se ocorrer um erro durante a exclusão
     * @throws ClassNotFoundException se o driver JDBC não for encontrado
     */
    public void excluir(T obj) throws SQLException, ClassNotFoundException {
        String sql = "DELETE FROM";
        PreparedStatement st;
        if (obj instanceof Cidade) {
            sql += " cidade WHERE id=?";
            Cidade c = (Cidade) obj;

            st = conn.prepareStatement(sql);
            st.setInt(1, c.getId());
        } else if (obj instanceof UnidadeFederacao) {
            sql += " unidade_federacao WHERE uf=?";

            UnidadeFederacao u = (UnidadeFederacao) obj;
            st = conn.prepareStatement(sql);
            st.setString(1, u.getUf());
        } else {
            throw new IllegalArgumentException("Esta classe não possui tratamento para excluir no BD");
        }

        st.executeUpdate();
        st.close();
    }

    /**
     * Atualiza um objeto no banco de dados.
     * 
     * @param obj o objeto a ser atualizado
     * @throws SQLException se ocorrer um erro durante a atualização
     * @throws ClassNotFoundException se o driver JDBC não for encontrado
     */
    public void atualizar(T obj) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE";
        PreparedStatement st;
        if (obj instanceof Cidade) {
            sql += " cidade SET uf_id=?, descricao=?, ifdm=?, saude=?, educacao=?, renda=?, ranking_estadual=?, ranking_nacional=? WHERE id=?";
            Cidade c = (Cidade) obj;

            st = conn.prepareStatement(sql);
            st.setInt(1, c.getUf());
            st.setString(2, c.getDescricao());
            st.setDouble(3, c.getIfdm());
            st.setDouble(4, c.getSaude());
            st.setDouble(5, c.getEducacao());
            st.setDouble(6, c.getRenda());
            st.setInt(7, c.getRankingEstadual());
            st.setInt(8, c.getRankingNacional());
            st.setInt(9, c.getId());
        } else if (obj instanceof UnidadeFederacao) {
            sql += " unidade_federacao SET descricao=?, media_saude=?, media_educacao=?, media_renda=?, media_ifdm=? WHERE uf=?";

            UnidadeFederacao u = (UnidadeFederacao) obj;
            st = conn.prepareStatement(sql);
            st.setString(1, u.getDescricao());
            st.setDouble(2, u.getMediaSaude());
            st.setDouble(3, u.getMediaEducacao());
            st.setDouble(4, u.getMediaRenda());
            st.setDouble(5, u.getMediaIfdm());
            st.setString(6, u.getUf());
        } else {
            throw new IllegalArgumentException("Esta classe não possui tratamento para atualizar no BD");
        }

        st.executeUpdate();
        st.close();
    }

    /**
     * Consulta objetos no banco de dados com base na classe, uf e id fornecidos.
     * 
     * @param classe a classe do objeto a ser consultado
     * @param uf a unidade federativa a ser consultada (pode ser nula)
     * @param id o identificador do objeto a ser consultado
     * @return uma lista de objetos do tipo T
     * @throws SQLException se ocorrer um erro durante a consulta
     * @throws ClassNotFoundException se o driver JDBC não for encontrado
     */
    public ArrayList<T> consultar(Class classe, String uf, int id) throws SQLException, ClassNotFoundException {
        Conexao conn = new Conexao();
        ArrayList<T> ret = new ArrayList<>();
        String sql = "SELECT * FROM";

        PreparedStatement st;
        ResultSet rs;

        if (classe == Cidade.class) {
            sql += " cidade WHERE uf_id=?";
            st = conn.prepareStatement(sql);
            st.setInt(1, id);
            rs = st.executeQuery();
            while (rs.next()) {
                Cidade cid = new Cidade();
                cid.setId(rs.getInt("id"));
                cid.setUf(rs.getInt("uf_id"));
                cid.setDescricao(rs.getString("descricao"));
                cid.setSaude(rs.getDouble("saude"));
                cid.setEducacao(rs.getDouble("educacao"));
                cid.setRenda(rs.getDouble("renda"));
                cid.setIfdm(rs.getDouble("ifdm"));
                cid.setRankingEstadual(rs.getInt("ranking_estadual"));
                cid.setRankingNacional(rs.getInt("ranking_nacional"));

                ret.add((T) cid);
            }
        } else if (classe == UnidadeFederacao.class) { 
            if (uf == null) {
                sql += " unidade_federacao";
                st = conn.prepareStatement(sql);
            } else {
                sql += " unidade_federacao WHERE uf=?";
                st = conn.prepareStatement(sql);
                st.setString(1, uf);
            }

            rs = st.executeQuery();
            while (rs.next()) {
                UnidadeFederacao u = new UnidadeFederacao();
                u.setId(rs.getInt("id"));
                u.setUf(rs.getString("uf"));
                u.setDescricao(rs.getString("descricao"));
                u.setMediaEducacao(rs.getDouble("media_educacao"));
                u.setMediaSaude(rs.getDouble("media_saude"));
                u.setMediaRenda(rs.getDouble("media_renda"));
                u.setMediaIfdm(rs.getDouble("media_ifdm"));

                ret.add((T) u);
            }
        } else {
            throw new IllegalArgumentException("Esta classe não possui tratamento para consultar no BD");
        }

        rs.close();
        st.close();
        conn.fechar();
        return ret;
    }   
}
