package com.spring.boot.repositories;

import com.spring.boot.entities.Category;
import com.spring.boot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
