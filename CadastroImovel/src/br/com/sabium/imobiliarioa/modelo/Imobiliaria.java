package br.com.sabium.imobiliarioa.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Imobiliaria implements OrdenacaoDeImoveis {

	private List<Imovel> listaImoveis;
	
	public Imobiliaria() {
		listaImoveis = new ArrayList<>();
	}
	
	public void adiciona(Imovel imovel) {
		listaImoveis.add(new ListaDeImoveis().validaAdicionarImovel(imovel, listaImoveis));
	}
	
	public void remove(Imovel imovel, List<Imovel> listaImovel) {
		listaImoveis.remove(new ListaDeImoveis().validaRemoverImovel(imovel, listaImovel));
	}

	@Override
	public void ordenarNumeroQuartos() {
		Collections.sort(listaImoveis, new ComparadorPornumeroQuartos());
		
	}

	@Override
	public void ordenarAreaTotal() {
		Collections.sort(listaImoveis, new ComparadorPorNumeroAreaTotal());	
	}

	public List<Imovel> getListaImoveis() {
		return listaImoveis;
	}

	@Override
	public void ordenarValorSugerido() {
		Collections.sort(listaImoveis, new ComparadorValorSugerido());
		
	}
	public double CalculaValorTotalDaLista() {
		return this.listaImoveis.stream().mapToDouble(Imovel::getValorSugerido).sum();
	}
	

}
