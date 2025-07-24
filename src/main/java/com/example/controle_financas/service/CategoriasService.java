package com.example.controle_financas.service;

import com.example.controle_financas.entity.categoria.Categorias;
import com.example.controle_financas.entity.categoria.CategoriasRequestDTO;
import com.example.controle_financas.entity.categoria.CategoriasResponseDTO;
import com.example.controle_financas.entity.lancamento.LancamentoResponseDTO;
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

    // GET METHOD
    public List<CategoriasResponseDTO> getAllCategorias() {
        return repository.findAll()
                .stream()
                .map(CategoriasResponseDTO::new)
                .toList();
    }

    // POST METHOD
    public CategoriasResponseDTO postDTO(CategoriasRequestDTO data) {
        Categorias entity = new Categorias(data);
        repository.save(entity);
        return new CategoriasResponseDTO(entity);
    }

}
