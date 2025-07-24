package com.example.controle_financas.entity.lancamento;

import java.time.LocalDateTime;

public record LancamentoResponseDTO(Integer id, String descricao, LocalDateTime dataHora, Double valor, Integer categoriaId) {
    public LancamentoResponseDTO(Lancamentos lancamento){
        this(lancamento.getId(),
                lancamento.getDescricao(),
                lancamento.getDataHora(),
                lancamento.getValor(),
                lancamento.getCategoriaId());
    }
}
