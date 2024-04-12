/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication51;

/**
 *
 * @author User
 */
public class Rectangle {
    public Double height;
    public Double widht;
    
    
    public Double area(){
        return this.height * this.widht;
    }
    
    public Double perimeter(){
        return 2 * (this.widht + this.height);
    }
    
    public Double diagonal(){
        return Math.sqrt(Math.pow(this.widht, 2) + Math.pow(this.height, 2));
    }
    
    public String toString(){
        return "Area: " + String.format("%.2f", area()) + "\n" +
               "Perimeter: " + String.format("%.2f", perimeter())+ "\n" +
               "Diagonal: " + String.format("%.2f", diagonal())+ "\n";
    }
}
