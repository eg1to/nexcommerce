package com.nexcommerce.api.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import com.nexcommerce.api.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.nexcommerce.api.dto.user.UserRequestDTO;
import com.nexcommerce.api.dto.user.UserResponseDTO;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.ResponseEntity;
import java.util.UUID;
import java.util.List;


@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<UserResponseDTO> create(@RequestBody UserRequestDTO dto) {
        UserResponseDTO response = userService.create(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping
    public ResponseEntity<List<UserResponseDTO>> findAll() {
        List<UserResponseDTO> responses = userService.findAll();
        return ResponseEntity.ok(responses);
    }
    

    @GetMapping("/{id}")
    public ResponseEntity<UserResponseDTO> getById(@PathVariable UUID id) {
        UserResponseDTO response = userService.findById(id);
        return ResponseEntity.ok(response);
    }

    
    
    
}
