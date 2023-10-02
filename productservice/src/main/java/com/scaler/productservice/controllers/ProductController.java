package com.scaler.productservice.controllers;

import com.scaler.productservice.dtos.ProductDto;
import com.scaler.productservice.servieces.ProductService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService){

        this.productService = productService;
    }


    @GetMapping()
    public String getAllProducts(){
        return "Getting all products";
    }

    @GetMapping("/{productId}")
    public String getSingleProducts(@PathVariable("productId") Long productId){
        return "Get product with id "+ productId;
    }

    @PostMapping()
    public String addNewProduct(@RequestBody ProductDto productDto){

        return "add new products : " + productDto;
    }

    @PutMapping("/{productId}")
    public String updateProduct(@PathVariable("productId") Long productId){

        return "update product :" + productId;
    }

    @DeleteMapping("/{productId}")
    public String deleteProduct(@PathVariable("productId") Long productId){

        return "Deleting a prod :" + productId;
    }


}
