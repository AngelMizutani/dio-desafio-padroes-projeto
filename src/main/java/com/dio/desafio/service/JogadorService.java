package com.dio.desafio.service;

import com.dio.desafio.model.Jogador;

public interface JogadorService {
    Iterable<Jogador> buscarTodos();
    Jogador buscarPorId(Long id);
    void inserir(Jogador jogador);
    void atualizar(Long id, Jogador jogador);
    void deletar(Long id);
}
