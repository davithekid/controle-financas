package com.example.controle_financas.entity.lancamento;

import java.time.LocalDateTime;
import java.util.UUID;

public record LancamentoDTO(Integer id, String descricao, LocalDateTime dataHora, Double valor, UUID user_id) {
    public LancamentoDTO(Lancamentos lancamento){
        this(lancamento.getId(),
                lancamento.getDescricao(),
                lancamento.getDataHora(),
                lancamento.getValor(),
                lancamento.getUser_id());
    }
}
