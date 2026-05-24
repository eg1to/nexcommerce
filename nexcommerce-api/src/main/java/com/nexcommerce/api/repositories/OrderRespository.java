package com.nexcommerce.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nexcommerce.api.entities.Order;

import java.util.UUID;

public interface OrderRespository extends JpaRepository<Order, UUID> {
    
}
