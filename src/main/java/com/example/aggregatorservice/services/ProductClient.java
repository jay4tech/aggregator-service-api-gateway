package com.example.aggregatorservice.services;


import com.example.aggregatorservice.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "product-service", url = "http://localhost:8082")
public interface ProductClient {
  
    @GetMapping("/products/{id}")
    public Product getProduct(@PathVariable("id") Integer id);
  
}