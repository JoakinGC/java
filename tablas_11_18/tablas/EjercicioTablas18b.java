package tablas;

import java.util.Arrays;
import java.util.Collections;


public class EjercicioTablas18b {

//	Ej 18 - Calcular y mostrar la nota media de cada alumno


	public static float mediaVector(float [] notas) {
		
		float acumNota=0;
		float media;
		for (int i = 0; i < notas.length; i++) {
			acumNota = acumNota + notas[i];
		}
		System.out.println(acumNota);
		media = acumNota / notas.length;
		
		return media;
	}
	
	
	public static void main(String[] args) {

		int numAlumnos = 2;
		int numNotas = 3 ;
				
		float [] notas = new float[numNotas]; // new float [columnas]
	
		
		notas[0]= 10F;
		notas[1]= 5F;
		notas[2]= 7F;

//		System.out.println( Arrays.toString(notas) );
//		System.out.println("La media es: " + mediaVector(notas));
		
		
// 	CAMBIO A MATRIZ
		
		
		float [][] alumnosNotas = new float [numAlumnos][numNotas]; // new float [filas][columnas]
		float acumNota=0;
		
		alumnosNotas[0][0]= 10F;
		alumnosNotas[0][1]= 5F;
		alumnosNotas[0][2]= 7F;


		alumnosNotas[1][0]= 2.4F;
		alumnosNotas[1][1]= 8F;
		alumnosNotas[1][2]= 5F;
			

		for (int i = 0; i < alumnosNotas.length; i++) {
			System.out.println("La media del alumno " + i + " es " + mediaVector( alumnosNotas[i]  ));
		}
		
	}
}
