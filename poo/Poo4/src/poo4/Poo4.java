/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo4;

import entities.BankAccount;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Poo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account;
        
        System.out.print("Enter account number: ");
        Integer accountNumber = sc.nextInt();
        
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();

        
        System.out.print("Is there initial deposit (y/n)? ");
        String question = sc.next();
        
        
        if(question.equals("y")){
            System.out.print("Enter initial deposit value: ");
            Double depositValue = sc.nextDouble();
            account = new BankAccount(accountNumber, holder, depositValue);
        }else {
            account = new BankAccount(accountNumber, holder);
        }
        
        System.out.println("Acount data: ");
        System.out.println(account.toString());
        System.out.println("");
        
        System.out.print("Enter a deposit value: ");
        Double deposit = sc.nextDouble();
        account.deposit(deposit);
        System.out.println("");
        System.out.println("Update account data: ");
        System.out.println(account.toString());
        System.out.println("");
        
        System.out.print("Enter a withdraw value: ");
        Double withdraw = sc.nextDouble();
        account.withdraw(withdraw);
        System.out.println("");
        System.out.println("Update account data: ");
        System.out.println(account.toString());
        
        
        sc.close();
    }
    
}
