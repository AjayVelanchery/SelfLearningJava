package com.example.demo.repostiory;

import com.example.demo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepostiory extends JpaRepository<User,Long> {
}
