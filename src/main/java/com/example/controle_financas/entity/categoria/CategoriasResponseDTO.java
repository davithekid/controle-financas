package com.example.controle_financas.entity.categoria;

public record CategoriasResponseDTO(Integer id, String nome) {
    public CategoriasResponseDTO(Categorias categorias){
        this(categorias.getId(), categorias.getNome());
    }
}
