package dev.keerthana.productservice_august.controllers;

import dev.keerthana.productservice_august.dtos.productDTO;
import dev.keerthana.productservice_august.services.productService;
import org.springframework.web.bind.annotation.*;

@RestController//this annotation is used to create a RESTful web service
@RequestMapping("/products")
public class productController {
   private productService pService;
   public productController(productService pService)
   {
       this.pService=pService;
   }
    @GetMapping()
    public String getAllProducts()
    {
        return "";
    }
    @GetMapping("/{productId}")
    public String getSingleProduct(@PathVariable("productId")   Long productId)
    {
        return "the product id is"+productId;
    }
    @PostMapping()
    public String addProduct(@RequestBody productDTO productDTO)
    {
        return "add products "+productDTO;
    }
@PutMapping("/updates/{updateId}")
    public String updateProduct(@PathVariable("updateId")   Long updateId,@RequestBody productDTO productDTO)
    {
        return "the product id is "+productDTO+" "+updateId;
    }
    @DeleteMapping("/delete/{deleteId}")
    public String deleteProduct(@PathVariable("deleteId")   Long deleteId)
    {
        return "the product id is"+deleteId;
    }

}
