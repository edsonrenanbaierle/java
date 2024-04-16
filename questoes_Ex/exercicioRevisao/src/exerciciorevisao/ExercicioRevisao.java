/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciorevisao;

import entities.Departament;
import entities.Worker;
import entities.HourContract;
import enums.WorkerLevel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class ExercicioRevisao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Departament Name: ");
        String nameDepartament = sc.nextLine();
        Departament departament = new Departament(nameDepartament);
        
        System.out.println("Enter work data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        
        System.out.print("Level: ");
        String level = sc.nextLine();
        
        System.out.print("Base Salary: ");
        Double baseSalary = sc.nextDouble();
        
        Worker worker = new Worker(name, WorkerLevel.valueOf(level), baseSalary, departament);
        
        System.out.print("How many contracts to this worker? ");
        Integer numberContracts = sc.nextInt();
        
        for (int i = 0; i < numberContracts; i++) {
            System.out.println("Enter contract " + (i+1) + "# data: ");
            
            System.out.print("Date (DD/MM/YY): ");
            sc.nextLine();
            String date = sc.nextLine();
            
            System.out.print("Value per hour: ");
            Double valuePerHour = sc.nextDouble();
            
            System.out.print("Duration: ");
            Integer duration = sc.nextInt();
            
            //formato de data desejado
            SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
            //transforma a string para date
            Date data = formatoData.parse(date);
            
            HourContract contract = new HourContract(data, valuePerHour, duration);
            worker.addContract(contract);
        }
        
        System.out.print("Enter moth and year to calculete income (MM/YYYY)");
        sc.nextLine();
        String dateIncomeString = sc.nextLine();
        
        String[] dateIncomeArrayIntger = dateIncomeString.split("/");
        
        System.out.println("Name: " + worker.getName());
        System.out.println("Departament: " + worker.getDepartament().getDepartament());
        System.out.println("Income for " + dateIncomeString + ": " + worker.income(Integer.parseInt(dateIncomeArrayIntger[1]), Integer.parseInt(dateIncomeArrayIntger[0])));
    }
    
}
