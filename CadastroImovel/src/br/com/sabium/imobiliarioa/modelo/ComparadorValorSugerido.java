package br.com.sabium.imobiliarioa.modelo;

import java.util.Comparator;

public class ComparadorValorSugerido implements Comparator<Imovel>{

	@Override
	public int compare(Imovel UmImovel, Imovel outroImovel) {
		
		return Double.compare(UmImovel.getValorSugerido(), outroImovel.getValorSugerido());
	}
	

}
