package tablas;

import java.util.Arrays;
import java.util.Collections;


public class EjercicioTablas18 {

//	Ej 18 - Calcular y mostrar la nota media de cada alumno


	public static void main(String[] args) {

		int numAlumnos = 2;
		int numNotas = 3 ;
		
		float [][] alumnosNotas = new float [numAlumnos][numNotas]; // new float [filas][columnas]
		float acumNota=0;
		
		alumnosNotas[0][0]= 10F;
		alumnosNotas[0][1]= 5F;
		alumnosNotas[0][2]= 7F;


		alumnosNotas[1][0]= 2.4F;
		alumnosNotas[1][1]= 8F;
		alumnosNotas[1][2]= 5F;

		
		
		for (int i = 0; i < numAlumnos; i++) {
			System.out.println( Arrays.toString(alumnosNotas[i]) );
		}
		
		
		System.out.println();
		for (int i = 0; i < alumnosNotas.length; i++) {
			System.out.print( "Alumno" + i + ": ");

			for (int j = 0; j < alumnosNotas[i].length; j++) {
				acumNota += alumnosNotas[i][j];
			}
			System.out.println("Nota Media : " + acumNota/numNotas);
			acumNota=0;
		}
		
	}
}
