package com.relation.demorealtion.Repository;

import com.relation.demorealtion.Entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
