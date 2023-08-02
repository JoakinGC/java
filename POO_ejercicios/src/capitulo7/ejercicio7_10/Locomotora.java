package capitulo7.ejercicio7_10;

import capitulo7.ejercicio7_10.personal.Mecanico;

public class Locomotora {
	
	String matricula; 
	int potencia; 
	int añoFabricacion; 
	Mecanico mec; 
	public Locomotora(String matricula, int potencia, int añoFabricacion, Mecanico mec) {
		this.matricula = matricula; 
		this.potencia = potencia; 
		this.añoFabricacion = añoFabricacion; 
		this.mec = mec; 
	}
}
