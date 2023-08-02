package capitulo7_7_1;

import java.util.Scanner;

public class Aduana {
	
	private final int MAX_PERSONAS=3; 
	private Persona [] personas = new Persona[MAX_PERSONAS];
	private int contadorPersonas=0;

	public Aduana() {
//		Persona persona = new Persona("Juan", "5463728H");
		int opcion;
		boolean pasar = false;
		
		do {
			System.out.println("Elige la opción:");
			System.out.println("1. Paso por frontera");
			System.out.println("2. Mostrar personas");
			System.out.println("3. Buscar por nombre");
			System.out.println("4. Buscar por DNI");
			System.out.println("5. Salir");
			
			opcion = new Scanner(System.in).nextInt();
			
			switch (opcion) {
			case 1:
				pasar = pasoPorFrontera();
				if(!pasar) {
					System.out.println("No se permite pasar a más gente por hoy.");
				}
				break;
			case 2:
			mostrarPersonas();
				break;
			case 3: 
				buscarNombre();
				break;
				
			case 4:
				buscarDNI();
				break;
			case 5:
				System.out.println("Saliendo...");
				break;
				
			default:
				System.out.println("Opción incorrecta.");
			}
			
		}while(opcion != 5 );
		
	}

	
	 private void buscarDNI() {
		String dni;
		
		System.out.println("Introduzca dni: ");
		dni = new Scanner(System.in).nextLine();
		
		for(int i = 0; i < contadorPersonas;i++) {
			if(dni.equals(personas[i].getDNI())) {
				System.out.println(personas[i].getNombre());
				System.out.println(personas[i].getDNI());
			}
		}
		
	}


	private void buscarNombre() {
		String nombre;
		
		System.out.println("Introduzca nombre: ");
		nombre = new Scanner(System.in).nextLine();
		
		for(int i = 0; i < contadorPersonas;i++) {
			if(nombre.equals(personas[i].getNombre())) {
				System.out.println(personas[i].getNombre());
				System.out.println(personas[i].getDNI());
			}
		}
	}


	private void mostrarPersonas() {
//		for(int i = 0;i < contadorPersonas; i++) {
//			System.out.println(personas[i]);
//		}
		int cont = 0;
		for(Persona persona: personas) {
			
			
			if(persona == null) {
				cont++;
			}else {
				System.out.println(persona.getNombre());
				System.out.println(persona.getDNI());
			}
		}
		System.out.println("Quedan de espacios: " + cont);
	}


	private boolean pasoPorFrontera() {
		String nombre;
		String dni;
		boolean insertado = false;
		
		System.out.println("Introduza nombre:");
		nombre = new Scanner(System.in).nextLine();
		System.out.println("Introduza DNI:");
		dni = new Scanner(System.in).nextLine();
		
		Persona persona = new Persona(nombre,dni);

		if( contadorPersonas < MAX_PERSONAS ) {
			personas[contadorPersonas] = persona;
			contadorPersonas++;
			insertado = true;
		}

		return insertado;
	}
	
}

