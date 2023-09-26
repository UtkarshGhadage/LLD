package com.scaler.productservice.models;

import lombok.*;

@Getter
@Setter

public class Product {

    private String title;
    private double price;
    private String description;
    private Category category;
    private String imageUrl;
}
