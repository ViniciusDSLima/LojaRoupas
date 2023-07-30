package com.example.lojaderoupas.controller;

import com.example.lojaderoupas.DTO.DadosCompra;
import com.example.lojaderoupas.service.CompraService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CompraController {

    @Autowired
    private CompraService compraService;

    @PostMapping("compra")
    public ResponseEntity realizarCompra(@RequestBody @Valid DadosCompra compra){
        compraService.realizaCompra(compra);

        return ResponseEntity.ok().body("Compra realizada com sucesso!");
    }

}
