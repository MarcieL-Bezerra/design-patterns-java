package br.com.marciel.loja.imposto;

import java.math.BigDecimal;

import br.com.marciel.loja.orcamento.Orcamento;

public class CalculadoraDeImpostos {

	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
		return imposto.calcular(orcamento);
	}

}
