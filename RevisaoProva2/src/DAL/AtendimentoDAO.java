/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Db.BdConn;
import Model.Atendimento;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class AtendimentoDAO {

    private BdConn conn = new BdConn();

    /**
     * @param idCliente parassado por parametro o id do cliente para ver suas
     * consultas
     * @return dados dos atendentes
     */
    public ArrayList<Atendimento> consultarAtendimentoEspecifico(Integer idCliente) {
        ArrayList<Atendimento> lstAtendendimento = new ArrayList<>();
        try {

            String sql = "SELECT * FROM atendimento as at JOIN atendente ON atendente.id = at.atendente_id  WHERE cliente_id = ?";
            PreparedStatement st = conn.getConnection().prepareStatement(sql);
            st.setInt(1, idCliente);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Atendimento atendimento = new Atendimento(rs.getInt("id"),
                        rs.getInt("cliente_id"),
                        rs.getInt("atendente_id"),
                        rs.getString("descricao"),
                        rs.getString("nome"));

                lstAtendendimento.add(atendimento);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Atendimento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Atendimento.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conn = null;
        }
        return lstAtendendimento;
    }

    public void cadastrarAtendimento(Atendimento atendimento) {
        try {
            String sql = "INSERT INTO atendimento (cliente_id, atendente_id, descricao)"
                    + "VALUES (?, ?, ?)";

            PreparedStatement psmt = conn.getConnection().prepareStatement(sql);
            psmt.setInt(1, atendimento.getCliente_id());
            psmt.setInt(2, atendimento.getAtendente_id());
            psmt.setString(3, atendimento.getDescricao());
            psmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Atendimento.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Atendimento.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conn = null;
        }
    }
}
