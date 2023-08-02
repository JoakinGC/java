package evalacionJava;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio1 {

	
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		/**/
		
		
		
		String []partesAuto = new String[4];
		
		for (int i = 0; i < partesAuto.length; i++) {
			System.out.println("Parte Nº"+ i  +" del auto: ");
			partesAuto[i] = sc.nextLine();
		}
		
		
		float [] precios = new float[4];
		float[] cantidadElementos = new float[4];
		
		float partePrecioA = -1;
		float partePrecioB = -1;
		float partePrecioC = -1;
		float partePrecioD = -1;
		
		float parteCantA = -1;
		float parteCantB = -1;
		float parteCantC = -1;
		float parteCantD = -1;
		
		for (int i = 0; i < partesAuto.length; i++) {
			
			if(i == 0) {
				System.out.println("Valor de "+ partesAuto[i] +":");				
				partePrecioA = sc.nextFloat();
				precios[i] = partePrecioA; 				
				continue;
			}
			
			if(i == 1) {
				System.out.println("Valor de "+ partesAuto[i] +":");
				partePrecioB = sc.nextFloat();
				precios[i] = partePrecioB;
				continue;
			}
			
			if(i == 2) {
				System.out.println("Valor de "+ partesAuto[i] +":");
				partePrecioC = sc.nextFloat();
				precios[i] = partePrecioC;
				continue;
			}
			
			if(i == 3) {
				System.out.println("Valor de "+ partesAuto[i] +":");
				partePrecioD = sc.nextFloat();
				precios[i] = partePrecioD;
				continue;
			}
			
		}
		
		//System.out.println(Arrays.toString(precios));
		
		for (int i = 0; i < cantidadElementos.length; i++) {
			switch (i) {
			case 0: {
				System.out.println("Cantidad de "+ partesAuto[i] +":");
				parteCantA = sc.nextFloat();
				cantidadElementos[i] = parteCantA;
				break;
				}
			case 1: {
				System.out.println("Cantidad de "+ partesAuto[i] +":");
				parteCantB = sc.nextFloat();
				cantidadElementos[i] = parteCantB;
				break;
				}
			case 2: {
				System.out.println("Cantidad de "+ partesAuto[i] +":");
				parteCantC = sc.nextFloat();
				cantidadElementos[i] = parteCantC;
				break;
				}
			case 3: {
				System.out.println("Cantidad de "+ partesAuto[i] +":");
				parteCantD = sc.nextFloat();
				cantidadElementos[i] = parteCantD;
				break;
				}
			}
		}
		
		//System.out.println(Arrays.toString(cantidadElementos)+ "\n"+ Arrays.toString(precios));
		System.out.println("¿Cuatos automoviles quiere fabricar?");
		int cantidadAutos = sc.nextInt();
		
		float valorUnitario = (partePrecioA + partePrecioB + partePrecioC+ partePrecioD);
		float total = valorUnitario * cantidadAutos;
		System.out.println("El valor unitario de los autos es: "
				+ valorUnitario
				+ "\n El total es:"
				+ total + "€"
				);
		
	}

}
