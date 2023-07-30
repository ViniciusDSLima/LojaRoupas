package com.example.lojaderoupas.models.pedido;

import com.example.lojaderoupas.DTO.DadosPedido;
import com.example.lojaderoupas.models.produtos.Produto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @OneToMany
    private List<Produto> produtos;

    public Pedido(DadosPedido dadosPedido) {
        this.nome = dadosPedido.getNome();
        this.produtos = (List<Produto>) dadosPedido.getProduto();
    }
}
