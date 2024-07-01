/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.EnumLivro;
import model.Livro;

public class LivroDAO {

    private Conexao conn = new Conexao();

    public ArrayList<Livro> consultar() {
        ArrayList<Livro> lstLivros = new ArrayList<>();
        try {
            String sql = "SELECT * FROM livro";
            ResultSet rs = conn.consultar(sql);

            while (rs.next()) {
                Livro l = new Livro();
                l.setId(rs.getInt("id"));
                l.setTitulo(rs.getString("titulo"));
                l.setAutor(rs.getString("autor"));
                l.setCategoria(EnumLivro.valueOf(rs.getString("categoria")));
                l.setDataPublicacao(rs.getDate("data_publicacao"));
                lstLivros.add(l);
            }

        } catch (SQLException ex) {
            Logger.getLogger(LivroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lstLivros;
    }

    /**
     * Remove um livro pelo ID.
     *
     * @param id O ID do livro a ser removido.
     */
    public void removerLivro(int id) {
        try {
            String sql = "DELETE FROM livro WHERE id = ?";
            PreparedStatement pstmt = conn.getConnection().prepareStatement(sql);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            System.out.println("Livro removido com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(LivroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void cadastrarLivro(Livro livro) {
        try {
            String sql = "INSERT INTO livro (titulo, autor, categoria, data_publicacao) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = conn.getConnection().prepareStatement(sql);
            pstmt.setString(1, livro.getTitulo());
            pstmt.setString(2, livro.getAutor());
            pstmt.setString(3, livro.getCategoria().toString()); // Se categoria for um enum
            pstmt.setDate(4, new java.sql.Date(livro.getDataPublicacao().getTime()));
            pstmt.executeUpdate();
            System.out.println("Livro cadastrado com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(LivroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
