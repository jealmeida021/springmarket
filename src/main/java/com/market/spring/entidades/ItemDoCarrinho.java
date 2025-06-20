package com.market.spring.entidades;

import jakarta.persistence.*;

public class ItemDoCarrinho {

    @Id
    @SequenceGenerator(name = "SEQ_ITEMDOCARRINHO",sequenceName = "SEQ_ITEMDOCARRINHO",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_ITEMDOCARRINHO")
    @Column(name = "NOME_ITEMDOCARRINHO",nullable = false)

    Long id;

    @Column(name = "COLUNA_VALORDOITEM",nullable = false)
    double valorTotalDoItem;

    @Column(name = "COLUNA_QUANTIDADE",nullable = false)
    int quantidade;

    public ItemDoCarrinho(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getValorTotalDoItem() {
        return valorTotalDoItem;
    }

    public void setValorTotalDoItem(double valorTotalDoItem) {
        this.valorTotalDoItem = valorTotalDoItem;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
