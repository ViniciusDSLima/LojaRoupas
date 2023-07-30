package com.example.lojaderoupas.models.compra;

import com.example.lojaderoupas.DTO.DadosCompra;
import com.example.lojaderoupas.models.pedido.Pedido;
import com.example.lojaderoupas.models.produtos.Produto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Compra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Pedido pedido;
    @ManyToMany
    @JoinTable(
            name = "compra_produtos",
            joinColumns = @JoinColumn(name = "compra_id"),
            inverseJoinColumns = @JoinColumn(name = "produto_id")
    )
    private List<Produto> produtos;
    private LocalDateTime data;

    public Compra(DadosCompra compra) {
        this.pedido = compra.getPedido();
    }
}
