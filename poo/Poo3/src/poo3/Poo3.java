/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo3;

import Util.CurrencyConvert;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Poo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("What is the dollar price? ");
        Double price = sc.nextDouble();
        
        System.out.print("How many dollars will be bought? ");
        Double bought = sc.nextDouble();
        
        System.out.println("Amount to be paid in reais: " + CurrencyConvert.CurrencyConvertDolarToReais(price, bought));
        System.out.println("Value IOF = " + CurrencyConvert.IOF * 100 + "%");
        sc.close();
    }
    
}
