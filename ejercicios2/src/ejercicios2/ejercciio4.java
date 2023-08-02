package ejercicios2;

import java.util.Scanner;

public class ejercciio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Valor de radio (unidad en metros): ");
		
		double radio = sc.nextDouble();
		sc.close();
		
		superfi(radio);
		volumen(radio);
		
	}

	public static void superfi(double radio) {
		
		/*Diseñar una funcion que calcule la superficie y el volumen de una esfera
		 * 
		 * superficie =4 pi * radio ^ 2;
		 * 
		 * volumen = 4 /3 pi * radio ^ 3
		 * */
		
		byte a = 2;
		byte b = 3;
		
		
		if(radio < 0) System.out.print("Valor no valido");
		
		double superficie =(double) 4 * Math.PI * Math.pow(radio, a);
		
		System.out.println("La superficie es: " + superficie);
		
	}
	
public static void volumen(double radio) {
		
		/*Diseñar una funcion que calcule la superficie y el volumen de una esfera
		 * 
		 * superficie =4 pi * radio ^ 2;
		 * 
		 * volumen = 4 /3 pi * radio ^ 3
		 * */
		
		byte a = 2;
		byte b = 3;
		
		
		if(radio < 0) System.out.print("Valor no valido");
		
		
		double volumen = 4 / 3f * Math.PI * Math.pow(radio, b);
		
		
		
		System.out.println("El volumen es: " + volumen);
		
		
	}
}