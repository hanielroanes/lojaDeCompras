package com.projetomobile.compras.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetomobile.compras.model.Cliente;
import com.projetomobile.compras.service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteResource {

	@Autowired
	private ClienteService clienteService;
	
	@GetMapping("{id}")
	public ResponseEntity<Cliente> buscarClientePorId(@PathVariable Long id){
		return clienteService.buscarClientePorId(id);
	}
	
}
