package com.example.catalog.dto.review;

import jakarta.validation.constraints.*;

public record ReviewCreateRequest(
        @NotBlank String text,
        @NotNull @Min(1) @Max(5) Integer rating,
        @NotNull Long userId
) {}
