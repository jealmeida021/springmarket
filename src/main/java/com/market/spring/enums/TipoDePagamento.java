package com.market.spring.enums;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.awt.image.PixelGrabber;

public class TipoDePagamento {


    @Enumerated(EnumType.STRING)
    @Column(name="enum_payment_type", nullable = false)
    private TipoDePagamento tipoDePagamento;

    CARTAO_DEBITO
            CARTAO_CREDITO
            PIX
    DINHEIRO

    public TipoDePagamento(TipoDePagamento tipoDePagamento) {
        this.tipoDePagamento = TipoDePagamento;
    }


}
