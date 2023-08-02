package ejercicios3;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio16 {

	public static void main(String[] args) {
		/*16 - Crea una matriz (tabla de dos dimensiones) con valores float para almacenar las notas de dos alumnos en relación a tres exámenes.*/
		
		Scanner sc = new Scanner(System.in);
		
		float [][] notas = new float [2][3];
		String[] nombres = new String[2];
		float promedio = 0;
		
		
		for(int i = 0; i < notas.length;i++) {
			System.out.print("Nombre: ");
			nombres[i] = sc.nextLine();
			for(int j = 0; j < notas[i].length; j++) {
				System.out.print("Nota Nº" + i + " :");
				notas[i][j] = sc.nextFloat();
			}
			sc.nextLine();
		}
		
		
		
		for(int i = 0; i < notas.length;i++) {
			System.out.println("El nombre es: " + nombres[i] + "\nNota Nº" + i+ " " + Arrays.toString(notas[i]));
		}
	}

}
