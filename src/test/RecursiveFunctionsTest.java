package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.RecursiveFunctions;

class RecursiveFunctionsTest {
	
	private RecursiveFunctions recursiveFunctions;
	
	
	@Test
	@SuppressWarnings("static-access")
	public void fibonacciTest(){
		
		assertEquals(5, recursiveFunctions.fibonacci(5), "El método fibonacci no retorna el valor esperado");
		assertEquals(2, recursiveFunctions.fibonacci(3) , "El método fibonacci no retorna el valor esperado");
		assertEquals(21, recursiveFunctions.fibonacci(8) , "El método fibonacci no retorna el valor esperado");
	}
	
	@Test
	@SuppressWarnings("static-access")
	public void factorialTest() {
		assertEquals(120, recursiveFunctions.factorial(5), "El método factorial no retorna el valor esperado");
		assertEquals(6, recursiveFunctions.factorial(3) , "El método factorial no retorna el valor esperado");
		assertEquals(1, recursiveFunctions.factorial(0) , "El método factorial no retorna el valor esperado");
	}
	
	@Test
	@SuppressWarnings("static-access")
	public void arraySumatoryTest() {
		int[] array = {0,12,4,24,11,8};
		assertEquals(40, recursiveFunctions.arraySumatory(array,3), "El método arraySumatory no retorna el valor esperado");
		assertEquals(59, recursiveFunctions.arraySumatory(array,5) , "El método arraySumatory no retorna el valor esperado");
		assertEquals(16, recursiveFunctions.arraySumatory(array,2), "El método arraySumatory no retorna el valor esperado");
	}

}
