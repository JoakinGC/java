package ejercicio1;

import java.util.Arrays;
import java.util.Objects;

import ejercicio1.Persona.Cliente;
import ejercicio1.Persona.Directivo;
import ejercicio1.Persona.Subordinado;

public class Empresa {
	private String nombre;
	private Subordinado empleados[];
	private Directivo directivos[];
	private Cliente cliente[];
	
	public Empresa() {}
	
	public Empresa(String nombre, Subordinado[] empleados, Directivo[] directivos, Cliente[] cliente) {	
		this.nombre = nombre;
		this.empleados = new Subordinado[empleados.length];
		this.directivos = new Directivo[directivos.length];
		this.cliente = new Cliente[cliente.length];
		setEmpleados(empleados);
		setDirectivos(directivos);
		setCliente(cliente);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Subordinado[] getEmpleados() {
		return empleados;
	}

	public void setEmpleados(Subordinado[] empleados) {
		for(int i = 0; i < this.empleados.length;i++) {
			if(empleados[i] == null) break;
			
			this.empleados[i] = empleados[i];
		}
	
	}

	public Directivo[] getDirectivos() {
		return directivos;
	}

	public void setDirectivos(Directivo[] directivos) {
		for(int i = 0; i < this.directivos.length;i++) {
			if(directivos[i] == null) break;
			
			this.directivos[i] = directivos[i];
		}
	}

	public Cliente[] getCliente() {
		return cliente;
	}

	public void setCliente(Cliente[] cliente) {
		for(int i = 0; i < this.cliente.length;i++) {
			if(cliente[i] == null) break;
			
			this.cliente[i] = cliente[i];
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(cliente);
		result = prime * result + Arrays.hashCode(directivos);
		result = prime * result + Arrays.hashCode(empleados);
		result = prime * result + Objects.hash(nombre);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empresa other = (Empresa) obj;
		return Arrays.equals(cliente, other.cliente) && Arrays.equals(directivos, other.directivos)
				&& Arrays.equals(empleados, other.empleados) && Objects.equals(nombre, other.nombre);
	}

	@Override
	public String toString() {
		String mensaje = "Empresa [nombre=" + nombre;
		
		for(int i = 0; i < empleados.length;i++) {
			if(empleados[i].getJefe() == null) {
				mensaje +="jefe=null";
			}else {
			mensaje+=empleados[i].toString();
			}
		}
		for(int i = 0; i < cliente.length;i++) {
			if(cliente[i] == null) {
				mensaje+=" null";
			}else {
				mensaje+=cliente[i].toString();
			}
		}
		for(int i = 0; i < directivos.length;i++) {
			if(directivos[i] == null) {
				mensaje+="Null";
			}else {
				mensaje+=directivos[i].toString();
			}
		}
		
		return mensaje;
	}
	
	
	
	
}
