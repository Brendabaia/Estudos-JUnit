package com.jovemprogramador.exercicio1;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TextoUtilsTest {
	
	private TextoUtils textoUtils;
	
	@BeforeEach
	void init() {
		textoUtils = new TextoUtils();
	}

	@Test
	void testContarVogais() {
		 assertEquals(2, textoUtils.contarVogais("TESTE"));
	}
	
	@Test
	 void testSemVogais() {
		assertEquals(0, textoUtils.contarVogais("bcdf"));
	}
	
	@Test
	 void testStringVazia() {
		assertEquals(0, textoUtils.contarVogais(""));
	}
}
