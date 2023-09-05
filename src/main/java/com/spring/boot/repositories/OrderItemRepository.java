package com.spring.boot.repositories;

import com.spring.boot.entities.OrderItem;
import com.spring.boot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
