package com.jovemprogramador.exercicio4;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PessoaUtilsTest {
	private PessoaUtils pessoaUtils;
    
    @BeforeEach
    void setUp() {
        pessoaUtils = new PessoaUtils();     
    }  
    @Test
    public void testCalcularIdade_IdadeExata() {
        LocalDate nascimento = LocalDate.now().minusYears(23);
        int idade = pessoaUtils.calcularIdade(nascimento);
        assertEquals(23, idade);
    }

    @Test
    public void testCalcularIdade_ZeroAno() {
        LocalDate nascimento = LocalDate.now();
        int idade = pessoaUtils.calcularIdade(nascimento);
        assertEquals(0, idade);
    }

    @Test
    public void testCalcularIdade_MenosUmDia() {
        LocalDate nascimento = LocalDate.now().minusDays(1);
        int idade = pessoaUtils.calcularIdade(nascimento);
        assertEquals(0, idade);
    }
}