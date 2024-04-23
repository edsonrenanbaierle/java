/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.GridLayout;
import javax.swing.*;

/**
 *
 * @author User
 */
public class CadDeLivros extends JFrame{
   private JTextField campoId, campoTitulo, campoAuthor, campoCategoria, campoDataLtco; 
   private JLabel labelId, labelTitulo, labelAuthor, labelCategoria, labelDataLtco; 
   private JButton buttonOk, buttonCancelar;
   private JPanel p1 = new JPanel();
   
   public CadDeLivros(){
       super("Cad. de Livros");
       
       //textFields
       campoId = new JTextField();
       campoTitulo = new JTextField();
       campoAuthor = new JTextField();
       campoCategoria = new JTextField();
       campoDataLtco = new JTextField();
       
       //Labels
       labelId = new JLabel("Id:");
       labelId.setHorizontalAlignment(SwingConstants.RIGHT);
       
       labelTitulo = new JLabel("Titulo:");
       labelTitulo.setHorizontalAlignment(SwingConstants.RIGHT);
       
       labelAuthor = new JLabel("Author:");
       labelAuthor.setHorizontalAlignment(SwingConstants.RIGHT);
       
       labelCategoria = new JLabel("Categoria:");
       labelCategoria.setHorizontalAlignment(SwingConstants.RIGHT);
       
       labelDataLtco = new JLabel("Data de Ltco:");
       labelDataLtco.setHorizontalAlignment(SwingConstants.RIGHT);
       
       //buttons
       buttonOk = new JButton("OK");
       buttonCancelar = new JButton("Cancelar");
       
       p1.setLayout(new GridLayout(6, 2, 10, 10));
       
       
       //organização
       p1.add(labelId);
       p1.add(campoId);
       
       p1.add(labelTitulo);
       p1.add(campoTitulo);
       
       p1.add(labelAuthor);
       p1.add(campoAuthor);
       
       p1.add(labelCategoria);
       p1.add(campoCategoria);
       
       p1.add(labelDataLtco);
       p1.add(campoDataLtco);
       
       p1.add(buttonOk);
       p1.add(buttonCancelar);
       
       this.setContentPane(p1);
       this.setBounds(400, 400, 400, 300);
   }
}
