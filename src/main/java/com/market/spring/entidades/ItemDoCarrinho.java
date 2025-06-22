package com.market.spring.entidades;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class ItemDoCarrinho {
    @Id
    @SequenceGenerator(name = "SEQ_ITEMDOCARRINHO", sequenceName = "SEQ_ITEMDOCARRINHO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_ITEMDOCARRINHO")
    Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COLUNA_PRODUTO", nullable = false)
    Produto produto;

    @Column(name = "COLUNA_VALORDOITEM", nullable = false)
    BigDecimal valorTotalDoItem;

    @Column(name = "COLUNA_QUANTIDADE", nullable = false)
    int quantidade;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COLUNA_CARRINHO", nullable = false)
    Carrinho carrinho;


    public ItemDoCarrinho() {

    }




    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getValorTotalDoItem() {
        return valorTotalDoItem;
    }

    public void setValorTotalDoItem(BigDecimal valorTotalDoItem) {
        this.valorTotalDoItem = valorTotalDoItem;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
