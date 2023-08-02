package capitulo7.ejercicio7_10_2.personal;

public class Maquinista {
	private String nombre;
	private String dni;
	
	private float sueldo;
	
	public Rango rango; 
	
	
	private final float MAX_SUELDO = 350000;
	
	
	/**
	 * Constructor por defecto
	 */
	public Maquinista() {
	}
	
	
	/**
	 * 
	 * Constructor sobrecargado
	 * 
	 * @param nombre
	 * @param dni
	 * @param rango
	 * @param sueldo
	 */
	public Maquinista( String nombre , String dni,  float sueldo ,Rango rango) {
		this.nombre=nombre;
		this.dni = dni;
		this.rango = rango;
		setSueldo(sueldo);
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre( String nombre ) {
		this.nombre = nombre;
	}
	
	public float getSueldo() {
		return this.sueldo;
	}
	
	public void setSueldo( float sueldo ) {
		if(sueldo <= MAX_SUELDO) {
			this.sueldo = sueldo;
		}
		else {
			this.sueldo = -1;
			System.out.println("Sueldo inválido");
		}
	}
	
	private enum prueba {SHSHS,SJSJS};
	
	public String toString() {
		
		String estadoInterno = "Nombre: "+nombre+ "\nsueldo: " + sueldo + "\nrango: " + rango;
		
		return estadoInterno;
	}
	
}
