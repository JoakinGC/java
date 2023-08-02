package clinica;

public abstract class Animal {

	protected String nombre;
	protected int edad;
	protected float peso;
	protected float altura;
	protected int bienestar;
	String getNombre() {
		return nombre;
	}
	void setNombre(String nombre) {
		this.nombre = nombre;
	}
	int getEdad() {
		return edad;
	}
	void setEdad(int edad) {
		this.edad = edad;
	}
	float getPeso() {
		return peso;
	}
	void setPeso(float peso) {
		this.peso = peso;
	}
	float getAltura() {
		return altura;
	}
	void setAltura(float altura) {
		this.altura = altura;
	}
	int getBienestar() {
		return bienestar;
	}
	void setBienestar() {
		if (this.bienestar <=100) {
			this.bienestar++;
		} else {
			System.out.println("exceso de bienestar");
		}
		
	}
	@Override
	public String toString() {
		return "Nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", altura=" + altura + ", bienestar="
				+ bienestar + "]";
	}
	
	
	
}
