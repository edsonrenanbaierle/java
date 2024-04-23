/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import model.ControleJogoVelha;

/**
 *
 * @author User
 */
public class viewJogoDaVelha extends JFrame implements ActionListener{
    private JButton buttonNovoJogo, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    private JLabel jogadorX, jogadorO;
    private JTextArea textArea;
    private JRadioButton r1, r2;
    private JPanel jpGeral, jpFlow, jpGrid;
    
    public viewJogoDaVelha(){
        super("Prova 1 Java avançao");
        
        //instanciando componentes e elemenotos do flow layout
        jpFlow = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        buttonNovoJogo = new JButton("Novo Jogo");
        buttonNovoJogo.addActionListener(this);
        
        r1 = new JRadioButton();
        r1.setEnabled(false);
        r1.setSelected(true);
        
        r2 = new JRadioButton();
        r2.setEnabled(false);
        
        jogadorX = new JLabel("jogadorX");
        jogadorX.setEnabled(false);
        
        jogadorO = new JLabel("jogadorO");
        jogadorO.setEnabled(false);
        
        jpFlow.add(buttonNovoJogo);
        jpFlow.add(r1);
        jpFlow.add(jogadorX);
        jpFlow.add(r2);
        jpFlow.add(jogadorO);
        
        
        //grid Layout do jogo da velha
        jpGrid = new JPanel(new GridLayout(3, 3));
        
        button1 = new JButton("1");
        button1.addActionListener(this);
        
        button2 = new JButton("2");
        button2.addActionListener(this);
        
        button3 = new JButton("3");
        button3.addActionListener(this);
        
        button4 = new JButton("4");
        button4.addActionListener(this);
        
        button5 = new JButton("5");
        button5.addActionListener(this);
        
        button6 = new JButton("6");
        button6.addActionListener(this);
        
        button7 = new JButton("7");
        button7.addActionListener(this);
        
        button8 = new JButton("8");
        button8.addActionListener(this);
        
        button9 = new JButton("3");
        button9.addActionListener(this);
        
        jpGrid.add(button1);
        jpGrid.add(button2);
        jpGrid.add(button3);
        jpGrid.add(button4);
        jpGrid.add(button5);
        jpGrid.add(button6);
        jpGrid.add(button7);
        jpGrid.add(button8);
        jpGrid.add(button9);
        
        //inicianlizando o text area
        textArea = new JTextArea();
        textArea.setRows(5);
        
        //panel geral
        jpGeral = new JPanel(new BorderLayout());
        jpGeral.add(jpFlow, BorderLayout.PAGE_START);
        jpGeral.add(jpGrid, BorderLayout.CENTER);
        jpGeral.add(textArea, BorderLayout.PAGE_END);
        
        
        //configurações gerais
        this.setContentPane(jpGeral);
        this.setBounds(600, 600, 400, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    //funcao no qual vera o andamento da partida e colocara o text area como está
    public void avaliarPartida(){
        char resposta = controle.avaliaPartida();
        
        if(resposta == 'X'){
            textArea.setText("Ganhador X (" + (controle.getDuracaoPartida()/1000) + "segundos)");
        }else if(resposta == 'O'){
            textArea.setText("Ganhador O (" + (controle.getDuracaoPartida()/1000) + "segundos)");
        }else if(resposta == 'E'){
            textArea.setText("Empate (" + (controle.getDuracaoPartida()/1000) + "segundos)");
        }else{
            textArea.setText("Partida em andamento (" + (controle.getDuracaoPartida()/1000) + " segundos)");
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        //evento no notão novo jogo no qual fara o reset do jogo
        if(e.getSource() == buttonNovoJogo){
            controle.iniciaPartida();
            button1.setText("1");
            button2.setText("2");
            button3.setText("3");
            button4.setText("4");
            button5.setText("5");
            button6.setText("6");
            button7.setText("7");
            button8.setText("8");
            button9.setText("9");
            
            r1.setSelected(true);
            r2.setSelected(false);
            
            textArea.setText("");
        }
        
        
        //adicionando eventos nos botões 1 ao 9
        if(e.getSource() == button1){
            if(r1.isSelected()){
                button1.setText("X");
                controle.adicionaMovimento('X', 0);
                avaliarPartida();
                r2.setSelected(true);
                r1.setSelected(false);
            }else{
                button1.setText("O");
                controle.adicionaMovimento('O', 0);
                avaliarPartida();
                r2.setSelected(false);
                r1.setSelected(true);
            }
        }
        
        if(e.getSource() == button2){
            if(r1.isSelected()){
                button2.setText("X");
                controle.adicionaMovimento('X', 1);
                avaliarPartida();
                r2.setSelected(true);
                r1.setSelected(false);
            }else{
                button2.setText("O");
                controle.adicionaMovimento('O', 1);
                avaliarPartida();
                r2.setSelected(false);
                r1.setSelected(true);
            }
        }
        
        if(e.getSource() == button3){
            if(r1.isSelected()){
                button3.setText("X");
                controle.adicionaMovimento('X', 2);
                avaliarPartida();
                r2.setSelected(true);
                r1.setSelected(false);
            }else{
                button3.setText("O");
                controle.adicionaMovimento('O', 2);
                avaliarPartida();
                r2.setSelected(false);
                r1.setSelected(true);
            }
        }
        
        if(e.getSource() == button4){
            if(r1.isSelected()){
                button4.setText("X");
                controle.adicionaMovimento('X', 3);
                avaliarPartida();
                r2.setSelected(true);
                r1.setSelected(false);
            }else{
                button4.setText("O");
                controle.adicionaMovimento('O', 3);
                avaliarPartida();
                r2.setSelected(false);
                r1.setSelected(true);
            }
        }
        
        if(e.getSource() == button5){
            if(r1.isSelected()){
                button5.setText("X");
                controle.adicionaMovimento('X', 4);
                avaliarPartida();
                r2.setSelected(true);
                r1.setSelected(false);
            }else{
                button5.setText("O");
                controle.adicionaMovimento('O', 4);
                avaliarPartida();
                r2.setSelected(false);
                r1.setSelected(true);
            }
        }
        
        if(e.getSource() == button6){
            if(r1.isSelected()){
                button6.setText("X");
                controle.adicionaMovimento('X', 5);
                avaliarPartida();
                r2.setSelected(true);
                r1.setSelected(false);
            }else{
                button6.setText("O");
                controle.adicionaMovimento('O', 5);
                avaliarPartida();
                r2.setSelected(false);
                r1.setSelected(true);
            }
        }
        
        if(e.getSource() == button7){
            if(r1.isSelected()){
                button7.setText("X");
                controle.adicionaMovimento('X', 6);
                avaliarPartida();
                r2.setSelected(true);
                r1.setSelected(false);
            }else{
                button7.setText("O");
                controle.adicionaMovimento('O', 6);
                avaliarPartida();
                r2.setSelected(false);
                r1.setSelected(true);
            }
        }
        
        if(e.getSource() == button8){
            if(r1.isSelected()){
                button8.setText("X");
                controle.adicionaMovimento('X', 7);
                avaliarPartida();
                r2.setSelected(true);
                r1.setSelected(false);
            }else{
                button8.setText("O");
                controle.adicionaMovimento('O', 7);
                avaliarPartida();
                r2.setSelected(false);
                r1.setSelected(true);
            }
        }
        
        if(e.getSource() == button9){
            if(r1.isSelected()){
                button9.setText("X");
                controle.adicionaMovimento('X', 8);
                avaliarPartida();
                r2.setSelected(true);
                r1.setSelected(false);
            }else{
                button9.setText("O");
                controle.adicionaMovimento('O', 8);
                avaliarPartida();
                r2.setSelected(false);
                r1.setSelected(true);
            }
        }
        
    }
    
    static ControleJogoVelha controle = new ControleJogoVelha();
}
