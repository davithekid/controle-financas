package com.example.controle_financas.controller;

import com.example.controle_financas.entity.categoria.CategoriasRequestDTO;
import com.example.controle_financas.entity.categoria.CategoriasResponseDTO;
import com.example.controle_financas.service.CategoriasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("categorias")
public class CategoriasController {

    @Autowired
    private CategoriasService service;

    public CategoriasController(CategoriasService service) {
        this.service = service;
    }

    @GetMapping
    public List<CategoriasResponseDTO> getAll(){
        return service.getAllCategorias();
    }

    @PostMapping
    public ResponseEntity<CategoriasResponseDTO> criar(@RequestBody CategoriasRequestDTO data){
        CategoriasResponseDTO response = service.postDTO(data);
        return ResponseEntity.ok(response);
    }


}
