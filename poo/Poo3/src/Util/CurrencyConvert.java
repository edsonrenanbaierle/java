/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

/**
 *
 * @author User
 */
public class CurrencyConvert {
    public static final Double IOF = 0.06;
    
    public static Double CurrencyConvertDolarToReais(Double currentDolarPrice, Double quantityToBeConverted){
        return currentDolarPrice * quantityToBeConverted + (currentDolarPrice * quantityToBeConverted * IOF);
    }
}
