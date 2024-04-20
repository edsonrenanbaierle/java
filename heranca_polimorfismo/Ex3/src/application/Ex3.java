/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package application;

import entitites.Circle;
import entitites.Color;
import entitites.Rectangle;
import entitites.Shape;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        Integer numberOfShapes = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numberOfShapes; i++) {
            System.out.println("Shape #" + (i + 1) + " data: ");
            System.out.print("Rectangle or Circle (c/r)? ");
            String option = sc.nextLine();

            System.out.print("Color (RED/BLACK/BLUE): ");
            String color = sc.nextLine();

            if (option.equals("r")) {
                System.out.print("Widht: ");
                Double widht = sc.nextDouble();

                System.out.print("Height: ");
                Double height = sc.nextDouble();
                sc.nextLine();

                Shape shape = new Rectangle(height, widht, Color.valueOf(color));
                shapes.add(shape);

            } else {
                System.out.print("Radius: ");
                Double radius = sc.nextDouble();
                sc.nextLine();

                Shape shape = new Circle(radius, Color.valueOf(color));
                shapes.add(shape);
            }
        }

        System.out.println("Shape Areas: ");
        for (Shape shape : shapes) {
            System.out.println(String.format("%.2f", shape.area()));
        }

    }

    static Scanner sc = new Scanner(System.in);
}
