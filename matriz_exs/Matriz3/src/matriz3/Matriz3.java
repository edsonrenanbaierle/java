/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Matriz3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*2. Faça um programa que leia um vetor de 15 posições de números inteiros e divida os seus elementos pela média dos
        elementos do vetor. Mostre o vetor após os cálculos.*/
        Scanner sc = new Scanner(System.in);
        ArrayList<Object> numbers = new ArrayList<>();
        int totalValorVetor =0;
        int mediaVetor = 0;
        
        for (int i = 0; i < 15; i++) {
            System.out.println("Digite um número inteiro " + (i+1) + " do vetor: ");
            Integer num = sc.nextInt();
            numbers.add(num);
            totalValorVetor += num; 
        }
        
        mediaVetor = totalValorVetor / numbers.size();
        
        for (int i = 0; i < numbers.size(); i++) {
            numbers.set(i, (Double)numbers.get(i) / mediaVetor);
        }
        
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println("Posição [" + (i+1) + "] valor: " + numbers.get(i));
        }
        
    }
    
}
