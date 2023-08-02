package ejercicios3;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		/*4- Realiza la función boolean repetidos(float [] notas) que muestre devuelva true o false en caso de que encuentre o no un valor de nota repetido.*/
		

	

				
			Scanner sc = new Scanner(System.in);
			System.out.println("Cantidad de alumnos: ");
			int cantAlumnos = sc.nextInt();
			
			
			
			float[] notas = new float [cantAlumnos];
			
			/*
			 * float aprobados = 0 , desaprobados = 0;
			
			 *String[] nombres = new String[cantAlumnos];
			sc.nextLine();
			
			for(int i = 0; i < notas.length;i++) {
				
				
				System.out.println("Nombre de Alumno Nº"+ i);
				nombres[i] = sc.nextLine();
				
			}*/
				
			for(int i = 0;i < notas.length; i++) { 
					
				System.out.println("Nota Nº"+ i);
				notas[i] = sc.nextFloat();
				
			}
				
			if(repetidos(notas)) {
				System.out.println("Hay notas repetidas");
			}else {
				System.out.println("No hay notas repetidas");
			}
		

	}
	
	
	public static boolean repetidos(float[] notas) {
		boolean prueba = false;
		for(int i = 0; i < notas.length;i++) {
			for(int j = 0; i < notas.length;i++) {
				if(notas[i] == notas[j] && i != j) {
					prueba = true;
					break;
				}
			}
			if(prueba)break;
		}
		
		return prueba;
	}

}
