package br.com.marciel.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.marciel.loja.DomainException;
import br.com.marciel.loja.orcamento.Orcamento;

public class EmAnalise extends SituacaoOrcamento {

	@Override
	public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.05"));
	}

	@Override
	public void aprovar(Orcamento orcamento) throws DomainException {
		orcamento.setSituacao(new Aprovado());
	}
	
	@Override
	public void reprovar(Orcamento orcamento) throws DomainException {
		orcamento.setSituacao(new Reprovado());
	}

}
