package com.market.spring.entidades;

import jakarta.persistence.*;

public class Produto {

    @Id
            @SequenceGenerator(name = "SEQ_PRODUTO",sequenceName = "SEQ_PRODUTO",allocationSize = 1)
            @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_PRODUTO")
            @Column(name = "NOME_PRODUTO",nullable = false)
    Long id;
    String nome;
    int peso;
    double valor;

    //Construtor principal
    public Produto(){

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
