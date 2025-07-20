package com.example.controle_financas.controller;


import com.example.controle_financas.dto.UserResponseDTO;
import com.example.controle_financas.repository.UserRepository;
import com.example.controle_financas.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserRepository repository;
    private UserService service;

    public UserController(UserRepository repository) {
        this.repository = repository;
    }

    public UserController(UserRepository repository, UserService service) {
        this.repository = repository;
        this.service = service;
    }

    @GetMapping
    public List<UserResponseDTO> getAll(){
    return service.getAllUsers();
    }

}
