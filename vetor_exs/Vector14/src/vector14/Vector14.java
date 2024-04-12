/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vector14;

import entities.Aluno;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Vector14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How many rooms will be rented? ");
        Integer numQuartos = sc.nextInt();
        
        Aluno[] vectQuartos = new Aluno[10];
        
        for (int i = 0; i < numQuartos; i++) { 
            System.out.println("");
            System.out.println("Rent #" + (i + 1) + ":");
            sc.nextLine();
            
            System.out.print("Name: ");
            String name = sc.nextLine();
            
            System.out.print("Email: ");
            String email = sc.nextLine();
            
            System.out.print("Room: ");
            Integer room = sc.nextInt();
            
            vectQuartos[room] = new Aluno(name, email);
        }
        
        System.out.println("");
        System.out.println("Busy Rooms: ");
        for (int i = 0; i < vectQuartos.length; i++) {
            if(vectQuartos[i] != null){
                System.out.println(i + ": " + vectQuartos[i].getName() + ", " + vectQuartos[i].getEmail());
            }
        }
    }
    
}
