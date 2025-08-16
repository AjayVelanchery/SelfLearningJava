package com.example.catalog.repository;


import com.example.catalog.Entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Optional<Category> findByNameIgnoreCase(String name);

    @Query("SELECT c FROM Category c JOIN FETCH c.products")
    List<Category> findAllWithProducts();

}
