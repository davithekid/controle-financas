package com.example.controle_financas.repository;

import com.example.controle_financas.entity.categoria.Categorias;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriasRepository extends JpaRepository<Categorias, Integer> {
}
