package com.projetomobile.compras.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetomobile.compras.model.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long> {

}
