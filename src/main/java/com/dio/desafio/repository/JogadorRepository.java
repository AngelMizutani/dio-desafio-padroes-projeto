package com.dio.desafio.repository;

import com.dio.desafio.model.Jogador;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JogadorRepository extends CrudRepository<Jogador, Long> {
}
