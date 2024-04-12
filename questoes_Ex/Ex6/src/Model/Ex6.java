/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Model;

import View.Calculator;

/**
 *
 * @author User
 */
public class Ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculator calculadora = new Calculator();
        calculadora.setVisible(true);
        
        
        
        
    }
    public static String Soma(String conta){
        String[] nova = conta.split("\\+");
        Double n1 = Double.parseDouble(nova[0]);
        Double n2 = Double.parseDouble(nova[1]);
        
        Double soma = n1 + n2;
        
        return soma.toString();
    }
    
    public static String Menos(String conta){
        
        String[] nova = conta.split("\\-");
        Double n1 = Double.parseDouble(nova[0]);
        Double n2 = Double.parseDouble(nova[1]);
        
        Double soma = n1 - n2;
        
        return soma.toString();
    }
    
    public static String Multiplicacao(String conta){
        
        String[] nova = conta.split("\\*");
        Double n1 = Double.parseDouble(nova[0]);
        Double n2 = Double.parseDouble(nova[1]);
        
        Double soma = n1 * n2;
        
        return soma.toString();
    }
    
    public static String Divisao(String conta){
        
       String[] nova = conta.split("\\/");
        Double n1 = Double.parseDouble(nova[0]);
        Double n2 = Double.parseDouble(nova[1]);
        
        Double soma = n1 / n2;
        
        return soma.toString();
    }
    
    public static Double raizQuadrada(double number){
        return Math.sqrt(number);
    }
    
     public static Double oneDivisionToX(double number){
        return 1/number;
    }
     
    public static Double sin(double number){
        return Math.sin(number);
    }
    
    public static Double cos(double number){
        return Math.cos(number);
    }
    
    public static Double tan(double number){
        return Math.tan(number);
    }
    
    public static Double sec(double number){
        Double cos = Math.cos(number);
        
        return 1/cos;
    }
    
    public static Double porcentagem(double number){
        return number/100;
    }
    
    public static Double elevadoNaThree(double number){
        return Math.pow(number, 3);
    }
    
    public static Double elevadoNaTwo(double number){
        return Math.pow(number, 2);
    }
    
    public static Double exp(double number){
        return Math.exp(number);
    }
    
    public static Double ln(double number){
        return Math.log(number);
    }
    
    public static Double fatorial(double number){
        Double valor = 1.0;
        System.out.println(number);
        for (Double i = number; i > 0; i--) {
            valor = valor * i;
        }
        
        return valor;
    }
}
