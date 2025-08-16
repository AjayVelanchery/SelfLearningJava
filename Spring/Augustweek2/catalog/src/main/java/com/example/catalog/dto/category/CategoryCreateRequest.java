package com.example.catalog.dto.category;

import jakarta.validation.constraints.NotBlank;

public record CategoryCreateRequest(
@NotBlank (message = "name is required")String name,

                                     String description) {


}
