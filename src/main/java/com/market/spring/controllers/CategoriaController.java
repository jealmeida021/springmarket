package com.market.spring.controllers;

import com.market.spring.DTO.CategoriaRequestDTO;
import com.market.spring.entidades.Categoria;
import com.market.spring.services.CategoriaService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    /*
    Toda logica deve estar na SERVICE, nunca na CONTROLLER.
    Então a controle vai chamar a SERVICE para resolver a requisição

     */

    private final CategoriaService categoriaService;

//construtor
    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }

    @PostMapping("/criar-categoria")
    public Categoria creatCategoria(@RequestBody CategoriaRequestDTO categoriaRequestDTO){
        return categoriaService.createCategoria(categoriaRequestDTO);
    }
}




