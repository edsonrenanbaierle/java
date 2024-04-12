/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Poo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Student estudante = new Student();
        estudante.name = sc.nextLine();
        estudante.firstNote = sc.nextDouble();
        estudante.secondNote = sc.nextDouble();
        estudante.thirdNote = sc.nextDouble();
        
        System.out.println(estudante.toString());
        
        sc.close();
    }
    
}
