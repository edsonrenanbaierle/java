/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor12;

import entities.Pessoa;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Vetor12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
        devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
        da pessoa mais velha. */
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantas pessoas voce vai digitar? ");
        Integer n = sc.nextInt();
        String olderPersonName;
        Integer olderPersonAge;
        
        Pessoa[] vectPessoa = new Pessoa[n];
        
        for (int i = 0; i < vectPessoa.length; i++) {
            System.out.println("Dados da pessoa " + (i + 1) + ":");
            sc.nextLine();
            System.out.print("Nome: ");
            String name = sc.nextLine();
            
            System.out.print("Idade: ");
            Integer age = sc.nextInt();
            
            vectPessoa[i] = new Pessoa(name, age);
        }
        
        olderPersonAge = vectPessoa[0].getAge();
        olderPersonName = vectPessoa[0].getName();
        
        for (int i = 0; i < vectPessoa.length; i++) {
            if(olderPersonAge < vectPessoa[i].getAge()){
                olderPersonAge = vectPessoa[i].getAge();
                olderPersonName = vectPessoa[i].getName();
            }
        }
        
        System.out.println("PESSOA MAIS VELHA: " + olderPersonName);
    }
    
}
