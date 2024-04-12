/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication51;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class JavaApplication51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Rectangle retangulo = new Rectangle();
        retangulo.height = sc.nextDouble();
        retangulo.widht = sc.nextDouble();
        System.out.println(retangulo.toString());
        
        sc.close();
    }
    
}
