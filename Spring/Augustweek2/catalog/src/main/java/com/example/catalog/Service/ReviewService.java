package com.example.catalog.Service;


import com.example.catalog.Entities.Product;
import com.example.catalog.Entities.Review;
import com.example.catalog.dto.review.ReviewCreateRequest;
import com.example.catalog.dto.review.ReviewDTO;
import com.example.catalog.exception.NotFoundException;
import com.example.catalog.mapper.ReviewMapper;
import com.example.catalog.repository.ProductRepository;
import com.example.catalog.repository.ReviewRepository;
import com.example.catalog.repository.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

import com.example.catalog.Entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewService {


    private final ReviewRepository reviews;
    private final ProductRepository products;
    private final UserRepository users;


    public ReviewDTO add(Long productId, ReviewCreateRequest req){

        Product product=products.findById(productId).orElseThrow(()->new NotFoundException("Product not found"));

        User user=users.findById(req.userId())
                .orElseThrow(()->new NotFoundException("Use not found"+req.userId()));

Review r=Review.builder()
        .text(req.text())
        .rating(req.rating())
        .product(product)
        .user(user)
        .build();
return ReviewMapper.toDTO(reviews.save(r));
    }

public List<ReviewDTO> listByProduct(Long productId){
        return reviews.findByProductId(productId).stream().map(ReviewMapper::toDTO).toList();
}

@Transactional
    public void delete(Long reviewId){

        if(!reviews.existsById(reviewId)) throw new NotFoundException("Review not found"+reviewId);
        reviews.deleteById(reviewId);
}

}
