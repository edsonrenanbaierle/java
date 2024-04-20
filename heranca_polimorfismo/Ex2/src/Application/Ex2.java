/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        
        
        ArrayList<Product> products = new ArrayList<>();
        
        System.out.print("Enter the numbers of produts: ");
        Integer numbersOfProducts = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < numbersOfProducts; i++) {
            System.out.println("Product #" + (i+1) + "data: ");
            System.out.print("Common, used or imported (c/u/i)? ");
            String option = sc.nextLine();
            
            if(option.equals("c")){
                Product product = commonProduct();
                products.add(product);
            }else if(option.equals("u")){
                Product product = usedProduct();
                products.add(product);
            }else{
                Product product = importedProduct();
                products.add(product);
            }
        }
        
        System.out.println("PRICE TAGS");
        for (Product product : products) {
            System.out.println(product.priceTag());
        }
        
    }
    static Scanner sc = new Scanner(System.in);
    
    public static Product commonProduct(){
        System.out.print("Name: ");
        String name = sc.nextLine();
        
        System.out.print("Price: ");
        Double price = sc.nextDouble();
        sc.nextLine();
        
        return new Product(name, price);
    }
    
    public static UsedProduct usedProduct() throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.print("Name: ");
        String name = sc.nextLine();
        
        System.out.print("Price: ");
        Double price = sc.nextDouble();
        sc.nextLine();
        
        System.out.print("Manafacture Data (dd/mm/yyyy): ");
        String dataProduct = sc.nextLine();
        
        
        return new UsedProduct(sdf.parse(dataProduct), name, price);
    }
    
    public static ImportedProduct importedProduct(){
        
        System.out.print("Name: ");
        String name = sc.nextLine();
        
        System.out.print("Price: ");
        Double price = sc.nextDouble();
        
        System.out.print("Custom Fee: ");
        Double customFee = sc.nextDouble();
        sc.nextLine();
        
        return new ImportedProduct(customFee, name, price);
    }
}
