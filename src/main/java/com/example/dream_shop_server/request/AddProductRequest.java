package com.example.dream_shop_server.request;

import com.example.dream_shop_server.model.Category;
import lombok.*;

import java.math.BigDecimal;

@Data
public class AddProductRequest {
    private Long id;
    private String name;
    private String brand;
    private BigDecimal price;
    private int inventory;
    private String description;
    private Category category;

    public AddProductRequest() {
    }

    public AddProductRequest(Long id, String name, String brand, BigDecimal price, int inventory, String description, Category category) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.inventory = inventory;
        this.description = description;
        this.category = category;
    }


}
