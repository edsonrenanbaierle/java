/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

/**
 *
 * @author User
 */
public class BlocoDeNotas extends JFrame implements KeyListener{
    private JTextField textLabel;
    private JTextArea showTextLabel;
    private JButton insertTextButton;
    
    public BlocoDeNotas(){
        super("Teste JTextArea e JTextField");
        
        
        //iniciando controlers
            textLabel = new JTextField(10);
            textLabel.addKeyListener(this);
            
            showTextLabel = new JTextArea();
            
            insertTextButton = new JButton("Inserir: ");
            insertTextButton.addKeyListener(this);
            insertTextButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == insertTextButton){
                    addText();
                }
            }
                
            });
            

        //
        
        //panel flow layout  e add
        JPanel JPButtons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPButtons.add(insertTextButton);
        JPButtons.add(textLabel);
        
        //panel geral
        JPanel JPGeral = new JPanel();
        BoxLayout box = new BoxLayout(JPGeral, BoxLayout.PAGE_AXIS);
        JPGeral.setLayout(box);
        JPGeral.add(showTextLabel);
        JPGeral.add(JPButtons);
        
        this.setContentPane(JPGeral);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
        this.setBounds(600, 600, 700, 300);
        
        // Adicionando atalho de teclado Ctrl + F 
        KeyStroke ctrlF = KeyStroke.getKeyStroke(KeyEvent.VK_F, InputEvent.CTRL_DOWN_MASK);
        getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(ctrlF, "openSearch");
        getRootPane().getActionMap().put("openSearch", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    openPesquisa();
            }
        });
    }
    
    private void openPesquisa(){
        // Lógica para abrir outra janela de pesquisa
        Pesquisa pesquisa = new Pesquisa(showTextLabel);
        pesquisa.setVisible(true);
    }
    
    public void addText(){
            //pega o texto do textField
            String texto = textLabel.getText();
            
            //pega o texto do text area
            String textoArea = showTextLabel.getText();
            
            //confere se no primeiro digito está vazio para não usar o \n
            if(showTextLabel.getText().equals("")){
                showTextLabel.setText(texto);
            }else{
                String juncao = textoArea + "\n" + texto;
                showTextLabel.setText(juncao);
            }
  
            textLabel.setText("");
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_ENTER){
            addText();
        }
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
    
}
