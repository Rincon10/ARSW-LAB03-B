package edu.eci.arsw.myrestaurant.model;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;

public class Order {

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    //product name, amount
    private Set<OrderDetail> orderDetail;
    private Map<String, OrderDetail> orderDetailsMap;

    public Map<String, OrderDetail> getOrderDetailsMap() {
        return orderDetailsMap;
    }
    private int tableNumber;

    public Order(int tableNumber) {
        orderDetail = new LinkedHashSet<>();
        orderDetailsMap = new ConcurrentHashMap<>();
        this.tableNumber = tableNumber;
    }

    public Set<OrderDetail> getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(Set<OrderDetail> orderDetails) {
        this.orderDetail = orderDetails;
        //index order elements for quick access
        orderDetailsMap=new ConcurrentHashMap<>();
        for (OrderDetail od:orderDetails ){
            orderDetailsMap.put(od.getProductName(), od);
        }
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void addDish(String p, int amount) {
        if (orderDetailsMap.containsKey(p)){
            OrderDetail od=orderDetailsMap.get(p);
            od.setAmount(od.getAmount()+amount);            
        }
        else{
            OrderDetail od=new OrderDetail(p, amount);
            orderDetailsMap.put(p,od);
            orderDetail.add(od);
        }
    }

    public Set<String> getOrderedDishes() {
        return orderDetailsMap.keySet();
    }

    public int getDishOrderedAmount(String p) {
        if (!orderDetailsMap.containsKey(p)) {
            return 0;
        } else {
            return orderDetailsMap.get(p).getAmount();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Table " + tableNumber+"\n");
        getOrderedDishes().forEach((p) -> {
            sb.append(p).append(" x ").append(orderDetailsMap.get(p).getAmount()).append("\n");
        });
        return sb.toString();

    }

}
