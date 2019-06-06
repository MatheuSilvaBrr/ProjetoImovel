package br.com.sabium.imobiliarioa.modelo.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.sabium.imobiliarioa.modelo.CalculaTotalDaLista;
import br.com.sabium.imobiliarioa.modelo.Imobiliaria;
import br.com.sabium.imobiliarioa.modelo.Imovel;
import br.com.sabium.imobiliarioa.modelo.ListaDeImoveis;
import br.com.sabium.imobiliarioa.modelo.TipoImovel;

public class App {
	public static void main(String[] args) {
		
		Imobiliaria imobiliaria = new Imobiliaria();
		
		Imovel test = new Imovel("Av.Maringa", 18, "Sarandi", 4, 4, 160,400, 1500, TipoImovel.APARTAMENTO);
		test.imovelUsadoValorFinal(test);
		
		Imovel test2 = new Imovel("Av.Rio de Janeniro", 38, " Maringa", 2, 2, 120,130, 1900, TipoImovel.CASA);
		test.imovelUsadoValorFinal(test2);

		Imovel test3 = new Imovel("Av.Rio de Maringa", 38, " Maringa", 6, 7, 200,280, 2200, TipoImovel.SALÃO);
		test.imovelUsadoValorFinal(test3);
		
		Imovel test4 = new Imovel("Duque", 12, "Ouro", 3, 1, 600, 650, 3000, TipoImovel.CASA);
		test.imovelUsadoValorFinal(test4);
		
		Imovel test5 = new Imovel("Muiata", 18, "Sarandi", 3, 2, 120, 300, 1300, TipoImovel.APARTAMENTO);
				
		
		imobiliaria.adiciona(test);
		imobiliaria.adiciona(test2);
		imobiliaria.adiciona(test4);
		
		
		imobiliaria.ordenarNumeroQuartos();


		
		for (Imovel imovel : imobiliaria.getListaImoveis()) {
			System.out.println("-----------");
			System.out.println(imovel);
			
		}
			
		
		
	
		imobiliaria.CalculaValorTotalDaLista();
		
		
		
		
		
//		Comparator<Imovel> comp = ( imovel1, imovel2) -> {
//			Double imovelC1 = imovel1.getValorSugerido();
//			Double imovelC2 = imovel2.getValorSugerido();
//			return imovelC2.compareTo(imovelC1);
//		};


		
		

	
	}
}



