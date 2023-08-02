package tablas;

import java.util.Arrays;
import java.util.Collections;


public class EjercicioTablas16b {

//	Ej 16 - Crea una matriz (tabla de dos dimensiones) con valores 
//	float para almacenar las notas de dos alumnos en relación a tres exámenes.



	

	public static void main(String[] args) {

		int numAlumnos = 2;
		int numNotas = 3 ;
		
		float [][] alumnosNotas = new float [numAlumnos][numNotas]; // new float [filas][columnas]
		
		alumnosNotas[0][0]= 7.9F;
		alumnosNotas[0][1]= 5.9F;
		alumnosNotas[0][2]= 8.9F;


		alumnosNotas[1][0]= 3.2F;
		alumnosNotas[1][1]= 8.0F;
		alumnosNotas[1][2]= 6.7F;

		
		System.out.println(alumnosNotas);
		
		for (int i = 0; i < numAlumnos; i++) {
			
			for (int j = 0; j < numNotas; j++) {
				System.out.print(  alumnosNotas[i][j] + " "  );
//				alumnosNotas[i][j] = sc.nextFLoat();
			}
			
			System.out.println();
		}
		
		System.out.println( Arrays.toString(alumnosNotas) );
		
		System.out.println( Arrays.toString(alumnosNotas[0]) );
		System.out.println( Arrays.toString(alumnosNotas[1]) );
		
		System.out.println("--");
		for (int i = 0; i < numAlumnos; i++) {
			System.out.println( Arrays.toString(alumnosNotas[i]) );
		}
		
		
		
		
	}
}
