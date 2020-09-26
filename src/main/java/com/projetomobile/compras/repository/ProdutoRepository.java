package com.projetomobile.compras.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetomobile.compras.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
