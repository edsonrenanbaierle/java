/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo1;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Poo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee funcionario = new Employee();
        
        System.out.print("Name: ");
        funcionario.name = sc.nextLine();
        
        System.out.print("Gross Salary: ");
        funcionario.grossSalary = sc.nextDouble();
        
        System.out.print("Tax: ");
        funcionario.tax = sc.nextDouble();
        
        System.out.println(funcionario.toString());
        
        System.out.print("Wich percentage to increase salary? ");
        Double increase  = sc.nextDouble();
        
        funcionario.increaseSalary(increase);
        System.out.println(funcionario.toString());
        
        sc.close();
    }
    
}
