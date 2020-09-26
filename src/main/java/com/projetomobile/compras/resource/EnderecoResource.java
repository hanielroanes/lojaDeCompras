package com.projetomobile.compras.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetomobile.compras.model.Endereco;
import com.projetomobile.compras.service.EnderecoService;

@RestController
@RequestMapping("/enderecos")
public class EnderecoResource {

	@Autowired
	private EnderecoService enderecoService;
	
	@GetMapping("{id}")
	public ResponseEntity<Endereco> buscarEnderecoPorId(@PathVariable Long id){
		return enderecoService.buscarEnderecoPorId(id);
	}
	
}
