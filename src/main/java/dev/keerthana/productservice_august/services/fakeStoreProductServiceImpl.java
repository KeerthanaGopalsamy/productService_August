package dev.keerthana.productservice_august.services;

import dev.keerthana.productservice_august.dtos.productDTO;
import org.springframework.stereotype.Service;

@Service
public class fakeStoreProductServiceImpl implements productService{
    @Override
    public String getAllProducts() {
        return "";
    }

    @Override
    public String getSingleProduct(Long productId) {
        return "";
    }

    @Override
    public String addProduct(productDTO productDTO) {
        return "";
    }

    @Override
    public String updateProduct(Long updateId) {
        return "";
    }

    @Override
    public String deleteProduct(Long deleteId) {
        return "";
    }
}
