/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.TitledBorder;

/**
 *
 * @author User
 */
public class Calculator extends JFrame{
    //Standard Definica
    private JButton buttonOne, buttonTwo, buttonThree, buttonFour, buttonFive, buttonSix, buttonSeven;
    private JButton buttonEight, buttonNine, buttonDivisao, buttonMultiplicacao;
    private JButton buttonMenos, buttonMais, buttonZero, buttonPoint, buttonIgualdade;
    
    //Scientific Definicao
    private JButton buttonSqrt, buttonPorcentagem, buttonSin, buttonCos, buttonTan, buttonSec;
    private JButton buttonDivisaoPorOne, buttonPotenciaNa2, buttonPotenciaNa3, buttonExp, buttonLn, buttonFatorial;
    
    //Onde fica os calculos e resultados
    private JTextField calculos;
    
    //Paineis
    private JPanel jpGeral, jpGridScientific, jpGridStandart, jpFlow;
    
    //titulos
    private TitledBorder titleScientific, titleStandart;
    
    //menu 
    private JMenuBar mb = new JMenuBar();
    
    //Array 
    String[] operacoesBasicas = {"*", "/", "-", "+"};
    String[] operacoesStandart = {"*", "/", "-", "+", "1", "2", "3", "4", "5", "6", "7", "8", "9", ".", "0"};
    
    
    
    public Calculator(){
        super("Calculator");
        
        
        //Inicializando Campos Standard
        buttonZero = new JButton("0");
        buttonZero.addActionListener(new ouvinte());
        
        buttonOne = new JButton("1");
        buttonOne.addActionListener(new ouvinte());
        
        buttonTwo = new JButton("2");
        buttonTwo.addActionListener(new ouvinte());
        
        buttonThree = new JButton("3");
        buttonThree.addActionListener(new ouvinte());
        
        buttonFour = new JButton("4");
        buttonFour.addActionListener(new ouvinte());
        
        buttonFive = new JButton("5");
        buttonFive.addActionListener(new ouvinte());
        
        buttonSix = new JButton("6");
        buttonSix.addActionListener(new ouvinte());
        
        buttonSeven = new JButton("7");
        buttonSeven.addActionListener(new ouvinte());
        
        buttonEight = new JButton("8");
        buttonEight.addActionListener(new ouvinte());
        
        buttonNine = new JButton("9");
        buttonNine.addActionListener(new ouvinte());
        
        buttonDivisao = new JButton("/");
        buttonDivisao.addActionListener(new ouvinte());
        
        buttonMultiplicacao = new JButton("*");
        buttonMultiplicacao.addActionListener(new ouvinte());
        
        buttonMenos = new JButton("-");
        buttonMenos.addActionListener(new ouvinte());
        
        buttonMais = new JButton("+");
        buttonMais.addActionListener(new ouvinte());
        
        buttonPoint = new JButton(".");
        buttonPoint.addActionListener(new ouvinte());
        
        buttonIgualdade = new JButton("=");
        buttonIgualdade.addActionListener(new ouvinte());
        
        //inicializando buttons Scientif
        buttonSqrt = new JButton("sqrt");
        buttonSqrt.addActionListener(new ouvinte());
        
        buttonPorcentagem = new JButton("%");
        buttonPorcentagem.addActionListener(new ouvinte());
        
        buttonSin = new JButton("sin");
        buttonSin.addActionListener(new ouvinte());
        
        buttonCos = new JButton("cos");
        buttonCos.addActionListener(new ouvinte());
        
        buttonTan = new JButton("tan");
        buttonTan.addActionListener(new ouvinte());
        
        buttonSec = new JButton("sec");
        buttonSec.addActionListener(new ouvinte());
        
        buttonDivisaoPorOne = new JButton("1/x");
        buttonDivisaoPorOne.addActionListener(new ouvinte());
        
        buttonPotenciaNa2 = new JButton("x^2");
        buttonPotenciaNa2.addActionListener(new ouvinte());
        
        buttonPotenciaNa3 = new JButton("x^3");
        buttonPotenciaNa3.addActionListener(new ouvinte());
        
        buttonExp = new JButton("exp");
        buttonExp.addActionListener(new ouvinte());
        
        buttonLn = new JButton("ln");
        buttonLn.addActionListener(new ouvinte());
        
        buttonFatorial = new JButton("n!");
        buttonFatorial.addActionListener(new ouvinte());
        
        //inicializando text fild
        calculos = new JTextField();
        calculos.setEditable(false);
        
        //inicializando painels que serão usados 
        //geral
        jpGeral = new JPanel();
        jpGeral.setLayout(new BorderLayout());
        
        
        //grid do Standart
        jpGridStandart = new JPanel();
        jpGridStandart.setLayout(new GridLayout(4, 4, 5, 5));
        
        titleStandart = BorderFactory.createTitledBorder("Standart");
        jpGridStandart.setBorder(titleStandart);
        
        //grid do Scientific
        jpGridScientific = new JPanel();
        jpGridScientific.setLayout(new GridLayout(4, 3, 5, 5));
        
        titleScientific = BorderFactory.createTitledBorder("Scientific");
        jpGridScientific.setBorder(titleScientific);
        
        //flow layout onde ficara o Standart e o Scientific
        jpFlow = new JPanel();
        jpFlow.setLayout(new GridLayout(1, 2));
        
        
        
        //adicionando os botoes do Standart
        jpGridStandart.add(buttonSeven);
        jpGridStandart.add(buttonEight);
        jpGridStandart.add(buttonNine);
        jpGridStandart.add(buttonDivisao);
        
        jpGridStandart.add(buttonFour);
        jpGridStandart.add(buttonFive);
        jpGridStandart.add(buttonSix);
        jpGridStandart.add(buttonMultiplicacao);
        
        jpGridStandart.add(buttonOne);
        jpGridStandart.add(buttonTwo);
        jpGridStandart.add(buttonThree);
        jpGridStandart.add(buttonMenos);
        
        jpGridStandart.add(buttonZero);
        jpGridStandart.add(buttonPoint);
        jpGridStandart.add(buttonIgualdade);
        jpGridStandart.add(buttonMais);
        
        //adicionando botoes Scientific 
        jpGridScientific.add(buttonSqrt);
        jpGridScientific.add(buttonDivisaoPorOne);
        jpGridScientific.add(buttonSin);
        
        jpGridScientific.add(buttonPorcentagem);
        jpGridScientific.add(buttonExp);
        jpGridScientific.add(buttonCos);
        
        jpGridScientific.add(buttonPotenciaNa3);
        jpGridScientific.add(buttonLn);
        jpGridScientific.add(buttonTan);
        
        jpGridScientific.add(buttonPotenciaNa2);
        jpGridScientific.add(buttonFatorial);
        jpGridScientific.add(buttonSec);
        
        //adicionando ao flow Layout ambom os Scientific e Standart
        jpFlow.add(jpGridScientific);
        jpFlow.add(jpGridStandart);
        
        //adicionando ao geral o restante
        jpGeral.add(calculos, BorderLayout.PAGE_START);
        jpGeral.add(jpFlow);
        
        //outros  comandos
        this.setContentPane(jpGeral);
        this.setBounds(10, 10, 500, 300);
        this.setLocationRelativeTo(null); // Centraliza a janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //fecha a aplicação
        
        
        //Menu
        JMenu mEdit = new JMenu("Edit");
        JMenu mView = new JMenu("View");
        JMenu mHelp = new JMenu("Help");
        
        mb.add(mEdit);
        mb.add(mView);
        mb.add(mHelp);
        this.setJMenuBar(mb);
        
        
    }
    
    
    //ouvinte (controller)
    public class ouvinte implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton botaoApertado = (JButton) e.getSource();
           
            

                        
            if(e.getSource() == buttonIgualdade && calculos.getText().length() > 0){
                String operando = null;
                for(String operador : operacoesBasicas){
                    if(calculos.getText().contains(operador)){
                        operando = operador;
                        break;
                    }
                }
                
                if(operando == "*"){
                    String result = Model.Ex6.Multiplicacao(calculos.getText());
                    calculos.setText(result);
                }else if(operando == "/"){
                    String result =  Model.Ex6.Divisao(calculos.getText());
                    calculos.setText(result);
                }else if(operando == "+"){
                    String result =  Model.Ex6.Soma(calculos.getText());
                    calculos.setText(result);
                }else if(operando == "-"){
                    String result = Model.Ex6.Menos(calculos.getText());
                    calculos.setText(result);
                }
            }
            
