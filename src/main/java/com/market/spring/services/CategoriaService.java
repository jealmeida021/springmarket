package com.market.spring.services;

import com.market.spring.DTO.CategoriaDTO;
import com.market.spring.entidades.Categoria;
import com.market.spring.repositories.CategoriaRepositorio;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaService {

    private final CategoriaRepositorio categoriaRepositorio;

    // Construtor
    public CategoriaService(CategoriaRepositorio categoriaRepositorio) {
        this.categoriaRepositorio = categoriaRepositorio;
    }

    // CREATE
    public Categoria createCategoria(CategoriaDTO categoriaDTO) {
        Categoria categoria = new Categoria();
        categoria.setCategoriaDoProduto(categoriaDTO.categoriaDoProduto());
        return categoriaRepositorio.save(categoria);
    }

    // READ - Buscar por ID
    public Optional<Categoria> getCategoriaById(Long id) {
        return categoriaRepositorio.findById(id);
    }

    // READ - Listar todas
    public List<Categoria> getAllCategorias() {
        return categoriaRepositorio.findAll();
    }

    // UPDATE
    public Optional<Categoria> updateCategoria(Long id, CategoriaDTO categoriaDTO) {
        Optional<Categoria> optionalCategoria = categoriaRepositorio.findById(id);
        if (optionalCategoria.isPresent()) {
            Categoria categoria = optionalCategoria.get();
            categoria.setCategoriaDoProduto(categoriaDTO.categoriaDoProduto());
            categoriaRepositorio.save(categoria);
            return Optional.of(categoria);
        }
        return Optional.empty(); // Categoria não encontrada
    }

    // DELETE
    public boolean deleteCategoria(Long id) {
        if (categoriaRepositorio.existsById(id)) {
            categoriaRepositorio.deleteById(id);
            return true;
        }
        return false; // Categoria não encontrada
    }
}
