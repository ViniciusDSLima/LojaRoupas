package com.example.lojaderoupas.DTO;

import com.example.lojaderoupas.models.produtos.Descricao;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class DadosProduto {
    @NotBlank
    private String nome;
    @NotNull
    private Double preco;
    @NotNull
    private Descricao descricao;
    @NotNull
    private int quantidade;
}
