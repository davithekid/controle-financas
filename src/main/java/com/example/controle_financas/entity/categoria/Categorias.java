package com.example.controle_financas.entity.categoria;


import jakarta.persistence.*;

@Table(name = "categorias")
@Entity(name = "categorias")
public class Categorias {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    public Categorias() {
    }

    public Categorias(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Categorias(CategoriasRequestDTO data) {
        this.nome = data.nome();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
