/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Apliccation;

import entities.Employee;
import entities.OutsourcedEmployee;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();
        
        System.out.print("Enter the numbers of employees: ");
        Integer numberOfEmployyes = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < numberOfEmployyes; i++) {
            System.out.println("Employee #" + (i+1));
            System.out.print("Outserd? (y/n)"); 
            String question = sc.nextLine();

            if(question.equals("y")){
                Employee employee = objectOutsourcedEmployee();
                employees.add(employee);
            }else{
                Employee employee = objectEmployee();
                employees.add(employee);
            }  
        }
        
        System.out.println("Payments");
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }
    
    public static OutsourcedEmployee objectOutsourcedEmployee(){
        Scanner  sc = new Scanner(System.in);
        
        System.out.print("Name: ");
        String name = sc.nextLine();
        
        System.out.print("Hours: ");
        Integer hours = sc.nextInt();
        
        System.out.print("Value Per Hours: ");
        Double valuePerHours = sc.nextDouble();
        
        System.out.print("Additional Charge: ");
        Double additionalCharge = sc.nextDouble();
        
        return new OutsourcedEmployee(additionalCharge, name, hours, valuePerHours);
    }
    
    public static Employee objectEmployee(){
        Scanner  sc = new Scanner(System.in);
        
        System.out.print("Name: ");
        String name = sc.nextLine();
        
        System.out.print("Hours: ");
        Integer hours = sc.nextInt();
        
        System.out.print("Value Per Hours: ");
        Double valuePerHours = sc.nextDouble();
        
        return new Employee(name, hours, valuePerHours);
    }
    
}
