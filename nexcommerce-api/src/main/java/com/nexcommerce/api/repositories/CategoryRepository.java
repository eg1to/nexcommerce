package com.nexcommerce.api.repositories;

import com.nexcommerce.api.entities.Category;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, UUID> {
    
}
