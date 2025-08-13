package com.relation.demorealtion.Service;


import com.relation.demorealtion.Entities.Order;
import com.relation.demorealtion.Entities.Role;
import com.relation.demorealtion.Entities.User;
import com.relation.demorealtion.Entities.UserDetail;
import com.relation.demorealtion.Repository.OrderRepository;
import com.relation.demorealtion.Repository.RoleRepository;
import com.relation.demorealtion.Repository.UserDetailRepository;
import com.relation.demorealtion.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.aspectj.weaver.ast.Or;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final UserDetailRepository userDetailRepository;
    private final RoleRepository roleRepository;
    private final OrderRepository orderRepository;


    public User registerUser(User user) {
        return userRepository.save(user);
    }


    public User addUserDetail(Long userId, UserDetail detail) {
        User user = userRepository.findById(userId).orElseThrow();
        detail.setUser(user);
        user.setUserDetail(detail);
        userDetailRepository.save(detail);
        return user;
    }

    public User assignRole(Long userId, Role role) {
        User user = userRepository.findById(userId).orElseThrow();
        role = roleRepository.save(role);
        user.getRoles().add(role);
        role.getUsers().add(user);
        return userRepository.save(user);

    }


    public User addOrder(Long userId, Order order) {

        User user = userRepository.findById(userId).orElseThrow();
        user.addOrder(order);
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow();
    }


    public User updateUser(Long id, User updatedUser) {
        User user = userRepository.findById(id).orElseThrow();

        user.setName(updatedUser.getName());


        if (updatedUser.getUserDetail() != null) {
            if (user.getUserDetail() == null) {

                user.setUserDetail(updatedUser.getUserDetail());
                updatedUser.getUserDetail().setUser(user); // ensure bidirectional link
            } else {

                user.getUserDetail().setAddress(updatedUser.getUserDetail().getAddress());
                user.getUserDetail().setPhone(updatedUser.getUserDetail().getPhone());
            }
        }

        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public void deleteOrder(Long userId, Long orderId) {
        Order order = orderRepository.findById(orderId).orElseThrow();
        if (!order.getUser().getId().equals(userId)) {
            throw new RuntimeException("Order does not belong to this user");
        }
        orderRepository.delete(order);
    }

    public void removeRole(Long userId, Long roleId) {
        User user = userRepository.findById(userId).orElseThrow();
        Role role = roleRepository.findById(roleId).orElseThrow();
        user.getRoles().remove(role);
        role.getUsers().remove(user);
        userRepository.save(user);
    }
}