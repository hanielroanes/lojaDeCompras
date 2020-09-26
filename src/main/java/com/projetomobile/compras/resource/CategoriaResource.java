package com.projetomobile.compras.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetomobile.compras.model.Categoria;
import com.projetomobile.compras.service.CategoriaService;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {

	@Autowired
	private CategoriaService categoriaService;
	
	@GetMapping("{id}")
	public ResponseEntity<Categoria> buscarCategoriaPorId(@PathVariable Long id){
		return categoriaService.buscarCategoriaPorId(id);
	}
	
}
