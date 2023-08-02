package ejercicios3;

import java.util.Arrays;

public class ejercicio14 {

	public static void main(String[] args) {
		/*14 - Crea un vector de notas, ordenalo ascendentemente y amplía su memoria para insertar un nuevo elemento.*/

		
		float [] vector = {1,77,9,355,2};
		
		Arrays.sort(vector);
		vector = Arrays.copyOf(vector,vector.length + 1);
		
		System.out.println(Arrays.toString(vector));
	}
}
