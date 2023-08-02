package ejercicios4;

import java.util.Arrays;
import org.apache.commons.lang.ArrayUtils;

public class ejercicio19 {

	public static void main(String[] args) {
		/*Realiza un programa que sume, reste y multiplique los valores de dos matrices (A y B). Cada operación debe de implementarse en una función. Debe crearse también una función para mostrar las matrices.*/
		
		float [][] matrizA = {{3,3,3},{3,3,3},{3,3,3}};
		
		float[][] matrizB = {{5,5,5},{5,5,5},{5,5,5}};
		
		float[][] matrizC = sumarMatricez(matrizA, matrizB);
		
		int [] arr = new int[] {1,2,3,4,6,7};
		
		float [][] matrizD = Arrays.copyOfRange(matrizA,0,2);
		
		System.out.println(Arrays.deepToString(matrizD));
		
	}
	
	private static float[][] sumarMatricez(float[][] matrizA, float[][] matrizB) {
		
		
		float [][]matrizC = matrizA.clone();
		System.arraycopy(matrizA, 0, matrizC,2, 0);
		
		System.out.println(Arrays.deepToString(matrizA));
		
		for(int i = 0; i < matrizA.length;i++) {
			for(int j = 0; j < matrizA[i].length;j++) {
				matrizC[i][j]+=matrizB[i][j];
			}
		}
		System.out.println(Arrays.deepToString(matrizA));
		return matrizC; 
	}

}
