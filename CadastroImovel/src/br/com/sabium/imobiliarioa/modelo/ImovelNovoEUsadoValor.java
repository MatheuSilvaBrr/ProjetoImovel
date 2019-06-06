package br.com.sabium.imobiliarioa.modelo;

public class ImovelNovoEUsadoValor {
	
	public void valorFinalNovo(Imovel imovel) {
		double acrecimo = 0.1;
		double valorFinal = imovel.getValorSugerido() * acrecimo;
		imovel.setValorSugerido(imovel.getValorSugerido() + valorFinal);
		

	}
	public void valorFinalUsado(Imovel imovel) {
		double desconto = 0.1;
		double valorFinal = imovel.getValorSugerido() * desconto;
		imovel.setValorSugerido(imovel.getValorSugerido() - valorFinal);   

	}
}
