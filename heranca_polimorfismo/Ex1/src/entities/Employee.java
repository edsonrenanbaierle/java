/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author User
 */
public class Employee {
    private String name;
    private Integer hours;
    private Double valuePerHours;

    public Employee() {
    }

    public Employee(String name, Integer hours, Double valuePerHours) {
        this.name = name;
        this.hours = hours;
        this.valuePerHours = valuePerHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getValuePerHours() {
        return valuePerHours;
    }

    public void setValuePerHours(Double valuePerHours) {
        this.valuePerHours = valuePerHours;
    }
    
    public Double payment(){
        return valuePerHours * hours;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" - $ ");
        sb.append(String.format("%.2f", payment()));
        return sb.toString();
    }
    
    
}
