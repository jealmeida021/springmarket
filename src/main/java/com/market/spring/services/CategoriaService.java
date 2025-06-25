package com.market.spring.services;
/*
Service para guardar os metodos
 */

import com.market.spring.DTO.CategoriaRequestDTO;
import com.market.spring.entidades.Categoria;
import com.market.spring.repositories.CategoriaRepositorio;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {

    private final CategoriaRepositorio categoriaRepositorio;

    //construtor
    public CategoriaService(CategoriaRepositorio categoriaRepositorio) {
        this.categoriaRepositorio = categoriaRepositorio;
    }

    public Categoria createCategoria(CategoriaRequestDTO categoriaRequestDTO) {
        Categoria categoria = new Categoria();
        categoria.setCategoriaDoProduto(categoriaRequestDTO.categoriaDoProduto());
        return categoriaRepositorio.save(categoria);

    }
}
