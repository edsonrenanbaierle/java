/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex07;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ex07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Integer num = sc.nextInt();
        
        for(int i = 1; i <= num; i++){
            System.out.print(i + " ");
            System.out.print(Math.pow(i, 2) + " ");
            System.out.print(Math.pow(i, 3) + " \n");
        }
    }
    
}
