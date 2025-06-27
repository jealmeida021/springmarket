package com.market.spring.controllers;

import com.market.spring.DTO.CategoriaDTO;
import com.market.spring.entidades.Categoria;
import com.market.spring.services.CategoriaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {

    private final CategoriaService categoriaService;

    // Construtor
    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    // CREATE - Criar nova categoria
    @PostMapping("/criar")
    public ResponseEntity<Categoria> criarCategoria(@RequestBody CategoriaDTO categoriaDTO) {
        Categoria novaCategoria = categoriaService.createCategoria(categoriaDTO);
        return ResponseEntity.ok(novaCategoria);
    }

    // READ - Buscar categoria por ID
    @GetMapping("/{id}")
    public ResponseEntity<Categoria> buscarPorId(@PathVariable Long id) {
        Optional<Categoria> categoria = categoriaService.getCategoriaById(id);
        return categoria.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // READ - Listar todas as categorias
    @GetMapping
    public ResponseEntity<List<Categoria>> listarTodas() {
        List<Categoria> categorias = categoriaService.getAllCategorias();
        return ResponseEntity.ok(categorias);
    }

    // UPDATE - Atualizar categoria
    @PutMapping("/atualizar/{id}")
    public ResponseEntity<Categoria> atualizarCategoria(@PathVariable Long id, @RequestBody CategoriaDTO categoriaDTO) {
        Optional<Categoria> categoriaAtualizada = categoriaService.updateCategoria(id, categoriaDTO);
        return categoriaAtualizada.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // DELETE - Excluir categoria
    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<Void> deletarCategoria(@PathVariable Long id) {
        boolean deletado = categoriaService.deleteCategoria(id);
        if (deletado) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
