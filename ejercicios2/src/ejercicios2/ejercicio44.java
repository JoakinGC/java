package ejercicios2;

import java.util.Scanner;

public class ejercicio44 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int dias, horas, minutos,segundos;
		
		System.out.println("Días: ");
		dias= sc.nextInt();
		
		System.out.println("Horas: ");
		horas= sc.nextInt();
		
		System.out.println("Minutos: ");
		minutos = sc.nextInt();
		
		System.out.println("segundos: ");
		segundos = sc.nextInt();
		
		
		sc.close();
		
		if(segundosDevueltos(dias,horas,minutos,segundos) == 0 ||segundosDevueltos(dias,horas,minutos,segundos) == -1 ) {
			
			if(segundos >= 60) System.err.print("Segundos excede el LÍMITE de 59 PERMITIDO: " + segundos);
			
			if(minutos >= 60) System.err.print("Minutos excede el LÍMITE de 59 PERMITIDO: " + minutos);
			
			if(horas >= 24) System.err.print("Horas excede el LÍMITE de 23 PERMITIDO: " + horas);
			
			if(horas<0||dias<0||segundos<0||minutos<0) System.out.print("NO se permiten números negativos.");
		}else {
			System.err.println("Segundos: " + segundosDevueltos(dias,horas,minutos,segundos)+"seg");
		}
	}

	public static int segundosDevueltos(int dias, int horas, int minutos, int segundos) {
		
		if(horas<0||dias<0||segundos<0||minutos<0) return -1;
		
		if(segundos >= 60) return 0;
		
		if(minutos >= 60) return 0;
		
		if(horas >= 24) return 0;
		
		
		
		segundos = segundos + ((dias * 24)*3600) + (minutos * 60) + (horas * 3600) ; 
		
		return segundos;
		
	}
}
