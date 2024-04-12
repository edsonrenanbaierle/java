/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor13;

import entities.Aluno;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Vetor13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
        no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
        os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
        igual a 6.0 (seis).*/
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos alunos serao digitados? ");
        Integer n = sc.nextInt();
        
        Aluno[] vectAluno = new Aluno[n];
        
        for (int i = 0; i < vectAluno.length; i++) {
            System.out.println("");
            System.out.println("Dados da pessoa " + (i + 1) + ":");
            sc.nextLine();
            System.out.print("Nome: ");
            String name = sc.nextLine();
            
            System.out.print("Nota 1: ");
            Double noteOne = sc.nextDouble();
            
            System.out.print("Nota 2: ");
            Double noteTwo = sc.nextDouble();
            
            vectAluno[i] = new Aluno(name, noteOne, noteTwo);
        }
        
        System.out.println("Aluno Aprovados: ");
        for (int i = 0; i < vectAluno.length; i++) {
            if(vectAluno[i].average() >= 6){
                System.out.println(vectAluno[i].getName());
            }
        }
    }
    
}
