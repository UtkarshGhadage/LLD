package com.scaler.productservice.servieces;

import com.scaler.productservice.dtos.ProductDto;
import org.springframework.stereotype.Service;


@Service
public class FakeStoreProductServiceImpl implements ProductService{
    @Override
    public String getAllProducts() {

        return null;
    }

    @Override    public String getSingleProducts(Long productId) {

        return null;
    }

    @Override
    public String addNewProduct(ProductDto productDto) {

        return null;
    }

    @Override
    public String updateProduct(Long productId) {

        return null;
    }

    @Override
    public String deleteProduct(Long productId) {

        return null;
    }

}
