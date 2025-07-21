package com.example.controle_financas.entity.user;

public record RegisterDTO(
        String login,
        String senha,
        UserRole role,
        String nome,
        String sobrenome,
        String email
) {
}

