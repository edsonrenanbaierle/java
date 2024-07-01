package dal;

import java.sql.*;

/**
 * Esta classe gerencia a conexão com um banco de dados MySQL.
 * Ela fornece métodos para abrir e fechar a conexão,
 * e para preparar instruções SQL.
 * 
 * Autor: Edson Baierle
 */
public class Conexao {
    // Driver JDBC para MySQL
    private final String driver = "com.mysql.cj.jdbc.Driver";
    // URL do banco de dados, incluindo o nome do banco de dados "ifdm"
    private final String url = "jdbc:mysql://localhost/ifdm";
    // Nome de usuário para o banco de dados
    private final String usuario = "root";
    // Senha para o banco de dados (vazia neste caso)
    private final String senha = "root";
    // Objeto Connection para gerenciar a conexão com o banco de dados
    private final Connection conexao;    
    
    /**
     * Construtor da classe Conexao.
     * Carrega o driver JDBC e estabelece a conexão com o banco de dados.
     * 
     * @throws ClassNotFoundException se o driver JDBC não for encontrado
     * @throws SQLException se ocorrer um erro ao estabelecer a conexão
     */
    public Conexao() throws ClassNotFoundException, SQLException {
        // Carrega o driver JDBC
        Class.forName(driver);
        // Estabelece a conexão com o banco de dados
        conexao = DriverManager.getConnection(url, usuario, senha);
    }
    
    /**
     * Prepara uma instrução SQL para execução.
     * 
     * @param sql a instrução SQL a ser preparada
     * @return um objeto PreparedStatement
     * @throws SQLException se ocorrer um erro ao preparar a instrução
     */
    public PreparedStatement prepareStatement(String sql) throws SQLException {
        return conexao.prepareStatement(sql);
    }
    
    /**
     * Obtém a conexão com o banco de dados.
     * 
     * @return um objeto Connection
     */
    public Connection getConexao() {
        return conexao;
    }
    
    /**
     * Fecha a conexão com o banco de dados.
     * 
     * @throws SQLException se ocorrer um erro ao fechar a conexão
     */
    public void fechar() throws SQLException {
        conexao.close();
    }
}
