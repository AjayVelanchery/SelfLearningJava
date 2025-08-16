package com.example.catalog.repository;


import com.example.catalog.Entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findByProductId(Long productId);

    @Query(value = "SELECT * FROM review r WHERE r.product_id = :productId ORDER BY r.rating DESC LIMIT :limit", nativeQuery = true)
    List<Review> findTopReviewsByProduct(@Param("productId") Long productId, @Param("limit") int limit);
}
