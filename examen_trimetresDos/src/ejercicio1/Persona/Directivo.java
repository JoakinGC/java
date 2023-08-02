package ejercicio1.Persona;

import java.util.Arrays;
import java.util.Objects;

public class Directivo extends Empleado{
	private String categoria;
	private Subordinado[] grupoDeEmpleados;
	
	public Directivo() {super();}
	
	public Directivo(String nombre, int edad,String categoria, Subordinado[] grupoDeEmpleados) {
		super(nombre, edad);
		this.categoria = categoria;
		setGrupoDeEmpleados(grupoDeEmpleados);
	}
	

	@Override
	public String toString() {
		String mensaje = "Directivo [categoria=" + categoria; 
		for(int i = 0; i < grupoDeEmpleados.length;i++) {
			if(grupoDeEmpleados[i] == null) break;
			mensaje +=", " + grupoDeEmpleados[i].getNombre();
		}
		mensaje += "]";
		return mensaje;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Arrays.hashCode(grupoDeEmpleados);
		result = prime * result + Objects.hash(categoria);
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
		Directivo other = (Directivo) obj;
		return Objects.equals(categoria, other.categoria) && Arrays.equals(grupoDeEmpleados, other.grupoDeEmpleados);
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Subordinado[] getGrupoDeEmpleados() {
		return grupoDeEmpleados;
	}

	public void setGrupoDeEmpleados(Subordinado[] grupoDeEmpleados) {
		
		this.grupoDeEmpleados = new Subordinado[grupoDeEmpleados.length];
		for(int i = 0; i < grupoDeEmpleados.length;i++) {
			if(grupoDeEmpleados[i]==null) {
				System.err.println("NO puede ser null");
				break;
			}
			
			this.grupoDeEmpleados[i] = grupoDeEmpleados[i];
		}
	}

	@Override
	public void mostrarInfo() {
		System.out.println("Nombre: " + getNombre());
		System.out.println("Edad: " + getEdad());
		System.out.println("Categoria: " + getCategoria());
		System.out.println("Empleados subordinados: \n");
		for(int i = 0; i < grupoDeEmpleados.length;i++) {
			grupoDeEmpleados[i].getNombre();
		}
	}
}
