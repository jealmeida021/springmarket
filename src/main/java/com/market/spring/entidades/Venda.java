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


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COLUNA_CARRINHO", nullable = false)
    Carrinho carrinho;


    public Venda(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public Venda() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public double getValorTotalDaVenda() {
        return valorTotalDaVenda;
    }

    public void setValorTotalDaVenda(double valorTotalDaVenda) {
        this.valorTotalDaVenda = valorTotalDaVenda;
    }

    public TipoDePagamento getTipoDePagamento() {
        return tipoDePagamento;
    }

    public void setTipoDePagamento(TipoDePagamento tipoDePagamento) {
        this.tipoDePagamento = tipoDePagamento;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }
}
