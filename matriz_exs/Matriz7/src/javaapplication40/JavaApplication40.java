/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication40;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class JavaApplication40 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Faça um programa que calcule a soma dos elementos da diagonal principal de uma matriz 4 x 4.
Exemplo da diagonal principal de uma matriz:*/

        Double[][] matriz = new Double[4][4];

        matriz = preenchimentoMatriz(matriz);
        mostrarMatriz(matriz);
        mostrarDiagonalPrincipal(matriz);
    }

    public static Double[][] preenchimentoMatriz(Double[][] matriz) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Preenchimento");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("Digite um número na posicao [%d][%d]: ", i, j);
                Double num = sc.nextDouble();
                matriz[i][j] = num;
            }
        }
        return matriz;
    }

    public static void mostrarMatriz(Double[][] matriz) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Preenchimento");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf(matriz[i][j] + " | ");
            }
            System.out.println("");
        }

    }

    public static void mostrarDiagonalPrincipal(Double[][] matriz) {
        Double valorDiagonal = 0.0;
        System.out.println("Preenchimento");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(i == j){
                    valorDiagonal += matriz[i][j];
                }
            }
        }
        
        System.out.println("Valor Diagonal Principal: " + valorDiagonal);
        

    }
}
