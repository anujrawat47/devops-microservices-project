package com.devops.orderservice.model;

public class Order {
    private int id;
    private String product;

    public Order(int id, String product) {
        this.id = id;
        this.product = product;
    }
}