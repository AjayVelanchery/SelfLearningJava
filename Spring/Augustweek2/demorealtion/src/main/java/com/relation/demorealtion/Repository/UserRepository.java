package com.relation.demorealtion.Repository;

import com.relation.demorealtion.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
