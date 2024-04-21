/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import model.ControleJogoVelha;

/**
 *
 * @author User
 */

public class JogoDaVelha extends JFrame implements ActionListener {

    private JButton novoJogo, button1, button2, button3, button4, button5, button6, button7, button8, button9;
    private JTextArea textAreaInfos;
    private JPanel jpGeral, flowLayoutCenter, gridButtonsLayout;
    private JLabel jogadorX, jogadorO;
    private JRadioButton r1, r2;

    public JogoDaVelha() {
        super("Prova 1 POO 2 tic-tac-toe");

        //flow layout
        novoJogo = new JButton("Novo Jogo");
        novoJogo.addActionListener(this);

        r1 = new JRadioButton();
        r1.setSelected(true);
        r1.setEnabled(false);

        r2 = new JRadioButton();
        r2.setEnabled(false);

        jogadorX = new JLabel("Jogador X");
        jogadorX.setEnabled(false);
        jogadorO = new JLabel("Jogador O");
        jogadorO.setEnabled(false);

        flowLayoutCenter = new JPanel(new FlowLayout(FlowLayout.CENTER));
        flowLayoutCenter.add(novoJogo);
        flowLayoutCenter.add(r1);
        flowLayoutCenter.add(jogadorX);
        flowLayoutCenter.add(r2);
        flowLayoutCenter.add(jogadorO);

        //instanciando botões do grid layout
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

        button9 = new JButton("9");
        button9.addActionListener(this);

        //adicionando botões ao grid layout
        gridButtonsLayout = new JPanel(new GridLayout(3, 3));
        gridButtonsLayout.add(button1);
        gridButtonsLayout.add(button2);
        gridButtonsLayout.add(button3);
        gridButtonsLayout.add(button4);
        gridButtonsLayout.add(button5);
        gridButtonsLayout.add(button6);
        gridButtonsLayout.add(button7);
        gridButtonsLayout.add(button8);
        gridButtonsLayout.add(button9);

        //box layout layou geral, e instanciando JtextArea
        textAreaInfos = new JTextArea();
        textAreaInfos.setRows(5);

        JPanel JPGeral = new JPanel(new BorderLayout());

        //adicionando os layouts criados ao geral
        JPGeral.add(flowLayoutCenter, BorderLayout.PAGE_START);
        JPGeral.add(gridButtonsLayout, BorderLayout.CENTER);
        JPGeral.add(textAreaInfos, BorderLayout.PAGE_END);

        //configurações amais
        this.setContentPane(JPGeral);
        this.setBounds(600, 600, 400, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    
    public void verificarVencedor(){
        char win = controle.avaliaPartida();
        if(win == 'X'){
             textAreaInfos.setText("Vencedor X (" + (controle.getDuracaoPartida() / 1000) + " segundos)");       
        }else if(win == 'O'){
            textAreaInfos.setText("Vencedor O (" + (controle.getDuracaoPartida() / 1000) + " segundos)");       
        }else if(win == 'E'){
            textAreaInfos.setText("Empate (" + (controle.getDuracaoPartida() / 1000) + " segundos)");
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        

        if (e.getSource() == novoJogo) {
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
            controle = new ControleJogoVelha();

            textAreaInfos.setText("Partida em andamento " + (controle.getDuracaoPartida() / 1000) + " segundos");
        }

        if (e.getSource() == button1) {
            if (r1.isSelected()) {
                button1.setText("X");
                textAreaInfos.setText("Partida em andamento " + (controle.getDuracaoPartida() / 1000) + " segundos");
                r1.setSelected(false);
                r2.setSelected(true);
                controle.adicionaMovimento('X', 0);
                verificarVencedor();
            } else {
                button1.setText("O");
                textAreaInfos.setText("Partida em andamento " + (controle.getDuracaoPartida() / 1000) + " segundos");
                r1.setSelected(true);
                r2.setSelected(false);
                controle.adicionaMovimento('O', 0);
                verificarVencedor();
            }
        }

        if (e.getSource() == button2) {
            if (r1.isSelected()) {
                button2.setText("X");
                textAreaInfos.setText("Partida em andamento " + (controle.getDuracaoPartida() / 1000) + " segundos");
                r1.setSelected(false);
                r2.setSelected(true);
                controle.adicionaMovimento('X', 1);
                verificarVencedor();
            } else {
                button2.setText("O");
                textAreaInfos.setText("Partida em andamento " + (controle.getDuracaoPartida() / 1000) + " segundos");
                r1.setSelected(true);
                r2.setSelected(false);
                controle.adicionaMovimento('O', 1);
                verificarVencedor();
            }
        }
        
        if (e.getSource() == button3) {
            if(r1.isSelected()){
                button3.setText("X");
                textAreaInfos.setText("Partida em andamento " + (controle.getDuracaoPartida() / 1000) + " segundos");
                r1.setSelected(false);
                r2.setSelected(true);
                controle.adicionaMovimento('X', 2);
                verificarVencedor();
            }else{
                button3.setText("O");
                textAreaInfos.setText("Partida em andamento " + (controle.getDuracaoPartida() / 1000) + " segundos");
                r1.setSelected(true);
                r2.setSelected(false);
                controle.adicionaMovimento('O', 2);
                verificarVencedor();
            }
        }
        
        if (e.getSource() == button4) {
            if(r1.isSelected()){
                button4.setText("X");
                textAreaInfos.setText("Partida em andamento " + (controle.getDuracaoPartida() / 1000) + " segundos");
                r1.setSelected(false);
                r2.setSelected(true);
                controle.adicionaMovimento('X', 3);
                verificarVencedor();
            }else{
                button4.setText("O");
                textAreaInfos.setText("Partida em andamento " + (controle.getDuracaoPartida() / 1000) + " segundos");
                r1.setSelected(true);
                r2.setSelected(false);
                controle.adicionaMovimento('O', 3);
                verificarVencedor();
            }
        }
        
        if (e.getSource() == button5) {
            if (r1.isSelected()) {
                button5.setText("X");
                textAreaInfos.setText("Partida em andamento " + (controle.getDuracaoPartida() / 1000) + " segundos");
                r1.setSelected(false);
                r2.setSelected(true);
                controle.adicionaMovimento('X', 4);
                verificarVencedor();
            } else {
                button5.setText("O");
                textAreaInfos.setText("Partida em andamento " + (controle.getDuracaoPartida() / 1000) + " segundos");
                r1.setSelected(true);
                r2.setSelected(false);
                controle.adicionaMovimento('O', 4);
                verificarVencedor();
            }
        }
        
        if (e.getSource() == button6) {
            if (r1.isSelected()) {
                button6.setText("X");
                textAreaInfos.setText("Partida em andamento " + (controle.getDuracaoPartida() / 1000) + " segundos");
                r1.setSelected(false);
                r2.setSelected(true);
                controle.adicionaMovimento('X', 5);
                verificarVencedor();
            } else {
                button6.setText("O");
                textAreaInfos.setText("Partida em andamento " + (controle.getDuracaoPartida() / 1000) + " segundos");
                r1.setSelected(true);
                r2.setSelected(false);
                controle.adicionaMovimento('O', 5);
                verificarVencedor();
            }
        }
        
        if (e.getSource() == button7) {
            if (r1.isSelected()) {
                button7.setText("X");
                textAreaInfos.setText("Partida em andamento " + (controle.getDuracaoPartida() / 1000) + " segundos");
                r1.setSelected(false);
                r2.setSelected(true);
                controle.adicionaMovimento('X', 6);
                verificarVencedor();
            } else {
                button7.setText("O");
                textAreaInfos.setText("Partida em andamento " + (controle.getDuracaoPartida() / 1000) + " segundos");
                r1.setSelected(true);
                r2.setSelected(false);
                controle.adicionaMovimento('O', 6);
                verificarVencedor();
            }
        }
        
        if (e.getSource() == button8) {
            if (r1.isSelected()) {
                button8.setText("X");
                textAreaInfos.setText("Partida em andamento " + (controle.getDuracaoPartida() / 1000) + " segundos");
                r1.setSelected(false);
                r2.setSelected(true);
                controle.adicionaMovimento('X', 7);
                verificarVencedor();
            } else {
                button8.setText("O");
                textAreaInfos.setText("Partida em andamento " + (controle.getDuracaoPartida() / 1000) + " segundos");
                r1.setSelected(true);
                r2.setSelected(false);
                controle.adicionaMovimento('O', 7);
                verificarVencedor();
            }
        }
        
        if (e.getSource() == button9) {
            if (r1.isSelected()) {
                button9.setText("X");
                textAreaInfos.setText("Partida em andamento " + (controle.getDuracaoPartida() / 1000) + " segundos");
                r1.setSelected(false);
                r2.setSelected(true);
                controle.adicionaMovimento('X', 8);
                verificarVencedor();
            } else {
                button9.setText("O");
                textAreaInfos.setText("Partida em andamento " + (controle.getDuracaoPartida() / 1000) + " segundos");
                r1.setSelected(true);
                r2.setSelected(false);
                controle.adicionaMovimento('O', 8);
                verificarVencedor();
            }
        }

    }
    static ControleJogoVelha controle = new ControleJogoVelha();

}
