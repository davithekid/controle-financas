package com.example.controle_financas.service;

import com.example.controle_financas.entity.lancamento.LancamentoDTO;
import com.example.controle_financas.repository.LancamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LancamentoService {

    @Autowired
    private LancamentoRepository repository;

    public LancamentoService(LancamentoRepository repository) {
        this.repository = repository;
    }

    // GET
    public List<LancamentoDTO> getAllLancamentos() {
        return repository.findAll()
                .stream()
                .map(LancamentoDTO::new)
                .toList();
    }

}
