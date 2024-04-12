/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor8;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Vetor8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
        o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
        considerando a primeira posição como 0 (zero).*/
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int greatestValue;
        int positionGreatestValue = 0;
        
        int[] vect = new int[n];
        
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }
        
        greatestValue = vect[0];
        for (int i = 0; i < vect.length; i++) {
            if(greatestValue < vect[i]){
                greatestValue = vect[i];
                positionGreatestValue = i;
            }
        }
        
        System.out.println("MAIOR VALOR: " + greatestValue);
        System.out.println("POSICAO DO MAIOR VALOR: " + positionGreatestValue);
    }
    
}
