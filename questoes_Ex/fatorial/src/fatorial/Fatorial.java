/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fatorial;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Fatorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Integer number = sc.nextInt();
        Integer total = 1;
        
        for(int i = number; i > 0; i--){
            total *= i;
        }
        
        System.out.println("Fatorial: " + total);
    }
    
}
