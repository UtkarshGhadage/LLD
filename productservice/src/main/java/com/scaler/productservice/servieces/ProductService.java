package com.scaler.productservice.servieces;

import com.scaler.productservice.dtos.ProductDto;
import org.springframework.web.bind.annotation.*;

public interface ProductService {


    public String getAllProducts();

    public String getSingleProducts(Long productId);

    public String addNewProduct(ProductDto productDto);

    public String updateProduct(Long productId);

    public String deleteProduct(Long productId);

}