package com.market.spring.entidades;

import com.market.spring.enums.TipoDePagamento;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
public class Venda {
    @Id
    @SequenceGenerator(name = "SEQ_VENDA", sequenceName = "SEQ_VENDA", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_VENDA")
    Long id;

    @CreationTimestamp
    @Column(name = "dat_create_at", nullable = false, updatable = false)
    private LocalDateTime localDateTime;




    @Column(name = "COLUNA_VALORTOTALDAVENDA", nullable = false)
    double valorTotalDaVenda;

    @Column(name = "COLUNA_TIPOPAGAMENTO")
    TipoDePagamento tipoDePagamento;


    public Venda(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public Venda(){

    }
}
