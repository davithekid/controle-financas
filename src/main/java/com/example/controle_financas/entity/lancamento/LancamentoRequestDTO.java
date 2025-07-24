package com.example.controle_financas.entity.lancamento;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record LancamentoRequestDTO(@NotBlank String descricao,
                                   @NotNull Double valor) {

}
