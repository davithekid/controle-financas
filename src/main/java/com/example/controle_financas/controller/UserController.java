package com.example.controle_financas.controller;

import com.example.controle_financas.entity.user.UserResponseDTO;
import com.example.controle_financas.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public List<UserResponseDTO> getAll() {
        return service.getAllUsers();
    }

    @GetMapping("/me/{id}")
    public ResponseEntity<UserResponseDTO> getUserById(@PathVariable("id") UUID id) {
        return ResponseEntity.ok(service.gettUserById(id));
    }


}
