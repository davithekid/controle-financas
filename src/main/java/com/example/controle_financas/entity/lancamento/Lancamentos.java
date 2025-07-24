package com.example.controle_financas.entity.lancamento;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Table(name = "lancamentos")
@Entity(name = "lancamentos")
public class Lancamentos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String descricao;

    private Double valor;

    @Column(name = "dataHora", columnDefinition = "DATETIME")
    private LocalDateTime dataHora;

    public Lancamentos(LancamentoRequestDTO data) {
        this.descricao = data.descricao();
        this.valor = data.valor();
    }

    // método para definir a hora e torna-la persistente
    @PrePersist
    protected void onCreate() {
        this.dataHora = LocalDateTime.now();
    }

    public Lancamentos() {
    }

    public Lancamentos(Integer id, String descricao, LocalDateTime dataHora, Double valor) {
        this.id = id;
        this.descricao = descricao;
        this.dataHora = dataHora;
        this.valor = valor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
}
