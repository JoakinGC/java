package evalacionJava;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		
		 
		/**/
		Scanner sc = new Scanner(System.in);
		float km = -1, yardas = -1, millas = -1;
		
		
		for(int i = 0; i <= 5;) {
			
			
			System.out.println("Introduzca la opcion que desea realizar: "
					+"\n1- Cambio km a millas"
					+"\n2- Cambio km a yardas"
					+"\n3- Cambio millas a yardas"
					+"\n4- Cambio yardas a millas"
					+"\n5- Salir"
				);
			i = sc.nextInt();
			switch (i) {
			case 1: {
				
				System.out.println("Cantidad de KM: ");
				km = sc.nextFloat();
				System.out.println("La cantidad de millas son: " + sacarKm(km,millas, yardas,i));
				break;
				
			}
			case 2:{
				
				System.out.println("Cantidad de km: ");
				km = sc.nextFloat();
				System.out.println("La cantidad de yardas son: " + km * 1093.61);
				break;
				
				}
			case 3:{
				
				System.out.println("Cantidad de millas: ");
				millas = sc.nextFloat();
				km = (float) (1 * 0.62 * millas);
				System.out.println("La cantidad de yardas son: " + km * 1093.61);
				break;
				
				}
			case 4:{
				System.out.println("Cantidad de yardas: ");
				yardas = sc.nextFloat();
				km = (float) (1 * 1093.61 * yardas);
				System.out.println("La cantidad de millas son: " + km * 0.62);
				break;
				}
			}
			if(i == 5)break;
		}
			
			
	}
		
	private static float sacarKm( float km, float millas, float yardas,int valor) {
		
		if(valor == 1) {
			km = (float) (km * 0.62);
		}
		
		if(valor == 2) {
			km = (float) (km * 1093.61);
		}
		
		return km; 
	}
	
	
}


