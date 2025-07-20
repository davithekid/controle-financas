package com.example.controle_financas.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Table(name = "user")
@Entity(name = "user")
public class User {

    @Id
    @GeneratedValue (strategy = GenerationType.UUID)
    private UUID id;

    private String nome;

    private String email;

    private String senha;

    public User() {
    }

    public User(UUID id, String nome, String email, String senha) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
