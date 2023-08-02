package evalacionJava;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class ejercicio3 {

	private static Scanner sc = new Scanner(System.in);
		
	public static void main(String[] args) {
		/**/
		
		
		float []notas = null;
		
		System.out.println("Cantidad de notas:");
		notas = new float[sc.nextInt()];
		
		agregarNotas(notas);
		
		System.out.println("El alumno tiene una nota media de "
				+ media(notas));
				comparacion(notas);
		
		
		

	}
	
	private static float[] agregarNotas ( float[] notas) {
		float valor1;
		for (int i = 0; i < notas.length; i++) {
			
			System.out.println("Nota Nº"+i);
			valor1 =  sc.nextFloat();
			
			if(valor1 > 10) {
				System.err.println("Valor no aceptado");
				return notas = null;
			}
			
			if(valor1 < 0) {
				System.err.println("Valor no aceptado");
				return notas = null;
			}
			
			notas[i] = valor1;
		}
		return notas;			
	}
	
	private static float media(float[] notas) {
		float media = 0,contador = 0;
		for (int i = 0; i < notas.length; i++) {
			media += notas[i];
			contador++;
		}
		media = Math.round(media/contador); 
		
		return media;
	}
	
	private static void comparacion(float []notas) {
		float media = media(notas);
		
		if(media >= 0 && media <= 4) {
			System.out.println("Suspenso");
		}
		if(media >= 5 && media <= 6) {
			System.out.println("Aprobado");
		}
		if(media >= 7 && media <= 8) {
			System.out.println("Notable");
		}
		if(media >= 9 && media <= 10) {
			System.out.println("Sobresaliente");
		}
		
	}

}
