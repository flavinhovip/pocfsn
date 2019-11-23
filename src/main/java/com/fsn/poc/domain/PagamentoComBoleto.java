package com.fsn.poc.domain;

import java.util.Date;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fsn.poc.domain.enuns.StatusPagamento;

@Entity
@JsonTypeName("pagamentoComBoleto")
public class PagamentoComBoleto extends Pagamento {
	private static final long serialVersionUID = 1L;
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date dtVencimento;
	
	@JsonFormat(pattern="dd/MM/yyyy")
	private Date dtPagamento;

	public PagamentoComBoleto() {

	}

	public PagamentoComBoleto(Integer id, StatusPagamento status, Pedido pedido, Date dtVencimento, Date dtPagamento) {
		super(id, status, pedido);
		this.dtVencimento = dtVencimento;
		this.dtPagamento = dtPagamento;
	}

	public Date getDtVencimento() {
		return dtVencimento;
	}

	public void setDtVencimento(Date dtVencimento) {
		this.dtVencimento = dtVencimento;
	}

	public Date getDtPagamento() {
		return dtPagamento;
	}

	public void setDtPagamento(Date dtPagamento) {
		this.dtPagamento = dtPagamento;
	}
	
	
	

}
