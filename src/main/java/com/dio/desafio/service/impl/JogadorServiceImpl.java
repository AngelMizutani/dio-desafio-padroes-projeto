package com.dio.desafio.service.impl;

import com.dio.desafio.model.Jogador;
import com.dio.desafio.model.Personagem;
import com.dio.desafio.repository.JogadorRepository;
import com.dio.desafio.repository.PersonagemRepository;
import com.dio.desafio.service.JogadorService;
import com.dio.desafio.service.PersonagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class JogadorServiceImpl implements JogadorService {
    @Autowired
    private JogadorRepository jogadorRepository;

    @Autowired
    private PersonagemRepository personagemRepository;

    @Autowired
    private PersonagemService personagemService;


    @Override
    public Iterable<Jogador> buscarTodos() {
        return jogadorRepository.findAll();
    }

    @Override
    public Jogador buscarPorId(Long id) {
        Optional<Jogador> jogador = jogadorRepository.findById(id);
        return jogador.get();
    }

    @Override
    public void inserir(Jogador jogador) {
        salvarJogador(jogador);
    }

    @Override
    public void atualizar(Long id, Jogador jogador) {
        Optional<Jogador> jogadorExistente = jogadorRepository.findById(id);
        if (jogadorExistente.isPresent()) {
            salvarJogador(jogador);
        }
    }

    @Override
    public void deletar(Long id) {
        jogadorRepository.deleteById(id);
    }

    private void salvarJogador(Jogador jogador) {
        String nome_categoria = jogador.getPersonagem().getNome_categoria();
        Personagem personagem = personagemRepository.findById(nome_categoria).orElseGet(() -> {
            Personagem novoPersonagem = personagemService.definirAtributos(nome_categoria);
            personagemRepository.save(novoPersonagem);
            return novoPersonagem;
        });
        jogador.setPersonagem(personagem);
        jogadorRepository.save(jogador);
    }
}
