/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor4;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Vetor4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
        e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. 
        */
        Scanner sc = new Scanner(System.in);
        int n;
        
        
        do{
            System.out.print("Quantos numeros ira digitar?  ");
            n = sc.nextInt();
            
            if(n > 10){
                System.out.println("");
                System.out.println("Por Favor digite ate 10!");
                System.out.println("");
            }
        }while(n > 10);
        
        int[] vect = new int[n];
        
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero para a posicao " + i + " do vetor: ");
            vect[i] = sc.nextInt();
        }
        
        System.out.println("Numeros Negativos!");
        for (int i = 0; i < vect.length; i++) {
            if(vect[i] < 0){
                System.out.println(vect[i]);
            }
        }
    }
    
}
