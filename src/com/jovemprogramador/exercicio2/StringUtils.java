package com.jovemprogramador.exercicio2;

public class StringUtils {
	 public boolean isPalindromo(String texto) {
		 String limpo = texto.replaceAll("\\s+", "").toLowerCase();
		 return limpo.equals(new StringBuilder(limpo).reverse().toString());
		 }
}
