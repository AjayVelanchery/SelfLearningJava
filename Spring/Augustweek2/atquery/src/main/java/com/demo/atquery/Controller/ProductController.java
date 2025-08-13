package com.demo.atquery.Controller;


import com.demo.atquery.Entity.Product;
import com.demo.atquery.Service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {


    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping("/search")
    public List<Product> searchProducts(@RequestParam String name){

        return productService.searchProducts(name);
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }
}
