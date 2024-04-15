package br.com.marciel.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.marciel.loja.DomainException;
import br.com.marciel.loja.orcamento.Orcamento;

public class Finalizado extends SituacaoOrcamento {

	@Override
	public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
		throw new DomainException("Orcamento finalizado nao pode ter desconto extra!");
	}

}
