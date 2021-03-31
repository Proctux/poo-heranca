package com.ies.poo.heranca;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestarAnimais {
	// Para os testes individuais, criei este global. Não foi solicitado, mas fiz como estudo complementar
	private Animal camelo;

	@Before
	public void configuracao() {
		camelo = new Animal("Camelo", 150F, 4, "Amarelo", "Terra", 2.0F);
	}
	
	@Test
	public void relatorioDadosAnimal() throws Exception {
		Animal camelo = new Animal("Camelo", 150F, 4, "Amarelo", "Terra", 2.0F);
		assertEquals(camelo.dados(), 
				"Nome: Camelo\n"
				+ "Comprimento: 150.0 cm\n"
				+ "Patas: 4\n"
				+ "Cor: Amarelo\n"
				+ "Ambiente: Terra\n"
				+ "Velocidade: 2.0m/s"
		);
	}
	
	@Test
	public void relatorioDadosDoPeixe() throws Exception {
		Peixe tubarao = new Peixe("Tubarão", 300F, 0, "Cinzento", "Mar", 1.5F, "Barbatanas e caudas");
		assertEquals(tubarao.dadosDoPeixe(),
				"Nome: Tubarão\n"
				+ "Comprimento: 300.0 cm\n"
				+ "Patas: 0\n"
				+ "Cor: Cinzento\n"
				+ "Ambiente: Mar\n"
				+ "Velocidade: 1.5m/s\n"
				+ "Características: Barbatanas e caudas"
		);
		
	}
	
	@Test
	public void relatorioDadosDoMamifero() throws Exception {
		Mamifero ursoDoCanada = new Mamifero("Urso-do-Canadá", 180F, 4, "Vermelho", "Terra", 0.5F, "Mel");
		assertEquals(ursoDoCanada.dadosDoMamifero(),
				"Nome: Urso-do-Canadá\n"
				+ "Comprimento: 180.0 cm\n"
				+ "Patas: 4\n"
				+ "Cor: Vermelho\n"
				+ "Ambiente: Terra\n"
				+ "Velocidade: 0.5m/s\n"
				+ "Alimento: Mel"
		);
		
	}
	
	@Test
	public void relatorioDadosDoPeixeUsandoSet() throws Exception {
		Peixe tubarao = new Peixe("Tubarão", 300F, 0, "Cinzento", "Mar", 1.5F);
		tubarao.setCaracteristica("Barbatanas e caudas");
		assertEquals(tubarao.dadosDoPeixe(),
				"Nome: Tubarão\n"
				+ "Comprimento: 300.0 cm\n"
				+ "Patas: 0\n"
				+ "Cor: Cinzento\n"
				+ "Ambiente: Mar\n"
				+ "Velocidade: 1.5m/s\n"
				+ "Características: Barbatanas e caudas"
		);
	}
	
	@Test
	public void relatorioDadosDoMamiferoUsandoSet() throws Exception {
		Mamifero ursoDoCanada = new Mamifero("Urso-do-Canadá", 180F, 4, "Vermelho", "Terra", 0.5F);
		ursoDoCanada.setAlimento("Mel");
		assertEquals(ursoDoCanada.dadosDoMamifero(),
				"Nome: Urso-do-Canadá\n"
				+ "Comprimento: 180.0 cm\n"
				+ "Patas: 4\n"
				+ "Cor: Vermelho\n"
				+ "Ambiente: Terra\n"
				+ "Velocidade: 0.5m/s\n"
				+ "Alimento: Mel"
		);
	}
	
	@Test
	public void todosOsGetsAnimal() throws Exception {
		assertEquals("Camelo", camelo.getNome());
		assertEquals(Float.valueOf(150), camelo.getComprimento());
		assertEquals(Integer.valueOf(4), camelo.getNumeroDePatas());
		assertEquals("Amarelo", camelo.getCor());
		assertEquals(Float.valueOf(2), camelo.getVelocidadeMedia());
	}
	
	@Test
	public void sobreEscrevendoNomeAnimal() throws Exception {
		camelo.setNome("Dromedário");
		assertEquals("Dromedário", camelo.getNome());
	}
	
	@Test
	public void sobreEscrevendoComprimentoAnimal() throws Exception {
		camelo.setComprimento(90F);
		assertEquals(Float.valueOf(90), camelo.getComprimento());
	}
	
	@Test
	public void sobreEscrevendoNumeroDePatasAnimal() throws Exception {
		// Camelo manco, teve que amputar uma perna por causa de um acidente
		camelo.setNumeroDePatas(3);
		assertEquals(Integer.valueOf(3), camelo.getNumeroDePatas());
	}
	
	@Test
	public void sobreEscrevendoCorAnimal() throws Exception {
		camelo.setCor("Marrom");
		assertEquals("Marrom", camelo.getCor());
	}
	
	@Test
	public void sobreEscrevendoVelocidadeMediaAnimal() throws Exception {
		camelo.setVelocidadeMedia(1.8F);
		assertEquals(Float.valueOf((float) 1.8), camelo.getVelocidadeMedia());
	}
	
}
