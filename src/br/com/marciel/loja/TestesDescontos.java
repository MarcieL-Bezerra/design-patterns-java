package br.com.marciel.loja;

import java.math.BigDecimal;

import br.com.marciel.loja.desconto.CalculadoraDeDescontos;
import br.com.marciel.loja.orcamento.Orcamento;

public class TestesDescontos {

	public static void main(String[] args) {
		Orcamento primeiro = new Orcamento(new BigDecimal("200"), 6);
		Orcamento segundo = new Orcamento(new BigDecimal("1000"), 2);
		Orcamento terceiro = new Orcamento(new BigDecimal("500"), 1);

		CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
		System.out.println(calculadora.calcular(primeiro));
		System.out.println(calculadora.calcular(segundo));
		System.out.println(calculadora.calcular(terceiro));
	}

}
