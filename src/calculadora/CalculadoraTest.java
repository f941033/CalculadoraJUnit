package calculadora;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {

	Calculadora calcu;
	
	@Before
	public void creaCalculadora() {
		calcu =new Calculadora(20,30);
		//System.out.println("inicio prueba");
	}
	
	
	@After
	public void borraCalculadora() {
		calcu = null;
		//System.out.println("fin prueba");
	}
	
	
	@Test
	public void testSuma() {
		//Calculadora calcu =new Calculadora(20,30);
		int resultado = calcu.suma();
		assertEquals(50,resultado);
	}

	@Test
	public void testResta() {
		//Calculadora calcu = new Calculadora(20,30);
		int resultado = calcu.resta();
		assertEquals(10,resultado);
	}
	
	@Test
	public void testNum1EsMayor() {
		//Calculadora calcu = new Calculadora(20,30);
		boolean resultado = calcu.num1EsMayor();
		// assertEquals(false,resultado)
		//assertTrue("no es verdadero",resultado); --> prueba fallida
		assertFalse(resultado);
	}
	

	@Test
	public void testMultiplicacion() {
		//Calculadora calcu = new Calculadora(20,30);
		int resultado = calcu.multiplicacion();
		assertEquals("Fallo en la multiplicación!!!",600,resultado);
	}

	@Test
	public void testDivision() {
		//Calculadora calcu = new Calculadora(8,2);
		int resultado = calcu.division();
		assertEquals(0,resultado);
	}
	
	@Test
	public void testDivisionPorCero() {
		try {
			//Calculadora calcu = new Calculadora(8,0);
			int resultado = calcu.division();
			
		}catch(ArithmeticException e) {
			//PRUEBA SATISFACTORIA
			fail(("FALLO, debería haber lanzado la excepción"));
		}
	}

	@Test
	public void testDivisionPorCero2() {
		//Calculadora calcu = new Calculadora(20,0);
		Integer resultado = calcu.division2();
		assertNotNull(resultado);
	}
	
	/*
	@Test(expected=java.lang.ArithmeticException.class)
	public void testDivisionPorCero3() {
		//Calculadora calcu = new Calculadora(20,0);
		int resultado = calcu.division3();
	}*/
}









