/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor5;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Vetor5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
        - Imprimir todos os elementos do vetor
        - Mostrar na tela a soma e a média dos elementos do vetor*/
        
        Scanner sc = new Scanner(System.in);
        int n;
        Double soma = 0.0;
        Double média;
        
        System.out.print("Quantos numeros ira digitar?  ");
        n = sc.nextInt();
        Double[] vect = new Double[n];
        
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero para a posicao " + i + " do vetor: ");
            vect[i] = sc.nextDouble();
        }
        
        System.out.print("Valores: ");
        for (int i = 0; i < vect.length; i++) {
            System.out.print(vect[i] + " ");
            soma += vect[i];
        }
        
        System.out.println("");
        System.out.printf("Soma: %.2f\n", soma);
        System.out.printf("Media: %.2f\n", soma/vect.length);
    }
    
}
