package br.com.marciel.loja.imposto;

import java.math.BigDecimal;

import br.com.marciel.loja.orcamento.Orcamento;

public interface Imposto {

	BigDecimal calcular(Orcamento orcamento);

}
