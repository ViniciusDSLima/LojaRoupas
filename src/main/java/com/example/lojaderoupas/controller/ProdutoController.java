package com.example.lojaderoupas.controller;

import com.example.lojaderoupas.DTO.DadosCompra;
import com.example.lojaderoupas.DTO.DadosProduto;
import com.example.lojaderoupas.service.ProdutoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("produto")
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;

    @PostMapping("cadastrar")
    public ResponseEntity cadastrarProduto(@RequestBody @Valid DadosProduto dadosProduto){
        produtoService.salvarProduto(dadosProduto);

        return ResponseEntity.ok().body("Produto cadastrado com sucesso!");
    }
}
