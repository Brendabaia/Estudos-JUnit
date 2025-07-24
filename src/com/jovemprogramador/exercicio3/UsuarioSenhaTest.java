package com.jovemprogramador.exercicio3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UsuarioSenhaTest {
	private UsuarioSenha usuarioSenha;

	@BeforeEach
	void setUp() {
		usuarioSenha = new UsuarioSenha();
	}

	@Test
	void testSenhaValidaTrue() {
		assertTrue(usuarioSenha.senhaValida("S3nhaValid4"));
	}
	@Test
	void testSenhaValidaFalse() {
		assertFalse(usuarioSenha.senhaValida("senha"));
	}
	
	@Test
	void testSenhaValidaSemMaiuscula() {
		assertFalse(usuarioSenha.senhaValida("senha123"));
	}	

}