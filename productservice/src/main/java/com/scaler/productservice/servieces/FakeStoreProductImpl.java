package com.scaler.productservice.servieces;

import com.scaler.productservice.dtos.ProductDto;
import jakarta.websocket.server.ServerEndpoint;
import org.springframework.stereotype.Service;


@Service
public class FakeStoreProductImpl implements ProductService{
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

    @Override
    public String getProductInCategory(Long categoryId) {
        return null;
    }
}
