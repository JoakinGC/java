package tablas;

import java.util.Arrays;
import java.util.Collections;


public class EjercicioTablas13 {

//	Ej 13 - Crea un vector de nombres. Ordena y muestra el vector tanto ascendente como descendentemente.


	
	public static void main(String[] args) {
		
		String [] nombres = {"Pepe" , "Juan" , "Roc�o" , "Mar" , "Javi"  };
//		System.out.println("Nombres ordenados alfab�ticamente: " + nombres);
		
		
		Arrays.sort(nombres);
		System.out.println("Nombres ordenados alfab�ticamente ascendente: " + Arrays.toString(nombres));

		Arrays.sort(nombres, Collections.reverseOrder());
		System.out.println("Nombres ordenados alfab�ticamente descendente: " + Arrays.toString(nombres));

		
		
		
		
		
		
		
	}
}
