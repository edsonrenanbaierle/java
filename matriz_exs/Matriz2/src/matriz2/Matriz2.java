/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Matriz2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*1. Faça um programa que leia um vetor V contendo 18 elementos. A seguir, distribua esses elementos em uma matriz
        3x6. Ao final, mostre a matriz gerada. Veja a seguir um exemplo do que o seu programa deve fazer:
        */
        ArrayList<Integer> numbers = new ArrayList<>();
        int[][] matriz = new int[3][6];
        int indice = 0;
        
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 18; i++) {
            System.out.println("Digite o " + (i+1) + " número: ");
            Integer num = sc.nextInt();
            numbers.add(num);
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                matriz[i][j] = numbers.get(indice);
                indice++;
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(matriz[i][j] + " ");  
            }
            System.out.println("");
        }
        
        sc.close();
    }
    
}
