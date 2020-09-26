package com.projetomobile.compras.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.projetomobile.compras.model.Cliente;
import com.projetomobile.compras.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;

	public ResponseEntity<Cliente> buscarClientePorId(Long id){
		Optional<Cliente> cliente = clienteRepository.findById(id);
		if(cliente.isEmpty()) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Cliente não encontrada!");
		}
		
		return ResponseEntity.ok().body(cliente.get());
	}
}
