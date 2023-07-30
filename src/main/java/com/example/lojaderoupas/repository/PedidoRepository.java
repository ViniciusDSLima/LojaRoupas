package com.example.lojaderoupas.repository;

import com.example.lojaderoupas.models.pedido.Pedido;
import org.springframework.data.repository.CrudRepository;

public interface PedidoRepository extends CrudRepository<Pedido, Long> {
}
