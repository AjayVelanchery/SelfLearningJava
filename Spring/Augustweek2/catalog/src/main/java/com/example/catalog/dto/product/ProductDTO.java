package com.example.catalog.dto.product;

import java.math.BigDecimal;

public record ProductDTO(

        Long id,
        String name,
        String description,
        BigDecimal price,
        Integer stockQuantity,
        Long categoryId,
        String categoryName

) {
}
