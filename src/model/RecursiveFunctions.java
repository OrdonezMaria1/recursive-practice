package model;
// i = 21
// n = 24 n-i+1 = 4
public class RecursiveFunctions {
	
	public RecursiveFunctions() {
		
	}
	public static int factorial(int indicador) {
		int factorial1 = 0;
		if(indicador == 0) {
			factorial1 = 1;
		}else {
			if(indicador>=0) {
				factorial1 = indicador*factorial(indicador-1);
			}
		}
		return factorial1;
	}
	
	public static int fibonacci(int indicador ) {
		int fibonacci1 = 0;
		if(indicador == 0) {
			fibonacci1 = 0;
		}else if (indicador == 1){
			fibonacci1 = 1;
		}else {
			fibonacci1 = fibonacci(indicador-1) + fibonacci(indicador-2); 
		}
		return fibonacci1;
	}
	
	public static int arraySumatory(int[] array, int indicador) {
		int arraySumatory = 0;
		if(indicador == 0) {
			arraySumatory = array[0];
		}else {
			arraySumatory = array[indicador]+arraySumatory(array,indicador-1);
		}
		return arraySumatory;
	}
}
