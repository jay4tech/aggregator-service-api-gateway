package com.example.aggregatorservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Orders {
    private Integer id;
    private String product;
    private Long customerId;
}