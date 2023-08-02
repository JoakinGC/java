package clinica;

public class Perro extends Animal {

	public Perro() {
		
	}
	
	public Perro(String nombre,int edad, float peso, float altura ) {
		this.nombre=nombre;
		this.edad=edad;
		this.peso=peso;
		this.altura=altura;
	}
	
	public Perro  (Perro perro) {
		
		this.nombre=perro.nombre;
		this.edad=perro.edad;
		this.peso=perro.peso;
		this.altura=perro.altura;
		
		
		
	}
	
	

	public Perro aparearse (Perro perro) {
	
		
		
		return perro;}
	
	
}
