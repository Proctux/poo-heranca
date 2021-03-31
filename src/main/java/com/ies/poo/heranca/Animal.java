package com.ies.poo.heranca;

public class Animal {
	private String nome;
	private Float comprimento;
	private Integer numeroDePatas;
	private String cor;
	private String ambiente;
	private Float velocidadeMedia;
	
	public Animal(String nome, Float comprimento, Integer numeroDePatas, String cor, String ambiente, Float velocidadeMedia) {
		this.nome = nome;
		this.comprimento = comprimento;
		this.numeroDePatas = numeroDePatas;
		this.cor = cor;
		this.ambiente = ambiente;
		this.velocidadeMedia = velocidadeMedia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Float getComprimento() {
		return comprimento;
	}

	public void setComprimento(Float comprimento) {
		this.comprimento = comprimento;
	}

	public Integer getNumeroDePatas() {
		return numeroDePatas;
	}

	public void setNumeroDePatas(Integer numeroDePatas) {
		this.numeroDePatas = numeroDePatas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public Float getVelocidadeMedia() {
		return velocidadeMedia;
	}

	public void setVelocidadeMedia(Float velocidadeMedia) {
		this.velocidadeMedia = velocidadeMedia;
	}
	
	public String dados() {
		return "Nome: " + nome + "\n" +
				"Comprimento: " + comprimento.toString() + " cm\n" +
				"Patas: " + numeroDePatas.toString() + "\n" +
				"Cor: " + cor + "\n" +
				"Ambiente: " + ambiente + "\n" +
				"Velocidade: " + velocidadeMedia.toString() + "m/s";
	}
}
