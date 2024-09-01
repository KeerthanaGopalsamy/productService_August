package dev.keerthana.productservice_august.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface categoryService {

    String getAllCategory();


    String getProductsInCategory(Long categoryId);
}
