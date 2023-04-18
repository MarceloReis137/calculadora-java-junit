package una;

import static org.junit.Assert.*;

import org.junit.Test;

public class calculadoraTest {

	@Test
	public void testSomar() {
		calculadora teste = new calculadora();
		double resultado = teste.somar(10, 10);
		
		double validar = 20;
		assertEquals (validar,resultado,0);
	}

	@Test
	public void testSubtrair() {
		calculadora teste = new calculadora();
		double resultado = teste.subtrair(10, 10);
		
		double validar = 0;
		assertEquals (validar,resultado,0);
	}

	@Test
	public void testMultiplicar() {
		calculadora teste = new calculadora();
		double resultado = teste.multiplicar(10, 10);
		
		double validar = 100;
		assertEquals (validar,resultado,0);
	}

	@Test
	public void testDividir() {
		calculadora teste = new calculadora();
		double resultado = teste.dividir(10, 10);
		
		double validar = 1;
		assertEquals (validar,resultado,0);
	}

	@Test
	public void testPotenciar() {
		calculadora teste = new calculadora();
		double resultado = teste.potenciar(10, 2);
		
		double validar = 100;
		assertEquals (validar,resultado,0);
	}

}
