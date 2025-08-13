package com.demo.atquery.Service;


import com.demo.atquery.Entity.Product;
import com.demo.atquery.Repostiory.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service


    public class ProductService{

        private final ProductRepository productRepository;

        public ProductService(ProductRepository productRepository){

            this.productRepository=productRepository;



        }


    public List<Product> searchProducts(String name){
     return productRepository.searchByName(name);
    }

    public Product saveProduct(Product product){

            return productRepository.save(product);
    }

    }


