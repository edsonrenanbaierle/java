package DAL;

import Db.BdConn;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import Model.Atendente;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author User
 */
public class AtendenteDAO {

    private BdConn conn = new BdConn();

    /**
     *
     * @return dados dos atendentes
     */
    public ArrayList<Atendente> consultarTodosAtendentes() {
        ArrayList<Atendente> lstAtendentes = new ArrayList<>();
        try {

            String sql = "SELECT * FROM atendente";
            PreparedStatement st = conn.getConnection().prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Atendente atendente = new Atendente(rs.getInt("id"),
                        rs.getString("nome"));

                lstAtendentes.add(atendente);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Atendente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Atendente.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conn = null;
        }
        return lstAtendentes;
    }
}
