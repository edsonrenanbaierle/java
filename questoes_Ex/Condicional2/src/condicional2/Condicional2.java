/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicional2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Condicional2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Double salario;
        Double valorImposto;
        
        
        System.out.println("Digite o seu sálario para calculos de imposto de renda: ");
        salario = sc.nextDouble();
        
        if(salario < 2000.00){
            System.out.println("ISENTO");
        }else if(salario > 2000.01 && salario < 3000.00){
            valorImposto = (salario - 2000)* 0.08;
            System.out.printf("R$%.2f\n", valorImposto);
        }else if(salario > 3000.01 && salario < 4500.00){
            valorImposto = ((1000 * 0.08) + ((salario - 3000) * 0.18));
            System.out.printf("R$%.2f\n", valorImposto);
        }else{
            valorImposto = ((1000 * 0.08) + (1500 * 0.18) + ((salario - 4500)) * 0.28);
            System.out.printf("R$%.2f\n", valorImposto);
        }
    }
    
}
