package br.com.sabium.imobiliarioa.modelo;

public class Imovel {


	private int numeroQuartos;
	private int numeroBanheiros;
	private int areaUtil;
	private int areaTotal;
	private double valorSugerido;
	private TipoImovel tipoImovel;
	private Endereco endereco;
	
	public Imovel() {
		
	}
	public Imovel(int numeroQuartos, int numeroBanheiros, int areaUtil, int areaTotal,
			double valorSugerido, TipoImovel tipoImovel) {

		if (numeroQuartos < 1) {
			throw new RuntimeException("Numero de quartos deve ser mair que zero");
		}
		if (numeroBanheiros < 1) {
			throw new RuntimeException("Numero de banheiros deve ser maior que zero");
		}
		if (areaTotal <= areaUtil) {
			throw new RuntimeException("Area ultil deve ser maior que a area total");
		}
		if (valorSugerido <= 0) {
			throw new RuntimeException("O valor sugerido de aluguel deve ser maior que zero");
		}

		this.numeroQuartos = numeroQuartos;
		this.numeroBanheiros = numeroBanheiros;
		this.areaUtil = areaUtil;
		this.areaTotal = areaTotal;
		this.valorSugerido = valorSugerido;
		this.tipoImovel = tipoImovel;
			
	}

	@Override
	public String toString() {
		return "Informacoes Imovel \nEndereço: " + this.endereco + "\nNumeroQuartos: " + numeroQuartos
				+ "\nNumeroBanheiros: " + numeroBanheiros + "\nAreaTotaç: " + areaTotal + "\nValorSugerido: "
				+ valorSugerido + "\nTipoImovel: " + tipoImovel;
	}

	public void imovelNovoValorFinal(Imovel imovel) {
		ImovelNovoEUsadoValor novo = new ImovelNovoEUsadoValor();
		novo.valorFinalNovo(imovel);
	}

	public void imovelUsadoValorFinal(Imovel imovel) {
		ImovelNovoEUsadoValor usado = new ImovelNovoEUsadoValor();
		usado.valorFinalUsado(imovel);
	}
	

	public int getNumeroQuartos() {
		return numeroQuartos;
	}

	public int getNumeroBanheiros() {
		return numeroBanheiros;
	}

	public int getAreaUtil() {
		return areaUtil;
	}
	
	public double getValorSugerido() {
		return valorSugerido;
	}

	public TipoImovel getTipoImovel() {
		return tipoImovel;
	}

	public boolean inserir(Imovel outro) {
		return this.endereco.equals(outro.endereco);
	}

	public int getAreaTotal() {
		return areaTotal;
	}



}
