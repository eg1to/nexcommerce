package com.nexcommerce.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nexcommerce.api.entities.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {
    
}
