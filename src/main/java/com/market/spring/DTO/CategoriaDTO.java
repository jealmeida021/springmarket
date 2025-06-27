package com.market.spring.DTO;


/*
 Notblank - Valor não pode ser branco
  DTO - E uma classe usada para transportar dados entre camadas.
 Serve para separar o que chega na API e vai para o banco
 Não é uma entidade e nao se conecta direto ao banco
 */
import javax.validation.constraints.NotBlank;


public record CategoriaDTO(@NotBlank String categoriaDoProduto ) {


}
