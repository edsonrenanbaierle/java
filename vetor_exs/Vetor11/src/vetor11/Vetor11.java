/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor11;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Vetor11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
        aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
        digitado, mostrar a mensagem "NENHUM NUMERO PAR" */
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();
        Integer totalSumNumPairs = 0;
        Integer totalNumPairs = 0;
        
        
        Integer[] vect = new Integer[n];
        
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }
        
        for (int i = 0; i < vect.length; i++) {
            if(vect[i] % 2 == 0){
                totalSumNumPairs += vect[i];
                totalNumPairs ++;
            }
        }
        
        if(totalNumPairs == 0){
            System.out.println("NENHUM NUMERO PAR ENCONTRADO");
        }else{
            System.out.printf("MEDIA DOS PARES: %.1f\n", ((double) totalSumNumPairs/totalNumPairs));
        }

    }
    
}
