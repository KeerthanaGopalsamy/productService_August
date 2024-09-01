package dev.keerthana.productservice_august.controllers;

import dev.keerthana.productservice_august.services.categoryService;
import dev.keerthana.productservice_august.services.productService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categories/products")
public class categoryController {
    private categoryService cService;
    public categoryController(categoryService cService)
    {
        this.cService=cService;
    }
    @GetMapping()
    public String getAllCategory()
    {
        return"";
    }
    @GetMapping("/{categoryId}")
    public String getProductsInCategory(@PathVariable ("categoryId") Long categoryId)
    {
        return "get products in category "+categoryId;
    }

}
