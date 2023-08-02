package ejercicios2;

import java.util.Scanner;

public class ejercicio43 {

	public static void main(String[] args) {
		
		/*Calcula y devuelve la distancia euclídea que sepaa los puntos (x1, y1) y (x2, y2). La formula para calcular esta distacia es:
		 * 
		 * 
		 * distancia = raiz (x1 -  x2) ^ 2  + (y1 - y2) ^ 2
		 * */

		double x1,x2,y1,y2; 
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Valor de x1:");
		x1=sc.nextDouble();
		
		System.out.println("Valor de x2:");
		x2=sc.nextDouble();
		
		System.out.println("Valor de y1:");
		y1=sc.nextDouble();
		
		System.out.println("Valor de y2:");
		y2=sc.nextDouble();
		
		System.out.print(distancia(x1,x2,y1,y2));
		sc.close();		
	}
	
	
	public static double distancia(double x1, double x2, double y1, double y2){
		
		double distancia = Math.sqrt(Math.pow(x1 - x2,2) + Math.pow(y1 - y2, 2));
		
		
		return distancia;
	}
}
	 
		
		
	
	

