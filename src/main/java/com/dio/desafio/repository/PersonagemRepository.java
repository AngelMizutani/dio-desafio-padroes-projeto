package com.dio.desafio.repository;

import com.dio.desafio.model.Personagem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonagemRepository extends CrudRepository<Personagem, String> {
}
