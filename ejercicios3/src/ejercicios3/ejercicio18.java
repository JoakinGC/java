package ejercicios3;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio18 {

	public static void main(String[] args) {
		/*18- Calcular nota media de cada alumno*/
		
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
		
		float acumNota = 0;
		
		for(int i = 0; i < notas.length;i++) {
			acumNota=0;
			for(int j = 0; j < notas[i].length;j++) {
			
				acumNota += notas[i][j];
				
			}
			
			
			
			System.out.println("El nombre es: " + nombres[i] + "\nNota Nº" + i+ " " + Arrays.toString(notas[i]) + "\n Su media es: " + acumNota / 3);
		}
		

		
		
		
	}

}
