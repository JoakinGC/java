package ejercicios3;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		/*7 - Muestra todas las notas ordenadas en orden ascendente.*/
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Cantidad de alumnos: ");
		int cantAlumnos = sc.nextInt();
		
		float[] notas = new float [cantAlumnos],ascendete = new float[cantAlumnos];*/
		float[] notas = {10,7,4,5,2};
		float max = -1;
		
		
		/*for(int i = 0;i < notas.length; i++) { 
			
			System.out.println("Nota Nº"+ i);
			notas[i] = sc.nextFloat();
			
		}*/
		
		//sc.close();
		
		for(int i = 0; i < notas.length; i++) {
			for(int j = i; j < notas.length;j++) {
					
					if(notas[i] < notas[j]) {
						//Sino usar sort y cambiando el guardado.
						max = notas[i];
						notas[i] = notas[j];
						notas[j] = max;
						
						
					}
				}
			}
		
		
		System.out.println(Arrays.toString(notas));
		
	}

	
	
	
}
