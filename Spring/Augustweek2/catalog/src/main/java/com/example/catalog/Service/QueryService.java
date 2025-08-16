package com.example.catalog.Service;

import com.example.catalog.Entities.Product;
import com.example.catalog.Entities.Review;
import com.example.catalog.dto.review.ReviewDTO;
import com.example.catalog.repository.ProductRepository;
import com.example.catalog.repository.ReviewRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class QueryService {

    private final ProductRepository productRepository;
    private final ReviewRepository reviewRepository;

    public QueryService(ProductRepository productRepository, ReviewRepository reviewRepository) {
        this.productRepository = productRepository;
        this.reviewRepository = reviewRepository;
    }

    public List<Product> getProductsByCategoryName(String categoryName) {
        return productRepository.findProductsByCategoryName(categoryName);
    }

    public List<ReviewDTO> getTopReviewsForProduct(Long productId, int limit) {
        return reviewRepository.findTopReviewsByProduct(productId, limit)
                .stream()
                .map(r -> new ReviewDTO(
                        r.getId(),
                        r.getText(),
                        r.getRating(),
                        r.getProduct().getId(),
                        r.getUser().getId(),
                        r.getUser().getUsername()
                ))
                .toList();
    }
}
