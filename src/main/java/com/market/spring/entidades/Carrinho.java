package com.market.spring.entidades;

import jakarta.persistence.*;

public class Carrinho {

    @Id
    @SequenceGenerator(name = "SEQ_CARRINHO",sequenceName = "SEQ_CARRINHO",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_CARRINHO")
    @Column(name = "NOME_CARRINHO",nullable = false)

    Long id;

    public Carrinho(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
