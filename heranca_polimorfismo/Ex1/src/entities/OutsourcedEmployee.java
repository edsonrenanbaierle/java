/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author User
 */
public class OutsourcedEmployee extends Employee{
    private Double additionalCharge;

    public OutsourcedEmployee() {
        super();
    }

    public OutsourcedEmployee(Double additionalCharge, String name, Integer hours, Double valuePerHours) {
        super(name, hours, valuePerHours);
        this.additionalCharge = additionalCharge;
    }
    
    @Override
     public Double payment(){
        return super.payment() + additionalCharge * 1.10;
    }
    
    public void print(){
        System.out.println("print");
    }
    
}
