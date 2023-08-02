package ejercicios3;

import java.util.Arrays;

public class ejercicio12 {

	public static void main(String[] args) {
		/*12 - Crea dos vectores idénticos y comparalos. Inicializalos con varios valores iguales.*/

		
		float[] vector1 = new float[4];
		float[] vector2 = null;
		Arrays.fill(vector1, 2);
		vector2 = Arrays.copyOf(vector1, vector1.length);
		
		if(Arrays.equals(vector1, vector2)) {
			System.out.print("Funciono");
		}
		
	}

}
