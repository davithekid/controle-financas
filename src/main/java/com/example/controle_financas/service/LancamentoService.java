package com.example.controle_financas.service;

import com.example.controle_financas.entity.lancamento.LancamentoRequestDTO;
import com.example.controle_financas.entity.lancamento.LancamentoResponseDTO;
import com.example.controle_financas.entity.lancamento.LancamentoUpdateDTO;
import com.example.controle_financas.entity.lancamento.Lancamentos;
import com.example.controle_financas.repository.LancamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;


@Service
public class LancamentoService {

    @Autowired
    private LancamentoRepository repository;

    public LancamentoService(LancamentoRepository repository) {
        this.repository = repository;
    }

    // GET
    public List<LancamentoResponseDTO> getAllLancamentos() {
        return repository.findAll()
                .stream()
                .map(LancamentoResponseDTO::new)
                .toList();
    }

    // POST
    public LancamentoResponseDTO postDTO(LancamentoRequestDTO data){
        Lancamentos entity = new Lancamentos(data);
        repository.save(entity);
        return new LancamentoResponseDTO(entity);
    }

    // PUT
    public void update(Integer id, LancamentoUpdateDTO updateDTO){

        if(!repository.existsById(id)){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Lançamento não encontrado");
        }

        var lancamentoEntity = repository.findById(id);
        var entity = lancamentoEntity.get();

        if(updateDTO.descricao() != null){
            entity.setDescricao(updateDTO.descricao());
        }

        if(updateDTO.valor() != null){
            entity.setValor(updateDTO.valor());
        }
        repository.save(entity);
    }

    // delete
    public void delete(Integer id){
        if(!repository.existsById(id)){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Lançamento não encontrado");
        }
        repository.deleteById(id);

    }

}
