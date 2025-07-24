package com.jovemprogramador.exercicio7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringUtilsTest {
private StringUtils stringUtils;
    
    @BeforeEach
    void setUp() {
        stringUtils = new StringUtils();
    }

	@Test
	void testRemoverEspacosExtras() {
		        assertEquals("olá mundo", stringUtils.removerEspacosExtras("olá  mundo"));
		    }

     @Test
     void removerEspacosExtras_ComEspacosNoInicioFim_RetornaTrimmed() {
		        assertEquals("teste", stringUtils.removerEspacosExtras("   teste   "));
	}

}

