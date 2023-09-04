package com.example.aggregatorservice.services;

import com.example.aggregatorservice.entity.Orders;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "orders-service", url = "http://localhost:8083")
public interface OrderClient {
  
    @GetMapping("/orders/{id}")
    public Orders getOrderById(@PathVariable("id") Integer id);
  
}