package com.projetomobile.compras.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.projetomobile.compras.model.Endereco;
import com.projetomobile.compras.repository.EnderecoRepository;

@Service
public class EnderecoService {
	
	@Autowired
	private EnderecoRepository enderecoRepository;

	public ResponseEntity<Endereco> buscarEnderecoPorId(Long id){
		Optional<Endereco> endereco = enderecoRepository.findById(id);
		if(endereco.isEmpty()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Endereco não encontrada!");
		}
		
		return ResponseEntity.ok().body(endereco.get());
	}
}
