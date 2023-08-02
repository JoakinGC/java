package ejercicios3;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		/*5 - Muestra por pantalla al alumno con nota más alta.*/

		Scanner sc = new Scanner(System.in);
		System.out.println("Cantidad de alumnos: ");
		int cantAlumnos = sc.nextInt();
		
		String[] nombres = new String[cantAlumnos];
		String nombre = "";
		float[] notas = new float [cantAlumnos];
		float max = -1;
		
		sc.nextLine();
		for(int i = 0; i < notas.length;i++) {	
			
			System.out.println("Nombre de Alumno Nº"+ i);
			nombres[i] = sc.nextLine();
			
		}
		
		for(int i = 0;i < notas.length; i++) { 
			
			System.out.println("Nota Nº"+ i);
			notas[i] = sc.nextFloat();
			
		}
		
		sc.close();
		
		for(int i = 0; i < notas.length;i++) {
			if(max <= notas[i]) {
				
				max = notas[i];
				nombre +=" " + nombres[i];
			}
		}
		
		
		System.out.print("El alumno/s " + nombre + " tiene/n la notas más alta que es:" + max);
	}

}
