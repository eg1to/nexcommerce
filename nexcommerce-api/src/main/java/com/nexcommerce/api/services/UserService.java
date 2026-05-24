package com.nexcommerce.api.services;

import com.nexcommerce.api.dto.user.UserRequestDTO;
import com.nexcommerce.api.dto.user.UserResponseDTO;
import com.nexcommerce.api.entities.UserRole;
import com.nexcommerce.api.entities.User;
import com.nexcommerce.api.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserResponseDTO create(UserRequestDTO dto) {

        User user = new User();
        user.setName(dto.getName());
        user.setEmail(dto.getEmail());
        user.setPasswordHash(dto.getPassword());
        user.setRole(UserRole.CUSTOMER);

        User saved = userRepository.save(user);

        return toResponseDTO(saved);
    }

    private UserResponseDTO toResponseDTO(User user) {
        UserResponseDTO dto = new UserResponseDTO();
        dto.setId(user.getId());
        dto.setName(user.getName());
        dto.setEmail(user.getEmail());
        dto.setRole(user.getRole());
        return dto;
    }

    public UserResponseDTO findById(UUID id) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        
        return toResponseDTO(user);
    }

    public UserResponseDTO findByEmail(String email) {
        User user = userRepository.findByEmail(email).orElseThrow(() -> new RuntimeException("User not found"));

        return toResponseDTO(user);
    }

    public List<UserResponseDTO> findAll() {
        return userRepository.findAll()
                .stream()
                .map(this::toResponseDTO)
                .collect(Collectors.toList());
    }
}
