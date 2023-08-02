package capitulo7_7_1;

public class Persona {
	
	private String nombre;
	private  String DNI;
	
	
	public Persona() {}
	
	public Persona(String nombre,String DNI) {
		setNombre(nombre);
		setDNI(DNI);
	}
	
	public Persona( Persona persona) {
		this.nombre = persona.nombre;
		this.DNI = persona.DNI;
	}

	@Override
	public String toString() {
		return "Persona [nombre = " + nombre + ", DNI = " + DNI + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}
	
	
}
