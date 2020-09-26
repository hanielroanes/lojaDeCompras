package com.projetomobile.compras.enuns;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import lombok.Getter;

@Getter
public enum EstadoPagamento {

	PENDENTE(1,"Pendente"),
	QUITADO(2,"Quitado"),
	CANCELADO(3, "Cancelado");
	
	private int cod;
	private String descricao;
	
	private EstadoPagamento(int cod, String descricao) {
		this.cod = cod;
		this.descricao = descricao;
	}
	
	public static EstadoPagamento toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		for(EstadoPagamento x : EstadoPagamento.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Codigo de tipoCliente inexistente");
	}
	
	
}
