package com.example.controle_financas.service;

import com.example.controle_financas.entity.categoria.CategoriasResponseDTO;
import com.example.controle_financas.repository.CategoriasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriasService {
    @Autowired
    private CategoriasRepository repository;

    public CategoriasService(CategoriasRepository repository) {
        this.repository = repository;
    }

    public List<CategoriasResponseDTO> getAllCategorias(){
        return repository.findAll()
                .stream()
                .map(CategoriasResponseDTO::new)
                .toList();
    }

}
