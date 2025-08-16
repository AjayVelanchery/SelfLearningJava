package com.example.catalog.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,length = 2000)
    private String text;


    @Column(nullable = false)
    private Integer rating;

    @ManyToOne(optional = false)@JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne(optional = false)@JoinColumn(name = "user_id")
    private User user;
}
