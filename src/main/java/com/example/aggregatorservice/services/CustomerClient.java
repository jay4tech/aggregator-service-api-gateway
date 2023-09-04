package com.example.aggregatorservice.services;


import com.example.aggregatorservice.entity.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "customer-service", url = "http://localhost:8081")
public interface CustomerClient {
  
    @GetMapping("/customers/{id}")
    public Customer getCustomer(@PathVariable("id") Integer id);
  
}