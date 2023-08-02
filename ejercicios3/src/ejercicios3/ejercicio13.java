package ejercicios3;

import java.util.Arrays;
import java.util.Collections;

public class ejercicio13 {

	public static void main(String[] args) {
		/*13 - Crea un vector de nombres. Ordena y muestra el vector tanto ascendente como descendentemente.*/
		
		String [] nombres = {"Pepe" , "Juan" , "Rocío" , "Mar" , "Javi"  };
//		System.out.println("Nombres ordenados alfabéticamente: " + nombres);
		
		
		Arrays.sort(nombres);
		System.out.println("Nombres ordenados alfabéticamente ascendente: " + Arrays.toString(nombres));

		Arrays.sort(nombres, Collections.reverseOrder());
		System.out.println("Nombres ordenados alfabéticamente descendente: " + Arrays.toString(nombres));


		}

	}

