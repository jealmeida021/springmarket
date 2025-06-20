package com.market.spring.entidades;

import jakarta.persistence.*;

@Entity
public class Produto {
    @Id
    @SequenceGenerator(name = "SEQ_PRODUTO", sequenceName = "SEQ_PRODUTO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PRODUTO")
    Long id;

    @Column(name = "COLUNA_NOME", nullable = false)
    String nome;

    @Column(name = "COLUNA_PESO", nullable = false)
    int peso;

    @Column(name = "COLUNA_VALOR", nullable = false)
    double valor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COLUNA_CAT_ID", nullable = false)
    Categoria categoria;

    //Construtor principal
    public Produto() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
