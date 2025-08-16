package com.example.catalog.dto.review;

public record ReviewDTO(
        Long id,
        String text,
        Integer rating,
        Long productId,
        Long userId,
        String username
) {}
