package com.ies.poo.heranca;

public class Mamifero extends Animal {
	
	private String alimento;

	public Mamifero(String nome, Float comprimento, Integer numeroDePatas, String cor, String ambiente,
			Float velocidadeMedia, String alimento) {
		super(nome, comprimento, numeroDePatas, cor, ambiente, velocidadeMedia);
		this.alimento = alimento;
	}
	
	
	// Opção dois onde o atributo alimento da classe mamifero não entrada no construtor.
	public Mamifero(String nome, Float comprimento, Integer numeroDePatas, String cor, String ambiente,
			Float velocidadeMedia) {
		super(nome, comprimento, numeroDePatas, cor, ambiente, velocidadeMedia);
	}



	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = alimento;
	}
	
	public String dadosDoMamifero() {
		return dados() + "\n" +
				"Alimento: " + alimento;
	}
	
}
