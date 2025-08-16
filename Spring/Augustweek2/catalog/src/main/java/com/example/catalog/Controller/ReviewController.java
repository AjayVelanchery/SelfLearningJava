package com.example.catalog.Controller;

import com.example.catalog.Service.ReviewService;
import com.example.catalog.dto.review.ReviewCreateRequest;
import com.example.catalog.dto.review.ReviewDTO;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {
    private final ReviewService service;
    public ReviewController(ReviewService service) { this.service = service; }

    @PostMapping("/product/{productId}") @ResponseStatus(HttpStatus.CREATED)
    public ReviewDTO add(@PathVariable Long productId, @Valid @RequestBody ReviewCreateRequest req) {
        return service.add(productId, req);
    }

    @GetMapping("/product/{productId}")
    public List<ReviewDTO> listByProduct(@PathVariable Long productId) {
        return service.listByProduct(productId);
    }

    @DeleteMapping("/{reviewId}") @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long reviewId) { service.delete(reviewId); }
}
