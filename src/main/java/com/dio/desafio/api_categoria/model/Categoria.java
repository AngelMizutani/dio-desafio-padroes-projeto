package com.dio.desafio.api_categoria.model;

public class Categoria {
    private static Categoria instancia = new Categoria();

    private Categoria() {super();}

    public static Categoria getInstancia() {
        return instancia;
    }

    public AtributosCategoria definirAtributos (String nome_categoria) {
        AtributosCategoria atributosCategoria = new AtributosCategoria();
        atributosCategoria.setNome_categoria(nome_categoria);
        switch (nome_categoria) {
            case "mago":
                atributosCategoria.setAtaque(50);
                atributosCategoria.setDefesa(100);
                atributosCategoria.setInteligencia(90);
                atributosCategoria.setAgilidade(50);
                break;

            case "elfo":
                atributosCategoria.setAtaque(80);
                atributosCategoria.setDefesa(80);
                atributosCategoria.setInteligencia(100);
                atributosCategoria.setAgilidade(90);
                break;

            case "guerreiro":
                atributosCategoria.setAtaque(100);
                atributosCategoria.setDefesa(80);
                atributosCategoria.setInteligencia(70);
                atributosCategoria.setAgilidade(90);
                break;

            case "orc":
                atributosCategoria.setAtaque(100);
                atributosCategoria.setDefesa(90);
                atributosCategoria.setInteligencia(50);
                atributosCategoria.setAgilidade(60);
                break;
        }

        return atributosCategoria;
    }
}
