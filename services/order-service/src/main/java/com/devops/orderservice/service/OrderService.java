package com.devops.orderservice.service;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderService {

    public List<String> getOrders() {
        return List.of(
                "Order-101",
                "Order-102",
                "Order-103"
        );
    }
}