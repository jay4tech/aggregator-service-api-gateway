package com.example.aggregatorservice.controllers;


import com.example.aggregatorservice.entity.AggregateData;
import com.example.aggregatorservice.entity.Customer;
import com.example.aggregatorservice.entity.Orders;
import com.example.aggregatorservice.entity.Product;
import com.example.aggregatorservice.services.CustomerClient;
import com.example.aggregatorservice.services.OrderClient;
import com.example.aggregatorservice.services.ProductClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("aggregate")
public class AggregatorController {
    @Autowired
    private OrderClient orderClient;
    @Autowired
    private ProductClient productClient;

    @Autowired
    private CustomerClient customerClient;

    @GetMapping("/{id}")
    public AggregateData aggregate(@PathVariable Integer id) {
        Orders order = orderClient.getOrderById(id);
        Product product = productClient.getProduct(id);
        Customer customer = customerClient.getCustomer(id);
        return new AggregateData(customer, product,order);
    }
}