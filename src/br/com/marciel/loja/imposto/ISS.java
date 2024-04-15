package br.com.marciel.loja.imposto;

import java.math.BigDecimal;

import br.com.marciel.loja.orcamento.Orcamento;

public class ISS {
	
	public BigDecimal calcular(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.06"));
	}

}
