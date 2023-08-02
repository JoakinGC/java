package capitulo7.ejercicio7_10_2.personal;

public class Mecanico {
	private String nombre;
	private String telefono;
	private String especialidad;
	//private enum Especilidad {FRENOS,HIDRAULICA,ELECTRICIDAD};
	Especial especilidad;
	
	public Mecanico(String nombre, String telefono, Especial especilidad) {
		setNombre(nombre);
		setTelefono(telefono);
		this.especialidad = especialidad;
	}
	
	
	public String getEspecialidad() {
		return especialidad;
		
	}

	public String getTelefono() {
		return telefono;		
	}

	public String getNombre() {
		return nombre;		
	}

	public void setEspecialidad(String especilidad) {
		if(especilidad == "Frenos") {
			this.especialidad = especilidad;
		}else if(especilidad == "Electricidad") {
			this.especialidad = especilidad;
		}else {
			System.err.println("NO validos");
		}
	}

	public void setTelefono(String telefono) {
		
		if(longitudCaraFija(telefono, 9)) {
			this.telefono = telefono;
		}else{
			System.err.println("Longitud no valida");
		}
	}

	public void setNombre(String nombre) {
		if(nombre.length() > 50) {
			System.err.println("Sobrepasa la longitud");
		}else {
			this.nombre = nombre;
		}
		
	}
	
	private boolean longitudCaraFija(String palabra, int longitud) {
		boolean test = false;
		if(palabra.length() == longitud) {
			return test = true;
		}
		return test;
	} 
	
	public String toString() {
		return "Mecanico [nombre = " + nombre + ", télefono = " + telefono +", especilidad = "+ especialidad+"]";
	}
}
