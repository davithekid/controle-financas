package com.example.controle_financas.service;

import com.example.controle_financas.entity.user.UserResponseDTO;
import com.example.controle_financas.entity.user.User;
import com.example.controle_financas.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<UserResponseDTO> getAllUsers() {
        return repository.findAll()
                .stream()
                .map(UserResponseDTO::new)
                .toList();
    }

}
