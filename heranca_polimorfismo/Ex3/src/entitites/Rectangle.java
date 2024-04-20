/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entitites;

/**
 *
 * @author User
 */
public class Rectangle extends Shape{
    private Double height;
    private Double widht;

    public Rectangle() {
        super();
    }

    public Rectangle(Double height, Double widht, Color color) {
        super(color);
        this.height = height;
        this.widht = widht;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidht() {
        return widht;
    }

    public void setWidht(Double widht) {
        this.widht = widht;
    }

    @Override
    public Double area() {
        return widht * height;
    }
    
}
