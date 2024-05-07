/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import entities.Cliente;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import enums.OrderStatus;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Main {
    static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter cliente data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth Date (dd/mm/yyyy): ");
        String birthDate = sc.nextLine();
        Cliente cliente = new Cliente(name, email, sdf.parse(birthDate));
        
        System.out.println("Enter order data:");
        System.out.print("Status: ");
        String status = sc.nextLine();
        System.out.print("How many items to this order? ");
        Integer quantityOfItems = sc.nextInt();
        
        Order order = new Order(new Date(), OrderStatus.valueOf(status), cliente);
        
        for (int i = 0; i < quantityOfItems; i++) {
            sc.nextLine();
            
            System.out.println("Enter #" + (i+1) + " item data:");
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            
            System.out.print("Product price: ");
            Double productPrice = sc.nextDouble();
            
            System.out.print("Quantity: ");
            Integer quantity = sc.nextInt();
            
            Product product = new Product(productName, productPrice);
            OrderItem productOrderItem = new OrderItem(quantity, product);
            order.addItem(productOrderItem);
        }
        
        System.out.println("\n");
        System.out.println("ORDER SUMMARY:");
        System.out.println(order.toString());
        
        
        
    }
    
}
