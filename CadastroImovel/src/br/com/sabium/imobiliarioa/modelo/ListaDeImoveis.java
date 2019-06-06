package br.com.sabium.imobiliarioa.modelo;

import java.util.List;

import br.com.sabium.imobiliarioa.exception.ImovelJaAdicionado;
import br.com.sabium.imobiliarioa.exception.ImovelNaoExisteNaLista;

public class ListaDeImoveis {

	public Imovel validaAdicionarImovel(Imovel imovel, List<Imovel> listaImoveis) {
		if (possuiImovel(imovel, listaImoveis)) {
			throw new ImovelJaAdicionado();
		} else {
			System.out.println("Imovel da rua " + imovel.getLogadouro() + " Foi adicionado");
			return imovel;
		}
	}

	public Imovel validaRemoverImovel(Imovel imovel, List<Imovel> listaImoveis) {
		if (possuiImovel(imovel, listaImoveis)) {
			System.out.println("Imovel da rua " + imovel.getLogadouro() + " removido da lista");
			return imovel;
		} else {
			throw new ImovelNaoExisteNaLista();
		}
	}

	public boolean possuiImovel(Imovel imovel, List<Imovel> listaImoveis) {
		return listaImoveis.contains(imovel);
	}
}
