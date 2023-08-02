package ejercicios3;

public class ejercicio9 {

	public static void main(String[] args) {
		/*9 - Muestra el nombre, nota1, nota2 y nota media, de todos los alumno.*/

		
		float[] notas1 = {10,5,6,3,7}, notas2 = {10,8,9,4,1};
		String[] nombres = {"Sergio","Mario","Javi","Cristian","Pablo"};
		
		
		
		
		for(int i = 0; i < notas1.length; i++) {
			System.out.println("El nombre es: " + nombres[i]
					+ "\nSu primera nota es: " + notas1[i]
					+ "\nSu segunda nota es: " + notas2[i]
					+ "\nLa media es:  " + (notas1[i] + notas2[i]) / 2
					);
		}
		
		
	}

	
}
