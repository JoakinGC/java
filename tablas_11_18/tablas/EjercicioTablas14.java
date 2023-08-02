package tablas;

import java.util.Arrays;
import java.util.Collections;


public class EjercicioTablas14 {

//	Ej 14 - Crea un vector de notas, ordenalo ascendentemente y amplía su memoria para insertar un nuevo elemento.


	
	public static void main(String[] args) {
		
		float [] notas1 = {9,2,10,8,4};

		float [] notasAux;
		
//		System.out.println(notas1);
		
		Arrays.sort(notas1);
		notas1 = Arrays.copyOf(notas1, notas1.length+1);
		
//		System.out.println(notas1);
		
		System.out.println(Arrays.toString(notas1));
		
		
	}
}
