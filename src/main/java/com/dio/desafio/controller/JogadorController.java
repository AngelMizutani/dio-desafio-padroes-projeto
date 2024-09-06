package com.dio.desafio.controller;

import com.dio.desafio.model.Jogador;
import com.dio.desafio.service.JogadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("jogadores")
public class JogadorController {
    @Autowired
    private JogadorService jogadorService;

    @GetMapping
    public ResponseEntity<Iterable<Jogador>> buscarTodos() {
        return ResponseEntity.ok(jogadorService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Jogador> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(jogadorService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Jogador> inserir(@RequestBody Jogador jogador) {
        jogadorService.inserir(jogador);
        return ResponseEntity.ok(jogador);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Jogador> atualizar(@PathVariable Long id, @RequestBody Jogador jogador) {
        jogadorService.atualizar(id, jogador);
        return ResponseEntity.ok(jogador);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Jogador> deletar(@PathVariable Long id) {
        jogadorService.deletar(id);
        return ResponseEntity.ok().build();
    }
}
