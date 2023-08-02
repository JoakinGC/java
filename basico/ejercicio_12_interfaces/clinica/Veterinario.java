package clinica;

import java.util.Arrays;

public class Veterinario {

	private String DNI;
	
	Animal[] animal = new Animal [25];
	int aux=0;
	
	public Veterinario() {
		
	
	}

	public Veterinario(String dNI) {
		
		DNI = dNI;
	}

	String getDNI() {
		return DNI;
	}

	void setDNI(String dNI) {
		DNI = dNI;
	}

	void anadirAnimal(Animal animal) {
		if (aux<25) {
			this.animal[aux]=animal;
			aux++;
		} else {
			System.out.println("No se pueden añadir mas animales");
		}
	}
	
	void cuidar(Animal animal) {
		animal.setBienestar();
	}
	
	@Override
	public String toString() {
		return "Veterinario [DNI=" + DNI + ", animal=" + Arrays.toString(animal) + "]";
	}
	
	
	
}
