/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor10;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Vetor10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
        mostrar na tela a média aritmética de todos elementos com três casas decimais. Depois mostrar todos
        os elementos do vetor que estejam abaixo da média, com uma casa decimal cada. */
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        Double totalSum = 0.0;
        
        Double[] vect = new Double[n];
        
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }
        
        for (int i = 0; i < vect.length; i++) {
            totalSum += vect[i];
        }
            
        System.out.printf("MEDIA DO VETOR: %.3f\n", totalSum/vect.length);
        System.out.println("ELEMENTOS ABAIXO DA MEIDA");
        for (int i = 0; i < vect.length; i++) {
            if(vect[i] < totalSum/vect.length){
                System.out.println(vect[i]);
            }
        }
    }
    
}
