package com.ies.poo.heranca;

public class Peixe extends Animal {
	
	private String caracteristica;

	public Peixe(String nome, Float comprimento, Integer numeroDePatas, String cor, String ambiente,
			Float velocidadeMedia, String caracteristica) {
		super(nome, comprimento, numeroDePatas, cor, ambiente, velocidadeMedia);
		this.caracteristica = caracteristica;
		
	}
	
	// Opção dois onde o atributo alimento da classe mamifero não entrada no construtor.
	public Peixe(String nome, Float comprimento, Integer numeroDePatas, String cor, String ambiente,
			Float velocidadeMedia) {
		super(nome, comprimento, numeroDePatas, cor, ambiente, velocidadeMedia);
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	
	public String dadosDoPeixe() {
		return dados() + "\n" + 
				"Características: " + caracteristica;
	}
	
}
