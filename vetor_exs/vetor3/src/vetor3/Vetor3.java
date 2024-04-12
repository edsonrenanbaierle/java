/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Vetor3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*5. Escreva um programa que leia um vetor V[20] de inteiros. Compacte, a seguir, este vetor, retirando dele
        todos os valores nulos ou negativos e escreva o vetor compactado. Compacte o vetor ainda mais, retirando
        agora os elementos em duplicata. Escreva o vetor final.*/
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Integer> arrayInteiros = new ArrayList<>();
        
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite o " + (i + 1) + " valor do array(inteiros): ");
            Integer num = sc.nextInt();
            arrayInteiros.add(num);
        }
        
        System.out.println("Compactação 1: ");
        arrayInteiros = CompactacaoOne(arrayInteiros);
        printarArray(arrayInteiros);
        System.out.println("Compactação 2: ");
        arrayInteiros = CompactacaoTwo(arrayInteiros);
        printarArray(arrayInteiros);
    }
    
    public static ArrayList<Integer> CompactacaoOne(ArrayList<Integer> array){
        for (int i = 0; i < array.size(); i++) {
            if(array.get(i) == null || array.get(i) < 0){
                array.remove(i);
                i = 0;
            }
        }
        
        
      return array;
    }
    
    public static ArrayList<Integer> CompactacaoTwo(ArrayList<Integer> array){
        for (int i = 0; i < array.size(); i++) {
            for (int j = 0; j < array.size() -1; j++) {
                if(array.get(i) == array.get(j + 1)){
                    array.remove(j+1);
                    i = 0;
                }
            }
        }
        
        
      return array;
    }
    
    public static void printarArray(ArrayList<Integer> array){
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " ");
        }   
    }
}
