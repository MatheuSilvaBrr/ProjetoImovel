package br.com.sabium.imobiliarioa.modelo;

public class Endereco {
	private String logadouro;
	private String cidade;
	private int numero;
	
	public Endereco(String logadouro, String cidade, int numero) {
		super();
		this.logadouro = logadouro;
		this.cidade = cidade;
		this.numero = numero;
	}
	
	public String getLogadouro() {
		return logadouro;
	}
	public String getCidade() {
		return cidade;
	}
	
	public int getNumero() {
		return numero;
	}
}
