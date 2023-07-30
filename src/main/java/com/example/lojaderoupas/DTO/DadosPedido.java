package com.example.lojaderoupas.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DadosPedido {
    private String nome;
    private DadosProduto produto;
}
