package com.dio.desafio.api_categoria.service;

import com.dio.desafio.api_categoria.model.AtributosCategoria;
import com.dio.desafio.model.Personagem;

public class CategoriaService {
    private CategoriaService() {super();}

    public static Personagem definirCategoria (String nome_categoria, AtributosCategoria atributos) {
        Personagem personagem = new Personagem();
        personagem.setNome_categoria(nome_categoria);
        personagem.setAtaque(atributos.getAtaque());
        personagem.setDefesa(atributos.getDefesa());
        personagem.setInteligencia(atributos.getInteligencia());
        personagem.setAgilidade(atributos.getAgilidade());

        return personagem;
    }
}
