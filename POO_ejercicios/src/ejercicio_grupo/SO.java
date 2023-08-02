package ejercicio_grupo;

abstract class SO {
	
	protected String Nombre;
	protected String version;
	
	public SO(){
		this.Nombre="";
		this.version = "0";
	}
	
	public SO(String nombre, String version) {
		setNombre(nombre);
		setVersion(version);
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "SO [Nombre=" + Nombre + ", version=" + version + "]";
	}
}
