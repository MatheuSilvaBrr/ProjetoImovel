package br.com.sabium.imobiliarioa.modelo;

import java.util.List;

public class CalculaTotalDaLista extends Imovel{
	
	public void TotalDaLista(List<Imovel> imoveis) {	
		double valor =  0;
		for (Imovel imovel : imoveis) {
			valor += imovel.getValorSugerido();	
		}
		System.out.println("Valor total dos alugueis " + valor);
		
	}


}
