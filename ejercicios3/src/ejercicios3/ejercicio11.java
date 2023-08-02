package ejercicios3;

import java.util.Arrays;

public class ejercicio11 {

	public static void main(String[] args) {
		/*11 - Inicializa un vector de 4 posiciones con valores enteros. Realiza una copia de dicho vector en un nuevo vector con los mismos datos y una posición más de memoria*/

		
		
		
		float []vector =  {1,5,6,7};
		float [] copia;
		Arrays.fill(vector, 22);
		
		copia = Arrays.copyOf(vector, vector.length + 1);
		
		System.out.println(Arrays.toString(copia));
	}

}
