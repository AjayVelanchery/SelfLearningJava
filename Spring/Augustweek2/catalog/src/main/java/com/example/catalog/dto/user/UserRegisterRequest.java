package com.example.catalog.dto.user;

import jakarta.validation.constraints.*;

public record UserRegisterRequest(
        @NotBlank String username,
        @Email @NotBlank String email,
        @NotBlank String password
) {}
