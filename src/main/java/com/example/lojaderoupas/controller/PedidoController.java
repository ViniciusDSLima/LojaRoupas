package com.example.lojaderoupas.controller;

import com.example.lojaderoupas.DTO.DadosPedido;
import com.example.lojaderoupas.service.PedidoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pedido")
public class PedidoController {
    @Autowired
    private PedidoService pedidoService;

    @PostMapping("realizar")
    private ResponseEntity realizarPedido(@RequestBody @Valid DadosPedido dadosPedido){
        pedidoService.realizarPedido(dadosPedido);

        return ResponseEntity.ok().body("pedido cadastrado com sucesso!");
    }
}
