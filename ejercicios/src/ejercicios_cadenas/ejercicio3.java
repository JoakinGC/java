package ejercicios_cadenas;

import java.util.Arrays;
import java.util.Scanner;



/*Diseñar una aplicación que se comporte como una pequeña agenda. 
 * Mediante un menu el usuario podra elegir entre:
 * 
 * 1) Añadir un nuevo contacto (nombre y telefono), siempre
 * y cuando la agenda no este llena.
 * 
 * 2) Buscar un telefono de un contacto a partir de su nombre
 * 
 * 3) Mostrar la información de todos los contactos ordenados
 * alfabeticamente mediante el nombre.
 * 
 * En la agenda guardaremos el nombre y telefono con un maximo de
 * 20 caracteres.*/

public class ejercicio3 {

static Scanner sc = new Scanner(System.in);
static int cont = 0;

	private static void guardarContacto(String [] nombres, String [] telefonos,String nombre,String telefono){
		char [] nomChar = nombre.toCharArray();
		char [] telChar = telefono.toCharArray();
		
		if(cont < nombres.length) {
			if((nombre.isEmpty()) || (telefono.isEmpty())) {
			
				System.err.println("El nombre o télefono no puede estar vacio");
			
			}else if(nombre.trim().length() > 20 || telefono.trim().length() > 20) {
			
				System.err.println("El nombre o telefono debe ser mayor a 20 caracteres");
			
			}else {
			
				boolean test = true;
			
				for(char i : nomChar) {
			
					if(Character.isDigit(i)){
						System.err.println("El NOMBRE solo puede contener letras");
						test = false;
						break;
					}
				}
			
				for(char i : telChar) {
				
					if(Character.isLetter(i)){
						System.err.println("El TELEFONO solo puede contener números");
						test = false;
						break;
					}
				}			
			
			
			if(test) {
				nombres[cont] = nombre.trim();
				telefonos[cont] = telefono.trim();
				cont++;
			}
		}
	}else {
		System.err.println("LIMITE de conctatos de \" "+nombres.length+"\" ");
	}
}
	
	private static void buscador(String [] nombres, String[] telefonos, String nombre) {
		boolean test = true;
		
		for(int i = 0; i < nombres.length;i++) {
			if(nombre.equalsIgnoreCase(nombres[i])) {
				System.out.println("Su nombre es: "
						+ nombres[i]
						+ "\nSu télefono es: "
						+ telefonos[i]	
						);
				test =  false;
				break;
			}
		}
		
		if(test) System.out.println("NO se encuentra en nuestra base de datos");
	}

	
	private static void mostrarDatos(String[] nombres, String[] telefonos) {
		for(int i = 0; i < nombres.length; i++) {
			
			if(!(nombres[i].isEmpty())) {
				System.out.println("Nombre: " + nombres[i] 
						+ "\nTélefono: " + telefonos[i]
						);	
			};
		}
	}
	
	private static void ordenador(String[] nombres, String[] telefonos) {
		String palabra = nombres[0], palabra2 = telefonos[0];
		
		int indice = 0;
		
		for(int i = 0; i < nombres.length;i++) {			
			for(int j = i; j < nombres.length;j++) {
				if(nombres[i].compareToIgnoreCase(nombres[j]) > 0) {
						palabra = nombres[i];
						nombres[i] = nombres[j]; 
						nombres[j] = palabra;
						
						palabra2 = telefonos[i];
						telefonos[i] = telefonos[j];
						telefonos[j] = palabra2;
			}
		}
	}
	
}
		


	public static void main(String[] args) {
		
	String []nombres = new String[20];
	String []telefonos = new String[20];
	for(int i = 0; i < nombres.length;i++) {
		nombres[i]="";
		telefonos[i]="";
	}
		
	for(int i = 0; i <= 4;) {
		
		System.out.println("1) Añadir un nuevo contacto"
				+ "\n2)Busca un contacto"
				+ "\n3)Mostrar todos los conctatos."
				+ "\n4) Fin."
				+ "\nMaximo " +nombres.length +" contactos."
				);
		
		i = sc.nextInt();
		
		switch (i) {
		case 1:{
			sc.nextLine();
			System.out.println("Llevamos: "+ cont);
			
			System.out.println("Nombre:");
			String nombre = sc.nextLine();
			
			System.out.println("Telefono:");
			String telefono = sc.nextLine();
			
			guardarContacto(nombres,telefonos,nombre,telefono);
			System.out.println(Arrays.toString(nombres));
			System.out.println(Arrays.toString(telefonos));
			
			break;
		}
		case 2:{
			sc.nextLine();
			System.out.println("Nombre qu busca:");
			String nombre = sc.nextLine();
			
			
			buscador(nombres,telefonos,nombre);
			break;
		}
		case 3:{
			ordenador(nombres,telefonos);
			mostrarDatos(nombres,telefonos);	
			break;
			}
		case 4:{
			i=4;	
			break;
			}default:{
				i = 0;
				break;
			}
		}
		
	}
		
		
	}

}
