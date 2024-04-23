/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

import javax.swing.JOptionPane;
import view.BlocoDeNotas;

/**
 *
 * @author User
 */
public class Ex41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nameUser = (String)JOptionPane.showInputDialog(null, "Digite o seu nome:", "Pergunta", JOptionPane.QUESTION_MESSAGE, null, null, null);
        
        
        if(nameUser == null){
            JOptionPane.showMessageDialog(null, "O nome não foi digitado, por favor renicie o programa", "Aviso", JOptionPane.WARNING_MESSAGE);
        }else{
            BlocoDeNotas blocoDeNotas = new BlocoDeNotas(nameUser);
            blocoDeNotas.setVisible(true);
        }

    }
    
}
