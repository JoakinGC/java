package ejercicios2;


import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;

public class ejercicio4_2 {

	public static void main(String[] args) {
		/*
		 * Crear una funcion que muestrePares(int n) que muestre por consola los primeros n numeros pares
		 * 
		 * */

		
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cuantos números son?");
		int veces = sc.nextInt();
			
		
		
		muestrePares(veces);
		sc.close();
	}


	public static void muestrePares( int cantidadNumeros) {
		
		Scanner sc = new Scanner(System.in);
		
		double[] num = new double[cantidadNumeros];
		
		
		for(int i = 0; i <= num.length - 1; i++) {
			
			System.out.println("Valor de posicion " + i + ":");
			
			num[i] = sc.nextDouble();
			System.out.println(num[i]);
		}
		
		for(int i = 0; i <= num.length -1 ; i++)	if(Math.abs(num[i]) % 2 == 0)System.out.println("El número " +num[i]+ " en la posición: " + i + " es par");
			
			sc.close();
		
		
	}
}
