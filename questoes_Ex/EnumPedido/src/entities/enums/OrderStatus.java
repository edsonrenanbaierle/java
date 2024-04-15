/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities.enums;

import java.util.Date;

/**
 *
 * @author User
 */
public class OrderStatus {
    private int id;
    private Date moment;
    private OrderStatusEnum orderStatus;
    
    public OrderStatus(){
    }

    public OrderStatus(int id, Date moment, OrderStatusEnum orderStatus) {
        this.id = id;
        this.moment = moment;
        this.orderStatus = orderStatus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatusEnum getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatusEnum orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "OrderStatus{" + "id=" + id + ", moment=" + moment + ", orderStatus=" + orderStatus + '}';
    }

    
    
    
    
    
}
