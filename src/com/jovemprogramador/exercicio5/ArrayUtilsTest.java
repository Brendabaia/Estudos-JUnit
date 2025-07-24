package com.jovemprogramador.exercicio5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArrayUtilsTest {
	  private ArrayUtils arrayUtils;
	    
	    @BeforeEach
	    void setUp() {
	        arrayUtils = new ArrayUtils();
	    }
	    
	    @Test
	    void testInverter_Array3Elementos_RetornaInvertido() {
	        assertArrayEquals(new int[]{3, 2, 1}, arrayUtils.inverter(new int[]{1, 2, 3}));
	    }
}
	
