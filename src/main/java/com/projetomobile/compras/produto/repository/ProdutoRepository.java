package com.projetomobile.compras.produto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetomobile.compras.produto.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
