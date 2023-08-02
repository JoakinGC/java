package ejercicios3;

import java.util.Arrays;

public class ejercicio15 {

	public static void main(String[] args) {
		/*15 - Crea una función que inserte en un vector de notas una nueva nota y mantenga el vector ordenado ascendentemente.*/
		
		
		float [] vector = {1,77,9,355,2};
		vector = nuevaNota(vector,55);
		
		System.out.print(Arrays.toString(vector));
	}
	
	public static float[] nuevaNota(float[] notas, float nota) {
		notas = Arrays.copyOf(notas, notas.length + 1);
		
		
		notas[notas.length - 1] = nota;
		
		
		Arrays.sort(notas);
		return notas;
	}

}
