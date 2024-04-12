/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication39;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class JavaApplication39 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crie um programa para calcular a matriz transposta de uma matriz, fornecida pelo utilizador. Exemplo de matriz
        transposta:
        */
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Matriz transposta");
        System.out.println("Digite o número de linhas da matriz q deseja transpostar: ");
        int linhas = sc.nextInt();
        System.out.println("Digite o número de colunas da matriz q deseja transpostar: ");
        int colunas = sc.nextInt();
        
        Double[][] matriz= new Double[linhas][colunas];
        
        matriz = preenchimento(linhas, colunas);
        
        matrizTransposta(matriz, linhas, colunas);
    }
    
    public static void matrizTransposta(Double[][]matriz, int linhas, int colunas){
        System.out.println("Matriz Digitada");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("Matriz Transposta ");
        for (int j = 0; j < colunas; j++) {
            for (int i = 0; i < linhas; i++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    public static Double[][] preenchimento(int linhas, int colunas){
        Double[][] matriz2 = new Double[linhas][colunas];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.printf("Digite o valor na posicao [%d] [%d]:  ", i, j);
                Double num = sc.nextDouble();
                matriz2[i][j] = num;
            }
        }
        
       
        return matriz2;
    }
}
