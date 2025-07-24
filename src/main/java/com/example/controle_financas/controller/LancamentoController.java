package com.example.controle_financas.controller;

import com.example.controle_financas.entity.lancamento.LancamentoDTO;
import com.example.controle_financas.repository.LancamentoRepository;
import com.example.controle_financas.service.LancamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("lancamentos")
public class LancamentoController {

    @Autowired
    private LancamentoService service;

    public LancamentoController(LancamentoService service) {
        this.service = service;
    }

    @GetMapping
    public List<LancamentoDTO> getAll(){
        return service.getAllLancamentos();
    }

}
