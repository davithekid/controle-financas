package com.example.controle_financas.entity.lancamento;


import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Table(name = "lancamentos")
@Entity(name = "lancamentos")
public class Lancamentos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String descricao;

    private UUID user_id;

    private Double valor;

    @Column(name = "dataHora", columnDefinition = "DATETIME")
    private LocalDateTime dataHora;

    // método para definir a hora e torna-la persistente
    @PrePersist
    protected void onCreate() {
        this.dataHora = LocalDateTime.now();
    }

    public Lancamentos() {
    }

    public Lancamentos(Integer id, String descricao, LocalDateTime dataHora, Double valor, UUID user_id) {
        this.id = id;
        this.descricao = descricao;
        this.dataHora = dataHora;
        this.valor = valor;
        this.user_id = user_id;
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

    public UUID getUser_id() {
        return user_id;
    }

    public void setUser_id(UUID user_id) {
        this.user_id = user_id;
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
