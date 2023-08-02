package ejercicios_cadenas;

import java.util.Arrays;

public class ejercicio4 {

	public static void main(String[] args) {
		/*Utilice un array de nombres desordenados de 
		 * nombres, comience por ordenarlo alfabéticamente. 
		 * A continuación, calcule el valor alfabético de cada 
		 * nombre y multiplique este valor por su posición alfabética en 
		 * la lista para obtener una puntuación del nombre.*/
		
		String [] nombres = {"ANA" , "MAR" , "JUAN" , };
		String palabra = nombres[0];
		
		/*for(int i = 0; i < nombres.length;i++) {
			for(int j = i; j < nombres.length;j++) {
				if(nombres[i].compareTo(nombres[j]) > 0) {
					palabra = nombres[i];
					nombres[i] = nombres[j];
					nombres[j] = palabra;
				}
			}
		}*/
		
		Arrays.sort(nombres);
		
		
		for(int i = 0; i < nombres.length; i++) System.out.println(nombres[i]);
		
		
		valor(nombres);

	}
	
	
	private static void valor(String[] nombres) {
		char[] valores = {
				'A','B','C','D','E','F',
				'G','H','I','J','K',
				'L','M','N','Ñ','O',
				'P','Q','R','S','T',
				'U','V','W','X','Y',
				'Z'
		};
		
		System.out.println(valores.length);
		int [] numeros= {
			1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27	
				
		};
		
		String sNombre;
		int total = 0;
		
		
		
		for(int i = 0;i < nombres.length;i++) {
			
			char[] cNombre = nombres[i].toCharArray(); 
			int individual = 0;
			
			for(int y = 0; y < cNombre.length; y++) {
				for(int j = 0; j < valores.length;j++) {
					if(Character.compare(cNombre[y], valores[j])==0) {
						
						total = total + numeros[j];
						individual += numeros[j];
					
					}
				}
			}
			
			System.out.println("El " + nombres[i] +" su total es: " + individual * (i + 1));
			total = total * (i + 1);
			individual = 0;
			
		}
		System.out.println("El valor total es: "+total);
	}

}
