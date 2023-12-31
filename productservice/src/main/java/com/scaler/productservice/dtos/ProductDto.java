package com.scaler.productservice.dtos;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class ProductDto {

     private String title;
     private double price;
     private String description;
     private String imageUrl;
     private String catagory;
}
