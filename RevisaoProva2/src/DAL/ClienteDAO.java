/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Db.BdConn;
import Model.Cliente;
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
public class ClienteDAO {

    private BdConn conn = new BdConn();

    /**
     *
     * @return dados dos clientes
     */
    public ArrayList<Cliente> consultarTodosClientes() {
        ArrayList<Cliente> lstCliente = new ArrayList<>();
        try {

            String sql = "SELECT * FROM cliente";
            PreparedStatement st = conn.getConnection().prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Cliente cliente = new Cliente(rs.getInt("id"),
                        rs.getString("nome"));

                lstCliente.add(cliente);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            conn = null;
        }
        return lstCliente;
    }
}
