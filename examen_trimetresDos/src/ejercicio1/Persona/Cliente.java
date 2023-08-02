package ejercicio1.Persona;

import java.util.Objects;

public class Cliente extends Persona{
	private String telefono;

	public Cliente() {super();}

	public Cliente(String nombre, int edad,String telefono) {
		super(nombre, edad);
		setTelefono(telefono);
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		if(telefono.length()<=9&&telefono.length()>0&&telefono.length() == 9) {
			this.telefono = telefono;
		}else {
			System.err.println("NO cumple con la longitud");
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(telefono);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(telefono, other.telefono);
	}

	@Override
	public String toString() {
		return "Cliente [telefono=" + telefono + "]";
	}
	
	public void mostrarInfo() {
		System.out.println("Nombre: " + getNombre());
		System.out.println("Edad: " + getEdad());
		System.out.println("Télefono: " + getTelefono());
	}
	
	
}