            if(e.getSource() == buttonSqrt && calculos.getText().length() > 0){
                Double result = Model.Ex6.raizQuadrada(Double.parseDouble(calculos.getText()));
                calculos.setText(result.toString());
            }else if(e.getSource() == buttonCos && calculos.getText().length() > 0){
                Double result = Model.Ex6.cos(Double.parseDouble(calculos.getText()));
                calculos.setText(result.toString());
            }else if(e.getSource() == buttonDivisaoPorOne && calculos.getText().length() > 0){
                Double result = Model.Ex6.oneDivisionToX(Double.parseDouble(calculos.getText()));
                calculos.setText(result.toString());
            }else if(e.getSource() == buttonSin && calculos.getText().length() > 0){
                Double result = Model.Ex6.sin(Double.parseDouble(calculos.getText()));
                calculos.setText(result.toString());
            }else if(e.getSource() == buttonPorcentagem && calculos.getText().length() > 0){
                Double result = Model.Ex6.porcentagem(Double.parseDouble(calculos.getText()));
                calculos.setText(result.toString());
            }else if(e.getSource() == buttonExp && calculos.getText().length() > 0){
                Double result = Model.Ex6.exp(Double.parseDouble(calculos.getText()));
                calculos.setText(result.toString());
            }else if(e.getSource() == buttonPotenciaNa3 && calculos.getText().length() > 0){
                Double result = Model.Ex6.elevadoNaThree(Double.parseDouble(calculos.getText()));
                calculos.setText(result.toString());
            }else if(e.getSource() == buttonPotenciaNa2 && calculos.getText().length() > 0){
                Double result = Model.Ex6.elevadoNaTwo(Double.parseDouble(calculos.getText()));
                calculos.setText(result.toString());
            }else if(e.getSource() == buttonLn && calculos.getText().length() > 0){
                Double result = Model.Ex6.ln(Double.parseDouble(calculos.getText()));
                calculos.setText(result.toString());
            }else if(e.getSource() == buttonTan && calculos.getText().length() > 0){
                Double result = Model.Ex6.tan(Double.parseDouble(calculos.getText()));
                calculos.setText(result.toString());
            }else if(e.getSource() == buttonFatorial && calculos.getText().length() > 0){
                Double result = Model.Ex6.fatorial(Double.parseDouble(calculos.getText()));
                calculos.setText(result.toString());
            }else if(e.getSource() == buttonSec && calculos.getText().length() > 0){
                Double result = Model.Ex6.sec(Double.parseDouble(calculos.getText()));
                calculos.setText(result.toString());
            }
            
            for(String operacoes : operacoesStandart){
                if(botaoApertado.getText().contains(operacoes) && !botaoApertado.getText().contains("x^2") && !botaoApertado.getText().contains("x^3") && !botaoApertado.getText().contains("1/x")){
                    calculos.setText(calculos.getText() + botaoApertado.getText());
                }
            }
            
           
        }
        
    }
    
    
}
