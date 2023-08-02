package ejercicios3;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		/* 3 - Añade un nuevo vector al ejercicio en el que se almacenen los nombres de los alumnos a los que se asocian las notas. Debe:

		- Primero pedir el nombre y la nota de todos los alumnos.
		- A continuación mostrar cada alumno junto a su nota.*/
		

	

				
			Scanner sc = new Scanner(System.in);
			System.out.println("Cantidad de alumnos: ");
			int cantAlumnos = sc.nextInt();
			
			
			String[] nombres = new String[cantAlumnos];
			float[] notas = new float [cantAlumnos];
			float aprobados = 0 , desaprobados = 0;
			
			sc.nextLine();
			
			for(int i = 0; i < notas.length;i++) {
				
				
				System.out.println("Nombre de Alumno Nº"+ i);
				nombres[i] = sc.nextLine();
				
			}
				
			for(int i = 0;i < notas.length; i++) { 
					
				System.out.println("Nota Nº"+ i);
				notas[i] = sc.nextFloat();
				
			}
				
				for(int i = 0;i < notas.length; i++) {
				
					
					if(notas[i]<=5) {
						System.out.println("Nombre: " + nombres[i] + "\nCon una nota: " + notas[i] + "\nesta desaprobado\n");
						desaprobados++;
					}else {
						System.out.println("Nombre: " + nombres[i] + "\nCon una nota:" + notas[i] + "\nesta aprobado\n");
						aprobados++;
					}
					
				}
				
				
				
				System.out.print("Los aprobados son: " + aprobados + "\n Los desaprobados son: " + desaprobados);
				
		
	}

}
