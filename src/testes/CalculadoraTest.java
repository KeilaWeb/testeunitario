package testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import aplicacao.Calculadora;

class CalculadoraTest {

	@Test
	void somaCorreta() {
		Calculadora calculadora = new Calculadora();
		float valorEsperado = 15f;
		float valorRetornado = calculadora.somar(12.5f, 2.5f);
		
		assertEquals(valorEsperado, valorRetornado);
	}

	@Test
	void somaInCorreta() {
		Calculadora calculadora = new Calculadora();
		float valorEsperado = 16f;
		float valorRetornado = calculadora.somar(12.5f, 2.5f);
		
		assertNotEquals(valorEsperado, valorRetornado);
	}
}
