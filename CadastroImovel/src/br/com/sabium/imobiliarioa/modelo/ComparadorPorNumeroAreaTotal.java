package br.com.sabium.imobiliarioa.modelo;
import java.util.Comparator;

public class ComparadorPorNumeroAreaTotal implements Comparator<Imovel> {

	@Override
	public int compare(Imovel umImovel, Imovel outroImovel) {		
		return Integer.compare(umImovel.getAreaTotal(), outroImovel.getAreaTotal());
	}
}
