package com.example.lojaderoupas.service;

import com.example.lojaderoupas.DTO.DadosProduto;
import com.example.lojaderoupas.models.produtos.Produto;
import com.example.lojaderoupas.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;

    public void salvarProduto(DadosProduto dadosProduto) {
        this.produtoRepository.save(new Produto(dadosProduto));
    }
}
