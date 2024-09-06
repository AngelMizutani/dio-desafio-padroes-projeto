package com.dio.desafio.api_categoria;

import com.dio.desafio.api_categoria.model.AtributosCategoria;
import com.dio.desafio.api_categoria.model.Categoria;
import com.dio.desafio.api_categoria.service.CategoriaService;
import com.dio.desafio.model.Personagem;

public class CategoriaFacade {

    public Personagem criarCategoria (String nome_categoria) {
        AtributosCategoria atributos = new AtributosCategoria();
        atributos = Categoria.getInstancia().definirAtributos(nome_categoria);

        return CategoriaService.definirCategoria(nome_categoria, atributos);

    }
}
