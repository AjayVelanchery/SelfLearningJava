package com.example.catalog.dto.category;

import jakarta.validation.constraints.NotBlank;

public record CategoryUpdateRequest (

        @NotBlank(message = "name is required")String name,
        String description
){
}
