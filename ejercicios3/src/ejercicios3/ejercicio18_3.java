package ejercicios3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class ejercicio18_3 {
	
	static Scanner sc = new Scanner(System.in);
	

	public static void main(String[] args) {
		/*Crea una tabla tridimensional para almacenar los datos de las notas de los alumnos para cada trimestre. Se debe de calcular la nota media de cada toda la clase para cada trimestre, así como la nota media de todos los trimestres*/
		
		float[][][] notasAlumnos = {{{4,2,5,2,8},{8,9,10,7,8}},{{4,7,8,9,10},{7,8,9,10,4}}};
		String[] nombres = {"Joa", "Javi"};
		
		String nombre = "Joa";
		int indiceAlumno = indice(notasAlumnos,nombres,nombre);
		int indiceTrimetres = 1;
		float medias = media(notasAlumnos, indiceAlumno,indiceTrimetres);
		
		System.out.println(Arrays.deepToString(notasAlumnos));
		System.out.println(medias);
	}
	
	private static int indice(float[][][] notas,String[] nombres,String nombre) {
		
		int indices = -1;
		
		for(int i = 0; i < notas.length; i++) {
			if(nombres[i].equals(nombre)) {
				indices = i;
				break;
			}
		}
		
		return indices;
	}
	
	
	
	private static float media(float[][][] notasAlumnos,int indice, int indiceTrimetres) {
		float media = 0;
		float contador = 0;
		
		for(int j = 0; j < notasAlumnos[indice].length;j++) {
				contador++;
				media += notasAlumnos[indice][indiceTrimetres][j];
		}
		
		
		return media / contador;
	}
	
}
