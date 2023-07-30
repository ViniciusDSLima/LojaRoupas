package com.example.lojaderoupas.models.produtos;

import com.example.lojaderoupas.DTO.DadosProduto;
import com.example.lojaderoupas.models.pedido.Pedido;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Double preco;
    @Enumerated(EnumType.STRING)
    private Descricao descricao;
    private int quantidade;
    @ManyToOne
    private Pedido pedido;

    public Produto(DadosProduto dadosProduto) {
        this.nome = dadosProduto.getNome();
        this.preco = dadosProduto.getPreco();
        this.descricao = dadosProduto.getDescricao();
        this.quantidade = dadosProduto.getQuantidade();
    }
}
