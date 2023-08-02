package ejercicio1.Persona;

import java.util.Objects;

public class Subordinado extends Empleado{
	
	private String cargo;
	private Directivo jefe;
	
	
	public Subordinado() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Subordinado(String cargo, Directivo jefe,String nombre, int edad) {
		super(nombre, edad);
		this.jefe = jefe;
		this.cargo = cargo;
	}
	
	public Subordinado(String cargo,String nombre, int edad) {
		super(nombre, edad);
		this.cargo = cargo;
	}

	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public Directivo getJefe() {
		return jefe;
	}


	public void setJefe(Directivo jefe) {
		this.jefe = jefe;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(cargo, jefe);
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
		Subordinado other = (Subordinado) obj;
		return Objects.equals(cargo, other.cargo) && Objects.equals(jefe, other.jefe);
	}

	
	@Override
	public String toString() {
		return "Subordinado [cargo=" + cargo + ", jefe=" + jefe.getNombre() + "]";
	}


	@Override
	public void mostrarInfo() {
		System.out.println("Nombre: " + getNombre());
		System.out.println("Edad: " + getEdad());
		System.out.println("Cargo: " + getCargo());
		if(jefe == null) {
			System.out.println("NO tiene asignado un jefe");
		}else {
			System.out.println("Su jefe es: " +getJefe());
		}
	}
}
