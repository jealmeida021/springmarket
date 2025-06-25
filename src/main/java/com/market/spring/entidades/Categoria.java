package com.market.spring.entidades;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Categoria {
    @Id // Marca o atributo como chave primaria para persistir no banco de dados
    @SequenceGenerator(name = "SEQ_CATEGORIA", sequenceName = "SEQ_CATEGORIA", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CATEGORIA")
    Long id;

    @Column(name = "NOME_CATEGORIA",nullable = false)
    String categoriaDoProduto;

    //Novo atributo
    @OneToMany(mappedBy =)
    private List<Produto>produtos = new ArrayList<>();

    public  Categoria(){

    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoriaDoProduto() {
        return categoriaDoProduto;
    }

    public void setCategoriaDoProduto(String categoriaDoProduto) {
        this.categoriaDoProduto = categoriaDoProduto;
    }
}
