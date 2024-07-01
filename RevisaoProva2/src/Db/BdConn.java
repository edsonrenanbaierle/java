/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class BdConn {

    private final String driver = "com.mysql.cj.jdbc.Driver";
    private final String url = "jdbc:mysql://localhost/" + "modelo_prova2";
    private final String usuario = "root";
    private final String senha = "";

    private Connection conexao;

    public BdConn(){
        try {
            Class.forName(driver);//carrega o driver

            //abre a conexão com os parâmetros informados
            conexao = DriverManager.getConnection(url, usuario, senha);

        } catch (SQLException ex) {
            Logger.getLogger(BdConn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(BdConn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Connection getConnection() {
        return conexao;
    }
}
