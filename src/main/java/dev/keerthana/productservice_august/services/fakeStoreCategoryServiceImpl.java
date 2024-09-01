package dev.keerthana.productservice_august.services;

import org.springframework.stereotype.Service;

@Service
public class fakeStoreCategoryServiceImpl implements categoryService{
    @Override
    public String getAllCategory() {
        return "";
    }

    @Override
    public String getProductsInCategory(Long categoryId) {
        return "";
    }
}
