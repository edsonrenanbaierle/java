/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicional1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Condicional1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Double x, y;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor de x: ");
        x = sc.nextDouble();
        
        System.out.println("Digite o valor de y: ");
        y = sc.nextDouble();
        
        if(x > 0 && y > 0){
            System.out.println("Q1");
        }else if(x > 0 && y < 0){
            System.out.println("Q4");
        }else if(x < 0 && y > 0){
            System.out.println("Q2");
        }else if(x < 0 && y < 0){
            System.out.println("Q3");
        }else{
            System.out.println("Origem");
        }
    }
    
}
