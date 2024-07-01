/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;


import Model.Atendimento;
import java.util.ArrayList;
import DAL.AtendimentoDAO;

/**
 *
 * @author User
 */
public class AtendimentoController {
    private final AtendimentoDAO atendimentoDAO = new AtendimentoDAO();

    public ArrayList<Atendimento> getAtendimentoCliente(Integer idCliente) {
        return atendimentoDAO.consultarAtendimentoEspecifico(idCliente);
    }
    
    public boolean cadastrarAtendimento(Atendimento atendimento) {
        try {
            atendimentoDAO.cadastrarAtendimento(atendimento);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
