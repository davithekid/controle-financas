package com.example.controle_financas.entity.categoria;

import jakarta.validation.constraints.NotBlank;

public record CategoriasRequestDTO(@NotBlank String nome) {
}
