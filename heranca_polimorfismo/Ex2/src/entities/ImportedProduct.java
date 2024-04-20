/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author User
 */
public class ImportedProduct extends Product{
    private Double customFee;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(Double customFee, String name, Double price) {
        super(name, price);
        this.customFee = customFee;
    }

    public Double getCustomFee() {
        return customFee;
    }

    public void setCustomFee(Double customFee) {
        this.customFee = customFee;
    }
    
    public Double totalPrice(){
        return super.getPrice() + this.customFee;
    }
    
    @Override
    public String priceTag(){
        StringBuilder sb = new StringBuilder();
        
        sb.append(super.getName()).append(" $ ");
        sb.append(String.format("%.2f", totalPrice()));
        sb.append(" (Custom fee: $ ").append(String.format("%.2f", this.customFee)).append(")");
        
        return sb.toString();
    }
}
