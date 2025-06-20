package com.market.spring.entidades;

import com.market.spring.enums.Status;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
public class Carrinho {
    @Id
    @SequenceGenerator(name = "SEQ_CARRINHO", sequenceName = "SEQ_CARRINHO", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_CARRINHO")
    Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "COLUNA_STATUS")
    Status status;

    @CreationTimestamp()
    @Column(name = "COLUNA_DATA_CRIACAO")
    LocalDateTime dataCriacao;

    public Carrinho() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
