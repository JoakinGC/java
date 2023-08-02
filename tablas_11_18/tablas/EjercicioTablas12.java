package tablas;

import java.util.Arrays;
import java.util.Scanner;


public class EjercicioTablas12 {

//	Ej 12 - Crea dos vectores idénticos y comparalos. Inicializalos con varios valores iguales.	
	
	public static void main(String[] args) {
		
		int [] numeros1 = new int[4];
		int [] numeros2 = new int[4];
		
		Arrays.fill(numeros1, 22);
		Arrays.fill(numeros2, 22);
		
		System.out.println(Arrays.toString(numeros1));
		System.out.println(Arrays.toString(numeros2));
		
		System.out.println(numeros1);
		System.out.println(numeros2);
		
		

		if(numeros1 == numeros2) {
			System.out.println("Son inguales ==");
		}
		
		if( Arrays.equals(numeros1, numeros2) ) {
			System.out.println("Son iguales equals");
		}
		
		
		
	}
}
