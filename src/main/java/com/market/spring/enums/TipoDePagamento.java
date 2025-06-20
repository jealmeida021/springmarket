package com.market.spring.enums;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.awt.image.PixelGrabber;

public enum TipoDePagamento {


    CARTAO_DEBITO,
    CARTA0_CREDITO,
    PIX,
    DINHEIRO,

}