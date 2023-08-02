package ejercicios3;

import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		/*10 - Muestra el nombre, nota1, nota2 y nota media, de un alumno específico. Debe:

				- Mostrar los datos del alumno específico a partir del índice de dicho alumno (el indice indica la posición en el vector).
				- Mostrar los datos del alumno indicado a partir del nombre de dicho alumno.*/

		Scanner sc = new Scanner (System.in);
		float[][] notas = {{10,8,9,4,1},{1,5,7,8,9}};
		String[] nombres = {"Sergio","Mario","Javi","Cristian","Pablo"};
		System.out.println("Escribe el nombre");
		String nombre = sc.nextLine();
		
		
		
		if(indice(nombres,nombre)==-1) {
			System.err.println("NO se encuentra su nombre en la base de datos");
		}else {
			System.out.println("Su nombre es:" + nombre 
					+ "\nSu calificaciones son: " +  notas[0][indice(nombres,nombre)]
					+ " , " + notas[1][indice(nombres,nombre)]
					+ " \nLa media es: " + media(notas) 
					);
		}
	}
	
	public static float media(float[][] notas) {
		float media = 0;
		int contador = 0;
		
		for(int i = 0; i < notas.length;i++) {
			
			for(int j = 0; j < notas[i].length;j++) {
				media+= notas[i][j];
				contador++;
			}
			
		}
		media = media / contador;
		return media;
	}
	
	public static int indice(String[] nombres, String nombre) {
		int indice = -1;
		for(int i = 0; i < nombres.length;i++) {
			if(nombres[i].equals(nombre)) { 
				indice = i;
				break;
			}
		}
		return indice;
	}
	
	
	

}
