package com.projetomobile.compras.model;

import java.util.Date;

import javax.persistence.Entity;

import com.projetomobile.compras.enuns.EstadoPagamento;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter@Setter
@NoArgsConstructor
public class PagamentoComBoleto extends Pagamento{

	private Date dataVencimento;
	private Date dataPagamento;
	
	public PagamentoComBoleto(Long id, EstadoPagamento estadoPg, Pedido pedido, Date dataVencimento, Date dataPagamento) {
		super(id, estadoPg, pedido);
		this.dataPagamento = dataPagamento;
		this.dataVencimento = dataVencimento;
	}
	
	
}
