package ejercicios3;

import java.util.Arrays;

public class ejercicio7_7 {

	public static void main(String[] args) {
		
		
		float[] notas = {4,7,4,10,2};
		float min = -1;
		
		
		
		
		for(int i = 0; i < notas.length; i++) {
			for(int j = 0; j < notas.length;j++) {
					
					if(notas[i] > notas[j]) {
						
						min = notas[i];
						notas[i] = notas[j];
						notas[j] = min;
						
						
					}
				}
			
			}
		
		
		System.out.println(Arrays.toString(notas));
	}

}
