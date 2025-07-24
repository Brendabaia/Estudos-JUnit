package com.jovemprogramador.exercicio2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringUtilsTest {
	
   private StringUtils stringUtils;

	@BeforeEach
	void setUp(){
		 stringUtils = new StringUtils();
	}

	@Test
	void testIsPalindromoTrue() {
		assertTrue(stringUtils.isPalindromo("ovo ovo"));
	}
	
	 @Test
	    void testPalindromoMaiusculas() {
	        assertTrue(stringUtils.isPalindromo("ArArA"));
	    }
	 
	 @Test
	 void testStringVazia() {
	     assertTrue(stringUtils.isPalindromo(""));
	 }
	 
	@Test
	void testIsPalindromoFalse() {
		assertFalse(stringUtils.isPalindromo("Verdade e Mentira"));
	}

}