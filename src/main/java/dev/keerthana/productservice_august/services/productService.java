package dev.keerthana.productservice_august.services;

import dev.keerthana.productservice_august.dtos.productDTO;
import org.springframework.web.bind.annotation.*;

public interface productService {

    String getAllProducts();


    String getSingleProduct( Long productId);


    String addProduct( productDTO productDTO);


    String updateProduct(Long updateId);


    String deleteProduct(Long deleteId);
}
