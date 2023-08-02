package tablas;

import java.util.Arrays;
import java.util.Collections;


public class EjercicioTablas17 {

//	Ej 17 - Crea una matriz (tabla de dos dimensiones) con valores float para almacenar las notas de dos alumnos en relación a tres exámenes. Muestra la tabla de datos por consola.



	

	public static void main(String[] args) {

		float [][] alumnosNotas = new float [2][3];
		
//		Asignamos valores para el alumno 0
		alumnosNotas[0][0] = 8;
		alumnosNotas[0][1] = 9;
		alumnosNotas[0][2] = 7.5F;
		
		
//		Asignamos valores para el alumno 1
		alumnosNotas[1][0] = 6;
		alumnosNotas[1][1] = 5;
		alumnosNotas[1][2] = 8.5F;
		
		for (int i = 0; i < alumnosNotas.length; i++) {
			System.out.println("\nAlumno " + i);
			
			for (int j = 0; j < alumnosNotas[i].length; j++) {
				System.out.print(alumnosNotas[i][j] + " ");
			}
		}

		
//		System.out.println(Arrays.toString(alumnosNotas));
//		
//		System.out.println("Alumno [0]: " + Arrays.toString(alumnosNotas[0]));
//		System.out.println("Alumno [1]: " + Arrays.toString(alumnosNotas[1]));
		
		
		
	}
}
