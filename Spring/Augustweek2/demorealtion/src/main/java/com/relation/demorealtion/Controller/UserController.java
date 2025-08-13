package com.relation.demorealtion.Controller;


import com.relation.demorealtion.Entities.Order;
import com.relation.demorealtion.Entities.Role;
import com.relation.demorealtion.Entities.User;
import com.relation.demorealtion.Entities.UserDetail;
import com.relation.demorealtion.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {


    private final UserService userService;

    @PostMapping
    public User registerUser(@RequestBody User user) {
        return userService.registerUser(user);
    }


    @PostMapping("/{id}/details")
    public User addUserDetail(@PathVariable Long id, @RequestBody UserDetail detail) {
        return userService.addUserDetail(id, detail);
    }

    @PostMapping("/{id}/roles")
    public User assignRole(@PathVariable Long id, @RequestBody Role role) {
        return userService.assignRole(id, role);
    }

    @PostMapping("/{id}/orders")
    public User addOrder(@PathVariable Long id, @RequestBody Order order) {
        return userService.addOrder(id, order);
    }
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
    @DeleteMapping("/{userId}/orders/{orderId}")
    public void deleteOrder(@PathVariable Long userId, @PathVariable Long orderId) {
        userService.deleteOrder(userId, orderId);
    }

    @DeleteMapping("/{userId}/roles/{roleId}")
    public void removeRole(@PathVariable Long userId, @PathVariable Long roleId) {
        userService.removeRole(userId, roleId);
    }
}