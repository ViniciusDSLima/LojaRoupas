package com.example.lojaderoupas.DTO;

import com.example.lojaderoupas.models.pedido.Pedido;
import com.example.lojaderoupas.models.produtos.Produto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DadosCompra {
    private LocalDateTime data;
    private Pedido pedido;
    private Produto produto;
}
