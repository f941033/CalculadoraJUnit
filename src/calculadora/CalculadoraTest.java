package calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSuma() {
		Calculadora calcu =new Calculadora(20,30);
		int resultado = calcu.suma();
		assertEquals(50,resultado);
	}

	@Test
	public void testResta() {
		Calculadora calcu = new Calculadora(20,30);
		int resultado = calcu.resta();
		assertEquals(-10,resultado);
	}

	@Test
	public void testMultiplicacion() {
		Calculadora calcu = new Calculadora(20,30);
		int resultado = calcu.multiplicacion();
		assertEquals("Fallo en la multiplicación!!!",600,resultado);
	}

	@Test
	public void testDivision() {
		Calculadora calcu = new Calculadora(8,2);
		int resultado = calcu.division();
		assertEquals(4,resultado);
	}
	
	@Test
	public void testDivisionPorCero() {
		try {
			Calculadora calcu = new Calculadora(8,0);
			int resultado = calcu.division();
			fail(("FALLO, debería haber lanzado la excepción"));
		}catch(ArithmeticException e) {
			//PRUEBA SATISFACTORIA
		}
	}

}









