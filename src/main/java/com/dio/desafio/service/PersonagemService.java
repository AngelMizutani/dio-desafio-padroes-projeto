package com.dio.desafio.service;

import com.dio.desafio.api_categoria.CategoriaFacade;
import com.dio.desafio.api_categoria.model.Categoria;
import com.dio.desafio.model.Personagem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonagemService {
    public Personagem definirAtributos(String nome_categoria) {
        CategoriaFacade facade = new CategoriaFacade();
        return facade.criarCategoria(nome_categoria);
    };
}
