/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.myrestaurant.model;

/**
 *
 * @author hcadavid
 */
public class OrderDetail {
    
    String productName;

    int amount;

    public OrderDetail(String productName, int amount) {
        this.productName = productName;
        this.amount = amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getProductName() {
        return productName;
    }

    public int getAmount() {
        return amount;
    }
    
    
    
}
