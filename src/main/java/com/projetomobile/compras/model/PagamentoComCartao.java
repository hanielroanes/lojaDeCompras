package com.projetomobile.compras.model;

import javax.persistence.Entity;

import com.projetomobile.compras.enuns.EstadoPagamento;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter@Setter
@NoArgsConstructor
public class PagamentoComCartao extends Pagamento {

	private Integer numeroParcelas;

	public PagamentoComCartao(Long id, EstadoPagamento estadoPg, Pedido pedido,  Integer numeroParcelas) {
		super(id, estadoPg, pedido);
		this.numeroParcelas = numeroParcelas;
	}
	
	
}
