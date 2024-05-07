/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import enums.OrderStatus;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author User
 */
public class Order {
    private Date moment;
    private OrderStatus status;
    private Cliente cliente;
    private ArrayList<OrderItem> orderItem = new ArrayList<OrderItem>();

    public Order(Date moment, OrderStatus status, Cliente cliente) {
        this.moment = moment;
        this.status = status;
        this.cliente = cliente;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<OrderItem> getOrderItem() {
        return orderItem;
    }
    
    public void addItem(OrderItem orderItem){
        this.orderItem.add(orderItem);
    }
    
    public void removeItem(OrderItem orderItem){
        this.orderItem.remove(orderItem);
    }
    
    public Double total(){
        Double valueTotal = 0.0;
        
        for (OrderItem item : orderItem) {
            valueTotal += item.subTotal();
        }
        
        return valueTotal;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        StringBuilder sb = new StringBuilder();
        sb.append("Order Moment (" + sdf.format(this.moment) + ")\n");
        sb.append("Order Status: " + this.status.toString() + "\n");
        sb.append("Cliente: " + this.cliente.getName() + "(" + sdf.format(this.cliente.getBirthDate()) +")" + " - " + this.cliente.getEmail() + "\n");
        sb.append("Order Items: \n");
        for (OrderItem item : orderItem) {
            sb.append(item.getProduct().getName() + ", $" + item.getProduct().getPrice() + ", Quantity: " + item.getQuantity() + ", SubTotal: $" + item.subTotal() + "\n");
        }
        sb.append("Total Price: $" + this.total());
        
        return sb.toString();
    }
    
    
}
