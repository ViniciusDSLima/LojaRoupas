package com.example.lojaderoupas.service;

import com.example.lojaderoupas.DTO.DadosPedido;
import com.example.lojaderoupas.models.pedido.Pedido;
import com.example.lojaderoupas.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;

    public void realizarPedido(DadosPedido dadosPedido) {
        this.pedidoRepository.save(new Pedido(dadosPedido));
    }
}
