/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz5;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Matriz5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crie um programa para calcular a matriz transposta de uma matriz, fornecida pelo utilizador. Exemplo de matriz
        transposta:
        */
        Scanner sc = new Scanner(System.in);
        int numLinhas, numColunas;
        
        System.out.println("Digite O número de linhas da matriz: ");
        numLinhas = sc.nextInt();
        System.out.println("Digite O número de colunas da matriz: ");
        numColunas = sc.nextInt();
        
        int[][] matriz = new int[numColunas][numLinhas];
        
        for (int i = 0; i < numColunas; i++) {
            for (int j = 0; j < numLinhas; j++) {
                System.out.printf("Digite o número na posição [%d][%d] da matriz: ", i+1, j+1);
                int num = sc.nextInt();
                matriz[i][j] = num;
            }
        }
        
        System.out.println("Matriz transposta!");
         for (int i = 0; i < numColunas; i++) {
            for (int j = 0; j < numLinhas; j++) {
                System.out.print(matriz[i][j] + "");
            }
             System.out.println("");
        }
        
        
    }
    
}
