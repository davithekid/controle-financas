package com.example.controle_financas.service;

import com.example.controle_financas.entity.user.UserResponseDTO;
import com.example.controle_financas.entity.user.User;
import com.example.controle_financas.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    // GET ALL USERS.
    public List<UserResponseDTO> getAllUsers() {
        return repository.findAll()
                .stream()
                .map(UserResponseDTO::new)
                .toList();
    }

    // GET USER BY ID.
    public UserResponseDTO gettUserById(UUID id) {
        User user = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado")); // retorno o erro caso n existir
        return new UserResponseDTO(user);
    }


}
