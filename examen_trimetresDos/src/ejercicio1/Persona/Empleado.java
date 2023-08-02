package ejercicio1.Persona;

import java.util.Objects;

public abstract class Empleado extends Persona{
	private float sueldoBruto;
	
	public Empleado() {
		super();
		
	}
	
	public Empleado(String nombre, int edad) {
		super(nombre, edad);
	}
	
	public float getSueldoBruto() {
		return sueldoBruto;
	}

	public void setSueldoBruto(float sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}
	
	@Override
	public String toString() {
		return "Empleado [sueldoBruto=" + sueldoBruto + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(sueldoBruto);
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
		Empleado other = (Empleado) obj;
		return Float.floatToIntBits(sueldoBruto) == Float.floatToIntBits(other.sueldoBruto);
	}

	public abstract void mostrarInfo();
}
