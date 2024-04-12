/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor6;

import entities.Pessoa;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Vetor6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
        tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
        bem como os nomes dessas pessoas caso houver. */
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos pessoas serao digitar?  ");
        int n = sc.nextInt();
        Double totalHeight = 0.0;
        int under16YearsOld = 0;
        
        
        Pessoa[] vectPessoa = new Pessoa[n];
        
        for (int i = 0; i < vectPessoa.length; i++) {
            System.out.println("Dados da pessoa " + (i+1) + ":");
            
            System.out.print("Nome: ");
            sc.nextLine();
            String name = sc.nextLine();
            
            System.out.print("Idade: ");
            Integer age = sc.nextInt();
            
            System.out.print("Altura: ");
            Double height = sc.nextDouble();
            
            vectPessoa[i] = new Pessoa(name, age, height);
            System.out.println("");
        }
        
        for (int i = 0; i < vectPessoa.length; i++) {
            totalHeight += vectPessoa[i].getAltura();
            if(vectPessoa[i].getIdade() < 16){
                under16YearsOld += 1;
            }
        }
        
        System.out.printf("Altura Media: %.2f\n", totalHeight/vectPessoa.length);
        System.out.println("Pessoas com menos de 16 anos: " + String.format("%.2f", ((double) under16YearsOld / vectPessoa.length * 100)) + "%");

        
        if(under16YearsOld > 0){
            for (int i = 0; i < vectPessoa.length; i++) {
                if(vectPessoa[i].getIdade() < 16){
                    System.out.println(vectPessoa[i].getName());
                }
            }
        }
    }
    
}
