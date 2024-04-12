/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matriz4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Matriz4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Faça um programa que receba dez números inteiros e armazene-os em um vetor. Calcule e mostre dois vetores
    resultantes. O primeiro com os números pares e o segundo com os números ímpares.*/
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<Integer> arrayPar = new ArrayList<>();
        ArrayList<Integer> arrayImpar = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o "  + (1 + i) + " numero inteiro do vetor: ");
            Integer num = sc.nextInt();
            array.add(num);
        }
        
        
        for (int i = 0; i < array.size(); i++) {
            if(array.get(i) % 2 == 1){
                Integer num = array.get(i);
                arrayImpar.add(num);
            }else{
                Integer num = array.get(i);
                arrayPar.add(num);
            }
        }
        
        
        printarArray(arrayImpar);
        printarArray(arrayPar);
    }
    
    public static void printarArray(ArrayList<Integer> array){
        System.out.println("Array");
        for (int i = 0; i < array.size(); i++) {
            System.out.println("Posição [" + (i+1) + "] = " + array.get(i));
        }
    }
    
}