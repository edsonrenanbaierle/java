/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo1;

/**
 *
 * @author User
 */
public class Employee {
    public String name;
    public Double grossSalary;
    public Double tax;
    
    public Double netSalary(){
        return this.grossSalary - this.tax;
    }
    
    public void increaseSalary(Double percentage){
        this.grossSalary = grossSalary + (grossSalary * percentage / 100);
    }
    
    @Override
    public String toString(){
        return "Employee: " + this.name + ", $ " + String.format("%.2f", netSalary());
    }
}
