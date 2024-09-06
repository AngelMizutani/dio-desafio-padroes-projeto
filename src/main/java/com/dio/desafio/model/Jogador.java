package com.dio.desafio.model;

import jakarta.persistence.*;

@Entity
public class Jogador {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_jogador;

    private String username;

    @OneToOne
    private Personagem personagem;

    public Long getId_jogador() {
        return id_jogador;
    }

    public void setId_jogador(Long id_jogador) {
        this.id_jogador = id_jogador;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Personagem getPersonagem() {
        return personagem;
    }

    public void setPersonagem(Personagem personagem) {
        this.personagem = personagem;
    }
}
