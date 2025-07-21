package com.example.controle_financas.entity.user;

import java.util.UUID;

public record UserResponseDTO(UUID id, String login ,String nome, String sobrenome, String email, String senha, UserRole role) {
    public UserResponseDTO(User user) {
        this(user.getId(), user.getLogin(), user.getSobrenome(), user.getNome(), user.getEmail(), user.getSenha() , user.getRole());
    }
}
