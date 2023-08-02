package ejercicios_cadenas;

import java.util.Scanner;

public class ejercicio1 {

	static Scanner sc = new Scanner(System.in); 

	 

	private static void soloLetras(char[] fraseArray) { 

		for (int i = 0 ;i<fraseArray.length;i++) { 

			if (!Character.isLetter(fraseArray[i])) { 

				fraseArray[i]='-'; 

			} 

		} 

	} 

	 

	private static void contarLetras(char[] fraseArray, char[] letras, int[] cantidad, int cont) { 

		for (int i = 0; i < fraseArray.length; i++) { 

			 

			if (fraseArray[i]!='-') { 

				letras[cont]=fraseArray[i]; 

				 

				for (int j = 0; j < fraseArray.length; j++) { 

					if (fraseArray[j]==letras[cont]) { 

						cantidad[cont]++; 

						fraseArray[j]='-'; 

					} 

				} 

				cont++; 

			} 

			 

		} 

	} 
}
