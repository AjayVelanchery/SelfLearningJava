package com.example.catalog.Controller;

import com.example.catalog.Entities.Product;
import com.example.catalog.Entities.Review;
import com.example.catalog.Service.QueryService;
import com.example.catalog.dto.review.ReviewDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/query")
public class QueryController {

    private final QueryService queryService;

    public QueryController(QueryService queryService) {
        this.queryService = queryService;
    }


    @GetMapping("/products/by-category/{name}")
    public List<Product> getProductsByCategory(@PathVariable String name) {
        return queryService.getProductsByCategoryName(name);
    }


    @GetMapping("/reviews/top/{productId}")
    public List<ReviewDTO> getTopReviews(@PathVariable Long productId,
                                         @RequestParam(defaultValue = "3") int limit) {
        return queryService.getTopReviewsForProduct(productId, limit);
    }
}
