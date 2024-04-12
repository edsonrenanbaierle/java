/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication33;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class JavaApplication33 {

    /*Faça um programa que leia dois vetores X[10] e Y[10] de inteiros. Crie, a seguir, um vetor U que seja a
    união de X com Y, e um vetor I que seja a sua intersecção. Mostre todos os vetores.*/
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> X = new ArrayList<>();
        ArrayList<Integer> Y = new ArrayList<>();
        ArrayList<Integer> U = new ArrayList<>();
        ArrayList<Integer> I = new ArrayList<>();

        System.out.println("Vetor X");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o valor inteiro na posicao [%d] do vetor: ", i + 1);
            int num = sc.nextInt();
            X.add(num);
        }

        System.out.println("Vetor Y");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o valor inteiro na posicao [%d] do vetor: ", i + 1);
            Integer num = sc.nextInt();
            Y.add(num);
        }

        for (int i = 0; i < 10; i++) {
            Integer numAtual = X.get(i);
            for (int j = 0; j < 10; j++) {
                if (numAtual == Y.get(j)) {
                    if (!I.contains(numAtual)) {
                        I.add(numAtual);
                    }
                }
                
                if (!U.contains(numAtual)) {
                    U.add(numAtual);
                } else if (!U.contains(Y.get(j))) {
                    U.add(Y.get(j));
                }
            }

        }

        System.out.println("Vetor União: ");
        printarVetores(U);
        System.out.println("");
        System.out.println("Vetor Intececao: ");
        printarVetores(I);

    }

    public static void printarVetores(ArrayList<Integer> array) {
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " ");
        }
    }

}
