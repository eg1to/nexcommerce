package com.nexcommerce.api.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nexcommerce.api.entities.User;

public interface UserRepository extends JpaRepository<User, UUID> {
    
}
