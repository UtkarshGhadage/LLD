package com.scaler.productservice.models;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
public class Category {

    private String name;
    private String description;
    private List<Product> products;
}
