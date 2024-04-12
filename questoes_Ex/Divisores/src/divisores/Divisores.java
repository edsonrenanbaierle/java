/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package divisores;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Divisores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int number = sc.nextInt();
        
        for(int i = 1; i<=number; i++){
            if(number % i == 0){
                System.out.println(i);
            }
        }
    }
    
}
