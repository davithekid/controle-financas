package com.example.controle_financas.dto;

import com.example.controle_financas.entity.User;

import java.util.UUID;

public record UserResponseDTO(UUID id, String nome, String email, String senha) {
    public UserResponseDTO(User user){
        this(user.getId(), user.getNome(), user.getSenha(), user.getEmail());
    }
}
