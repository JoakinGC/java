package tablas;

import java.util.Arrays;
import java.util.Collections;


public class EjercicioTablas15 {

//	Ej 15 - Crea una funci�n que inserte en un vector de notas una nueva nota y mantenga el vector ordenado ascendentemente.


	public static float[] insertarOrdenado(float [] notas, float nota) {
		
		if(notas != null) {
			notas = Arrays.copyOf(notas, notas.length+1); // ampliamos memoria para el nuevo elemento
			notas[notas.length-1] = nota; // asignamos en la posici�n libre el nuevo elemento
			Arrays.sort(notas); // ordenamos 
		}		
		else { // el vector no tiene memoria asignada
			notas = new float[1];
			notas[0] = nota; // asignamos en la primera posici�n
		}
		return notas;
	}
	

	public static void main(String[] args) {
		
		float [] notas1 = {8,9,7};
		float [] notas2;

		
		float nota = 6.5F;
		
		notas2 = insertarOrdenado(notas1, nota);
		
		
		System.out.println("Notas1 = " + Arrays.toString(notas1));
		System.out.println("Notas2 = " + Arrays.toString(notas2));
		
		
		
		
		
		
		
		
		
		
//		
//		
////		Ejemplo vector sin memoria asiganada
//		float [] notas2=null;
//
//		notas2 = insertarOrdenado(notas2, 6);
//		System.out.println(Arrays.toString(notas2));
//		
//		notas2 = insertarOrdenado(notas2, 2);
//		System.out.println(Arrays.toString(notas2));
		
		
	}
}
