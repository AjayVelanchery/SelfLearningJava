package com.example.catalog.Controller;

import com.example.catalog.Service.UserService;
import com.example.catalog.dto.user.UserDTO;
import com.example.catalog.dto.user.UserRegisterRequest;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserService service;
    public UserController(UserService service) { this.service = service; }

    @PostMapping("/register") @ResponseStatus(HttpStatus.CREATED)
    public UserDTO register(@Valid @RequestBody UserRegisterRequest req) {
        return service.register(req);
    }
}
