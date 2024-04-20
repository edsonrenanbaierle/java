/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author User
 */
public class UsedProduct extends Product{
    private Date manafactureDate;

    public UsedProduct() {
        super();
    }

    public UsedProduct(Date manafactureDate, String name, Double price) {
        super(name, price);
        this.manafactureDate = manafactureDate;
    }
    
    
    @Override
    public String priceTag(){
       SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
       StringBuilder sb = new StringBuilder();
        
        sb.append(super.getName()).append("(used) $ ");
        sb.append(String.format("%.2f", super.getPrice()));
        sb.append(" (Manafacture Date: ").append(sdf.format(this.manafactureDate));
        sb.append(")");
        
        return sb.toString();
    }
}
