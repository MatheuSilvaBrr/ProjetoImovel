package br.com.sabium.imobiliarioa.exception;

public class ImovelJaAdicionado extends RuntimeException {
	
	@Override
	public String getMessage() {
		return "ESSE IMOVEL J� FOI ADICIONADO";
	}

}
