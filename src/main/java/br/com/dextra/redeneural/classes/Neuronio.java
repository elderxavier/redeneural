package br.com.dextra.redeneural.classes;

public class Neuronio {

	protected Double conexoes[];
	
	public Neuronio(Integer nrConexoesEntrada) {
		this.conexoes = new Double[nrConexoesEntrada];
		this.inicializarConexoes();
	}
	
	protected void inicializarConexoes() {
		for (int i = 0; i < conexoes.length; i++) {
			conexoes[i] = Math.random();
		}
	}

	public Double propagarSinais(Double entradas[]) {
		Double integral = 0d;
		for (int i = 0; i < conexoes.length; i++) {
			integral += conexoes[i] * entradas[i];
		}
		return integral;
	}
	
}