package ejercicios2;

import java.util.Scanner;

public class ejercicio45 {

	private static int undefined;

	public static void main(String[] args) {
		/*Diseñar una funcion en la que se pasan las horas y minutos de dos instantes de tiempo con el prototipo. 
		 * 
		 * 
		 * static int diferenciaMin()int hora1, int minuto1, int hora2, int minuto2)
		 * 
		 * La funcion devolvera la cantidad de minutos que existen de diferencia entre los dos instantes utilizados.
		 * */
		
		int hora1=-1,hora2=-1,minuto1=-1,minuto2=-1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hora 1:");
		hora1 = sc.nextInt();
		
		System.out.println("Minuto 1:");
		minuto1 = sc.nextInt();
		
		System.out.println("Hora 2:");
		hora2 = sc.nextInt();
		
		System.out.println("Minuto 2:");
		minuto2 = sc.nextInt();
		
		sc.close();
		
		
		if(diferenciaMin(hora1,minuto1,hora2,minuto2) == 0){
			
			if(hora1 < 0 || minuto1 < 0 || minuto2 < 0 || hora2 < 0) System.out.print("El valor NO puede ser negativo");
			
			if(minuto2 >= 60||minuto1 >= 60)System.out.print("NO puede pasar el limite permitido en minutos");
			
			if((hora1 == 0|| hora2 == 0 || minuto1 == 0 || minuto2 == 0)) System.out.print("Todos los VALORES NO pueden ser cero");
			
			
		}else if(diferenciaMin(hora1,minuto1,hora2,minuto2) < 0){
			
			System.out.print("El tiempo 2 es mayor que el primero por: "+diferenciaMin(hora1,minuto1,hora2,minuto2)+"min");
			
		}else if(diferenciaMin(hora1,minuto1,hora2,minuto2) > 1) {
			
			System.out.print("El tiempo 1 es mayor que el segundo por: "+diferenciaMin(hora1,minuto1,hora2,minuto2)+"min");
			
		}
	}
	
	public static int  diferenciaMin(int hora1, int minuto1, int hora2, int minuto2) {
		
		
		
		if(hora1 < 0 || minuto1 < 0 || minuto2 < 0 || hora2 < 0) return 0;
		
		if(minuto2 >= 60) return 0;
		
		if(minuto1 >= 60) return 0;
		
		int tiempo1= hora1 * 60 + minuto1;
		int tiempo2 = hora2 * 60 + minuto2;
		int resultado = tiempo1 - tiempo2;
		
		return resultado;
		
		
	}

}
