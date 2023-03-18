package com.example.demo.customerController;


import com.example.demo.model.Orders;
import com.example.demo.repository.OrdersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class OrdersController {
    @Autowired
    private OrdersRepo ordersRepo;
    @PostMapping("/order")
    Orders newOrders(@RequestBody Orders newOrders) {
        return ordersRepo.save(newOrders);

    }
}
