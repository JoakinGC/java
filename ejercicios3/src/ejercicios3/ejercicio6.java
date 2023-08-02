package ejercicios3;

import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		/*6 - Muestra por pantalla al alumno con nota mas baja.*/

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Cantidad de alumnos: ");
		int cantAlumnos = sc.nextInt();
		
		String[] nombres = new String[cantAlumnos];
		String nombre = "";
		float[] notas = new float [cantAlumnos];
		float min = -1;
		int posmin = 0;
		
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
		min = notas[0];
		
		for(int i = 0; i < notas.length;i++) {
			if(min > notas[i]) {
				
				min = notas[i];
				posmin = i;
				nombre +=" " + nombres[posmin];
			}
		}
		
		
		System.out.print("El alumno/s " + nombre + " tiene/n la notas más baja que es:" + min);
	}

}
