package br.com.sabium.imobiliarioa.exception;

public class ImovelNaoExisteNaLista extends RuntimeException {
	
	@Override
	public String getMessage() {
		return "Imovel n�o existe na lista";
	}

}
