/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package application;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Double valorDeImpostoTotalPago = 0.0;
        
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        
        System.out.print("Entre com o número de pessoas: ");
        Integer numeroDePessoas = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < numeroDePessoas; i++) {
            System.out.println("Pessoa #" + (i+1) + "data: ");
            System.out.print("Pessoa Juridica ou Fisica (f/j): ");
            String option = sc.nextLine();
            
            if(option.equals("j")){
                Pessoa pessoa = criacaoPessoaJuridica();
                pessoas.add(pessoa);
            }else{
                Pessoa pessoa = criacaoPessoaFisica();
                pessoas.add(pessoa);
            }
            
        }
        
        System.out.println("TAXAS");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.toString());
            valorDeImpostoTotalPago += pessoa.valorImpostoAnual();
        }
        
        System.out.println("");
        System.out.println("TOTAL IMPOSTO: " + String.format("%.2f", valorDeImpostoTotalPago));
    }
    static Scanner sc = new Scanner(System.in);
    
    public static PessoaJuridica criacaoPessoaJuridica(){
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        
        System.out.print("Digite sua Renda Anual: ");
        Double rendaAnual = sc.nextDouble();
        
        System.out.print("Digite o numero de funcionarios da empresa: ");
        Integer numeroDeFuncionarios = sc.nextInt();
        sc.nextLine();
        
        return new PessoaJuridica(numeroDeFuncionarios, nome, rendaAnual);
    }
    
    public static PessoaFisica criacaoPessoaFisica(){
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        
        System.out.print("Digite sua Renda Anual: ");
        Double rendaAnual = sc.nextDouble();
        
        System.out.print("Digite os seus gastos com saude: ");
        Double gastoDeSaude = sc.nextDouble();
        sc.nextLine();
        
        return new PessoaFisica(gastoDeSaude, nome, rendaAnual);
    }
}
