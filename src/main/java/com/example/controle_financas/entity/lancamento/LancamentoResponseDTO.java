package com.example.controle_financas.entity.lancamento;

import java.time.LocalDateTime;
import java.util.UUID;

public record LancamentoResponseDTO(Integer id, String descricao, LocalDateTime dataHora, Double valor) {
    public LancamentoResponseDTO(Lancamentos lancamento){
        this(lancamento.getId(),
                lancamento.getDescricao(),
                lancamento.getDataHora(),
                lancamento.getValor());
    }
}
