package com.jovemprogramador.exercicio3;

public class UsuarioSenha {
	public boolean senhaValida(String senha) {
		 return senha.length() >= 8 &&
		 senha.matches(".*[A-Z].*") &&
		 senha.matches(".*\\d.*");
		 }
}
