package com.projetomobile.compras.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.projetomobile.compras.model.Categoria;
import com.projetomobile.compras.repository.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	public ResponseEntity<Categoria> buscarCategoriaPorId(Long id){
		Optional<Categoria> categoria = categoriaRepository.findById(id);
		if(categoria.isEmpty()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Categoria não encontrada!");
		}
		
		return ResponseEntity.ok().body(categoria.get());
	}
}
