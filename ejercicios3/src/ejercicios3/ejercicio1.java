package ejercicios3;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
/* Realizar el ejercicio anterior utilizando un vector (array, tabla unidimensional) de 5 posiciones. Debe:

	- Calcular la nota media.
	- Mostrar todas las notas en el orden que fueron introducidas.
	- Mostrar todas las notas en el orden inverso al que fueron introducidas.
*/

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Cantidad de alumnos: ");
		int cantAlumnos = sc.nextInt();
		
		
		float[] notas = new float [cantAlumnos];
		float media = 0;
		
		for(int i = 0;i < notas.length; i++) { 
			
			System.out.println("Notas Nº"+ i);
			notas[i] = sc.nextFloat();
			media+=notas[i];
			
		}
		
		for(int i = 0;i < notas.length; i++) System.out.println("Notas introducidas: "+ notas[i]);
		
		for(int i = cantAlumnos- 1;i >= 0; i--) System.out.println("Notas introducidas a la inversa: "+ notas[i]);
		
		media = media / cantAlumnos;
		
		System.out.print("La nota media es:" + media);
		
	}

}
