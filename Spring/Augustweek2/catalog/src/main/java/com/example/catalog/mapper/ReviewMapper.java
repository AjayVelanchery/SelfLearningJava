package com.example.catalog.mapper;

import com.example.catalog.Entities.Review;
import com.example.catalog.dto.review.ReviewDTO;


public class ReviewMapper {
    public static ReviewDTO toDTO(Review r) {
        return new ReviewDTO(
                r.getId(),
                r.getText(),
                r.getRating(),
                r.getProduct() != null ? r.getProduct().getId() : null,
                r.getUser() != null ? r.getUser().getId() : null,
                r.getUser() != null ? r.getUser().getUsername() : null
        );
    }
}
