package tablas;

import java.util.Arrays;
import java.util.Scanner;


public class EjercicioTablas11 {

//	Ej 11 - Inicializa un vector de 4 posiciones con valores enteros. 
//	Realiza una copia de dicho vector en un nuevo vector con los mismos datos y una posición más de memoria.
	
	
	public static void main(String[] args) {
		
		int [] numeros = new int[4]; // { 0, 0, 0, 0}
		Arrays.fill(numeros, 22);
		
		
	
		
		
		System.out.println(Arrays.toString(numeros));
		

		int [] numerosCopia = Arrays.copyOf(numeros, numeros.length+1); // numerosCopia = {22,22,22,22,0}
		System.out.println(Arrays.toString(numerosCopia));
		
//		System.out.println("numerosCopia.length = " + numerosCopia.length);
		
		
		
	}
}
