/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package enumpedido;

import entities.enums.OrderStatus;
import entities.enums.OrderStatusEnum;
import java.util.Date;

/**
 *
 * @author User
 */
public class EnumPedido {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OrderStatus pedido = new OrderStatus(1, new Date(), OrderStatusEnum.PROCESSANDO);
        
        System.out.println(pedido.toString());
        
        OrderStatusEnum os1 = OrderStatusEnum.PROCESSANDO;
        OrderStatusEnum os2 = OrderStatusEnum.valueOf("PROCESSANDO");
        
        System.out.println(os1);
        System.out.println(os2);
    }
    
}
