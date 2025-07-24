package com.example.controle_financas.repository;

import com.example.controle_financas.entity.lancamento.Lancamentos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LancamentoRepository extends JpaRepository<Lancamentos, Integer> {

}
