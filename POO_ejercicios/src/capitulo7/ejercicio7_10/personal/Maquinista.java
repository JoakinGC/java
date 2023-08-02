package capitulo7.ejercicio7_10.personal;

public class Maquinista {
	
	//Porque no colocar private desde el principio.
	
	String nombre; 
	String dni; 
	double sueldo; 
	String rango;
	
	public Maquinista(String nombre, String dni, double sueldo, String rango) { 
		this.nombre = nombre; 
		this.dni = dni; 
		this.sueldo = sueldo; 
		this.rango = rango; 
	}
}
