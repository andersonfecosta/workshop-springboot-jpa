package com.spring.boot.services;

import com.spring.boot.entities.Order;
import com.spring.boot.repositories.OrderRepository;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;


    public List<Order> findAll() {
        return orderRepository.findAll();
    }
    public Order findById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }
}
