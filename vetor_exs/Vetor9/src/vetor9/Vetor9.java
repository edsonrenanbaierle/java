/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor9;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Vetor9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
        terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
        o vetor C gerado. */
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();
        
        int[] vectA = new int[n];
        int[] vectB = new int[n];
        int[] vectC = new int[n];
        
        System.out.println("DIGITE OS VALORES DE A!");
        for (int i = 0; i < vectA.length; i++) {
            System.out.print("Digite um numero: ");
            vectA[i] = sc.nextInt();
        }
        
        System.out.println("DIGITE OS VALORES DE B!");
        for (int i = 0; i < vectB.length; i++) {
            System.out.print("Digite um numero: ");
            vectB[i] = sc.nextInt();
        }
        
        System.out.println("DIGITE OS VALORES DE B!");
        for (int i = 0; i < vectC.length; i++) {
            vectC[i] = vectA[i] + vectB[i];
        }
        
        System.out.println("VETOR RESULTANTE");
        for (int i = 0; i < vectC.length; i++) {
            System.out.println(vectC[i]);
        }
    }
    
}
