package com.example.controle_financas.controller;

import com.example.controle_financas.entity.lancamento.LancamentoRequestDTO;
import com.example.controle_financas.entity.lancamento.LancamentoResponseDTO;
import com.example.controle_financas.entity.lancamento.LancamentoUpdateDTO;
import com.example.controle_financas.service.LancamentoService;
import jakarta.validation.Valid;
import org.hibernate.sql.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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
    public List<LancamentoResponseDTO> getAll(){
        return service.getAllLancamentos();
    }

    @PostMapping
    public ResponseEntity<LancamentoResponseDTO> postDTO(@RequestBody @Valid LancamentoRequestDTO data){
        LancamentoResponseDTO response = service.postDTO(data);
        return ResponseEntity.ok(response);
    }

    @PutMapping("{id}")
    public ResponseEntity<Void> updateById(@PathVariable("id")Integer id, @RequestBody LancamentoUpdateDTO updateDTO){
        service.update(id, updateDTO);
        return ResponseEntity.noContent().build();
    }

}
