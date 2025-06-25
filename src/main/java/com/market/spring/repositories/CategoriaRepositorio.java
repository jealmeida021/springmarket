package com.market.spring.repositories;

import com.market.spring.entidades.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// Interface é um contrato,a  partir do momento que for implementada deve ser implementado

@Repository
public interface CategoriaRepositorio  extends JpaRepository<Categoria,Long> {

}
