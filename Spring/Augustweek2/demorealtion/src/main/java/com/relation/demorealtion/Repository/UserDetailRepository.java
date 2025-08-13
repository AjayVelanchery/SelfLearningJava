package com.relation.demorealtion.Repository;

import com.relation.demorealtion.Entities.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailRepository extends JpaRepository<UserDetail,Long> {
}
