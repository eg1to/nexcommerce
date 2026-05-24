package com.nexcommerce.api.dto.user;

import com.nexcommerce.api.entities.UserRole;

import java.util.UUID;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponseDTO {

    private UUID id;
    private String name;
    private String email;
    private UserRole role;
    
}
