package com.example.lojaderoupas.service;

import com.example.lojaderoupas.DTO.DadosCompra;
import com.example.lojaderoupas.models.compra.Compra;
import com.example.lojaderoupas.repository.CompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompraService {

    @Autowired
    private CompraRepository compraRepository;

    public void realizaCompra(DadosCompra compra) {
        this.compraRepository.save(new Compra(compra));
    }
}
