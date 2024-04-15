package br.com.marciel.loja.pedido.acoes;

import br.com.marciel.loja.pedido.Pedido;

public class EnviarPedidoPorEmail implements AcaoAposGerarPedido {
	
	public void executarAcao(Pedido pedido) {
		System.out.println("Enviando email para cliente sobre pedido...");
	}

}
