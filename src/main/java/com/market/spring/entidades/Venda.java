package com.market.spring.entidades;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

public class Venda {


    @Id
    @SequenceGenerator(name = "SEQ_VENDA",sequenceName = "SEQ_VENDA",allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "SEQ_VENDA")
    @Column(name = "NOME_VENDA",nullable = false)

    @CreationTimestamp
    @Column(name="dat_create_at", nullable = false, updatable = false)
    private LocalDateTime localDateTime;


    Long id;

    @Column(name = "COLUNA_VALORTOTALDAVENDA",nullable = false)
    double valorTotalDaVenda;

    public Venda(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}
