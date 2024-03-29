package com.fsn.poc.services;

import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Service;

import com.fsn.poc.domain.PagamentoComBoleto;

@Service
public class BoletoService {

	public void preencherPagamentoComBoleto(PagamentoComBoleto pagto, Date dtPedido) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(dtPedido);
		cal.add(Calendar.DAY_OF_MONTH, 7);
		pagto.setDtVencimento(cal.getTime());
	}
}



