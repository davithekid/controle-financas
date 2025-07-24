package com.example.controle_financas.controller;

import com.example.controle_financas.entity.categoria.CategoriasResponseDTO;
import com.example.controle_financas.service.CategoriasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


}
