package ejercicios3;

import java.util.Scanner;

public class ejercicio0 {

	public static void main(String[] args) {
		/*Ej 0 - Haz un programa que pida la nota de 5 alumnos, calcule y muestre la nota media por pantalla.*/

		
		Scanner sc = new Scanner(System.in);
		
		float notas = 0;
		
		for(int i = 0; i<5;i++) {
			System.out.println("Nota Nº:"+ i);
			notas += sc.nextFloat();
		}
		sc.close();
		
		notas = notas / 5;
		System.out.print("La nota media es:" + notas);
		
		// Se podria pedir la cantidad de alumnos 
		
	}

}
