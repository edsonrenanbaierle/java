/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.util.ArrayList;
import DAL.AtendenteDAO;
import Model.Atendente;

/**
 *
 * @author User
 */
public class AtendenteController {
    private final AtendenteDAO atendenteDAO = new AtendenteDAO();

    public ArrayList<Atendente> getAtendentes() {
        return atendenteDAO.consultarTodosAtendentes();
    }
}
