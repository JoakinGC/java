package evalacionJava;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio5 {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		float [][] num = {{5,9,10},{4,10,2},{8,5,0},{12,2,6}};

		System.out.println(Arrays.deepToString(num));
		mostrar(num);
		
		System.out.println("Solo acepta de 0 - 2");
		System.out.println("Elige una columna: ");
		int columna = sc.nextInt();
		
		
		System.out.println("Solo acepta de 0 - 3");
		System.out.println("Elige una fila: ");
		int fila = sc.nextInt();
		
		
		if(fila < 0 || fila > 3 || columna < 0 || columna > 2) {
			System.err.println("Fuera del rango");
		}else {
			maximoFila(num,fila,columna);
			minimoFila(num,fila,columna);
			minimoColumna(num,fila,columna);
			maximoColumna(num,fila,columna);
			maximoYminimo(num);
		}
	}
	
	private static void mostrar(float[][] num) {
		for(int i = 0; i < num.length;i++) {
			for(int j = 0; j < num[i].length;j++) {
				System.out.print("|"+num[i][j]+"|");
			}
			System.out.println();
		}
	}
	
	private static void maximoFila(float[][]num, int fila, int columna) {
		float max = num[fila][0];
		for(int i = 0; i < fila; i++) {
			for(int j = 0; j < num[i].length;j++) {
				if(max < num[i][j]) {
					max = num[i][j];
				}
			}
		}
		
		System.out.println("El maximo de la fila "+ fila + "\n es:"+max);
	}
	
	private static void minimoFila(float[][]num, int fila, int columna) {
		float min = num[fila][0];
		for(int i = fila; i <= fila; i++) {
			for(int j = 0; j < num[i].length;j++) {
				if(min > num[i][j]) {
					min  = num[i][j];
				}
			}
		}
		
		System.out.println("El minimo de la fila "+ fila + "\n es:"+min);
	}
	
	private static void minimoColumna(float[][]num, int fila, int columna) {
		float min = num[0][columna];
		
		for(int i = 0; i < num.length; i++) {
			if(min > num[i][columna]) {
				min = num[i][columna];
			}
		}
		
		System.out.println("El minimo de la columna "+ columna + "\n es:"+min);
	}
	
	private static void maximoColumna(float[][]num, int fila, int columna) {
		float max = num[0][columna];
		
		for(int i = 0; i < num.length; i++) {
			if(max < num[i][columna]) {
				max = num[i][columna];
			}
		}
		
		System.out.println("El maximo de la columna "+ columna + "\n es:"+max);
	}
	
	private static void maximoYminimo(float[][]num) {
		float min = num[0][0],indiceFila = 0, indiceCol = 0,max = num[0][0],indiceFila2 = 0, indiceCol2 = 0;
		
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < num[i].length;j++) {
				if(min > num[i][j]) {
					min  = num[i][j];
					indiceFila = i;
					indiceCol = j;
				}
			}
		}
		
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < num[i].length;j++) {
				if(max < num[i][j]) {
					max  = num[i][j];
					indiceFila2 = i;
					indiceCol2 = j;
				}
			}
		}
		
		System.out.println("El minimo es:"+min
				+ "\n Se encuentra en la fila: "+ (indiceFila+1)
				+ "\n Se encuentra en la columna: " + indiceCol
				+ "\nEl maximo es:"+max
				+ "\n Se encuentra en la fila: "+ (indiceFila2+1)
				+ "\n Se encuentra en la columna: " + indiceCol2
				);
	}
}
