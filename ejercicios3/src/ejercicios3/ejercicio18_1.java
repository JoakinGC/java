package ejercicios3;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio18_1 {

	static Scanner sc = new Scanner(System.in);

	
	public static void main(String[] args) {
		/*Calcular y mostrar la nota media de cada alumno. Utiliza una función para el cálculo de la media de cada vector.*/
		
		
		
		System.out.println("Cantidad de Alumnos:");
		int cantiAlumnos = sc.nextInt();
		System.out.println("Cantidad de notas para cada uno:");
		int cantNotasXAlumn = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Cual es el nombre que buscas:");
		String nombre = sc.nextLine();
		
		float [][] notas = new float [cantiAlumnos][cantNotasXAlumn];
		String[] nombres = null;
		float promedio = 0;
		
		nombres = nombres(cantiAlumnos);
		notas = notas(cantiAlumnos,cantNotasXAlumn);
		promedio = media(notas,nombres,cantNotasXAlumn,nombre);
		int indice = indice(nombres,nombre);
		
		
		
		System.out.println("El Alumno "+ nombres[indice] );
		
		for(int i = 0; i < notas.length;i++) {
			
			if(indice ==i) {
				System.out.println("Sus notas son: "+Arrays.toString(notas[indice]));
				break;
			}	
		}
		
		System.out.println("Con un promedio de: " + promedio);
		
		
	}
	
	public static String[] nombres(int cantiAlumnos ){
		String []nombres = new String[cantiAlumnos];
		
		
		
		for(int i = 0; i < nombres.length;i++) {
			System.out.print("Nombre: ");
			nombres[i] = sc.nextLine();			
		}
		
		
		return nombres;
	}
	
	public static float [][]notas (int cantiAlumnos, int cantNotasXAlumn){
		float [][] notas = new float[cantiAlumnos][cantNotasXAlumn];
		
		for(int i = 0; i < notas.length;i++) {
			for(int j = 0; j < notas[i].length; j++) {
				System.out.print("Nota Nº" + i + " :");
				notas[i][j] = sc.nextFloat();
			}
		}
		
		
		return notas;
	}
	
	public static int indice(String[] nombres, String nombre) {
		int indice = -1;
		for(int i = 0; i < nombres.length;i++) {
			if(nombres[i].equals(nombre)) { 
				indice = i;
				break;
			}
		}
		return indice;
	}
	
	public static float media (float[][] notas, String[] nombres, int cantNotasXAlumn, String nombre) {
		
		
		int posicion = indice(nombres,nombre);
		
		float acumNota = 0;
		
		for(int i = 0; i < notas.length;i++) {
			
			acumNota=0;
			
			if(i == posicion) {
				for(int j = 0; j < notas[i].length;j++) {
					
					acumNota += notas[i][j];
				}
				break;
			}
		}
		acumNota = acumNota / cantNotasXAlumn;
		
		return acumNota;
	}

}