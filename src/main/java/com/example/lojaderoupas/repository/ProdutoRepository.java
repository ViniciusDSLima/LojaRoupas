package com.example.lojaderoupas.repository;

import com.example.lojaderoupas.models.produtos.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Long> {
}
