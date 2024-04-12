/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor7;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Vetor7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
        tela todos os números pares, e também a quantidade de números pares. */
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int numbersOfPairs = 0;
        
        int[] vect = new int[n];
        
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }
        
        System.out.println("Numeros Pares: ");
        for (int i = 0; i < vect.length; i++) {
            if(vect[i] % 2 == 0){
                numbersOfPairs++;
                System.out.print(vect[i] + " ");
            }
        }
        
        System.out.println("");
        System.out.println("Quantidade de pares: " + numbersOfPairs);
        
    }  
}
