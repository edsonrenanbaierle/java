/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer somaPrincipal = 0;
        Integer somasSecundaria = 0;
        
         Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número de linhas da matriz: ");
        int numLinhas = scanner.nextInt();
        
        System.out.print("Digite o número de colunas da matriz: ");
        int numColunas = scanner.nextInt();
        
        int[][] matriz = new int[numLinhas][numColunas];
        
        for (int i = 0; i < numLinhas; i++) {
            for (int j = 0; j < numColunas; j++) {
                System.out.print("Digite o valor para a posição [" + (i+1) + "][" + (j+1) + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("\nMatriz criada:");
        for (int i = 0; i < numLinhas; i++) {
            for (int j = 0; j < numColunas; j++) {
                System.out.print(matriz[i][j] + " ");
                if(i==j){
                    somaPrincipal += matriz[i][j];
                }
                
                if(i+j == numLinhas - 1){
                    somasSecundaria += matriz[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("Principal " + somaPrincipal);
        System.out.println("Secundaria " + somasSecundaria);
        scanner.close();
    }
    
}
