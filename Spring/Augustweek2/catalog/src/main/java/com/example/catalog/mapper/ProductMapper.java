package com.example.catalog.mapper;

import com.example.catalog.Entities.Product;
import com.example.catalog.dto.product.ProductDTO;


public class ProductMapper {
    public static ProductDTO toDTO(Product p) {
        return new ProductDTO(
                p.getId(),
                p.getName(),
                p.getDescription(),
                p.getPrice(),
                p.getStockQuantity(),
                p.getCategory() != null ? p.getCategory().getId() : null,
                p.getCategory() != null ? p.getCategory().getName() : null
        );
    }
}
