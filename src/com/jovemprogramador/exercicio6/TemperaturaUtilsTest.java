package com.jovemprogramador.exercicio6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TemperaturaUtilsTest {
	  private TemperaturaUtils tempUtils;
	    
	    @BeforeEach
	    void setUp() {
	        tempUtils = new TemperaturaUtils();
	    }
	    
	    @Test
	    void TestelsiusParaFahrenheit_ZeroC_Retorna32F() {
	        assertEquals(32, tempUtils.celsiusParaFahrenheit(0), 0.001);
	    }
}