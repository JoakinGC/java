package ejercicios3;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		/*Ej 2 - Hacer que el ejercicio anterior muestre el número de aprobados y suspensos hay entre todas las notas (aprobado para nota >= 5).*/

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Cantidad de alumnos: ");
		int cantAlumnos = sc.nextInt();
		
		
		float[] notas = new float [cantAlumnos];
		float aprobados=0,desaprobados=0;
		
		for(int i = 0;i < notas.length; i++) { 
			
			System.out.println("Notas Nº"+ i);
			notas[i] = sc.nextFloat();
			
		}
		
		for(int i = 0;i < notas.length; i++) {
		
			
			if(notas[i]<=5) {
				desaprobados++;
			}else {
				aprobados++;
			}
			
		}
		
		System.out.print("Los aprobados son: " + aprobados + "\n Los desaprobados son: " + desaprobados);
		
	}

}
