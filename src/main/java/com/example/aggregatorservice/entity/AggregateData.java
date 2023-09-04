package com.example.aggregatorservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AggregateData {
    private Customer customer;
    private Product product;
    private Orders order;
}