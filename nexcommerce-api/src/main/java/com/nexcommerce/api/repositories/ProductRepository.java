package com.nexcommerce.api.repositories;

import com.nexcommerce.api.entities.Product;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, UUID> {
    
}