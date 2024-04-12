/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lista1;

import entities.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author User
 */
public class Lista1 {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        List<Employee> vectEmployes = new ArrayList<>();
        Integer id;
        
        System.out.println("How many employees will be registred? ");
        Integer num = sc.nextInt();
        Integer compareition = 0;
        
        for (int i = 0; i < num; i++) {
            System.out.println("");
            System.out.println("Employee #" + (i+1));
            do{
                System.out.print("Id: ");
                id = sc.nextInt();
                
                for(Employee obj : vectEmployes){
                    if(obj.getId() == id){
                        compareition = 1;
                        System.out.println("Id already exist");
                    }else {
                    	compareition = 0;
                    }
                }
            }while(compareition == 1);
            
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            
            vectEmployes.add(new Employee(id, name, salary));
        }
        
        System.out.print("Enter the Employee id that will have salary increase: ");
        int employeeId = sc.nextInt();
        
        Employee employees = vectEmployes.stream().filter(x -> x.getId() == employeeId).findFirst().orElse(null);
        if(employees == null){
            System.out.println("This is not exist");
        }else{
            System.out.print("Enter the percentage: ");
            Double percentage = sc.nextDouble();
            
            

            employees.increaseSalary(percentage);
        }
        
        System.out.println("List employes:");
        for (Employee employee : vectEmployes) {
        	System.out.println(employee.toString());
		}
    }
    
}
