/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAL.ClienteDAO;
import Model.Cliente;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class ClienteController {
    private final ClienteDAO clienteDAO = new ClienteDAO();

    public ArrayList<Cliente> getClientes() {
        return clienteDAO.consultarTodosClientes();
    }
}
