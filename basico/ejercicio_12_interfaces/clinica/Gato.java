package clinica;

public class Gato extends Animal{

	public Gato() {
		
	}
	
	public Gato(String nombre,int edad, float peso, float altura ) {
		this.nombre=nombre;
		this.edad=edad;
		this.peso=peso;
		this.altura=altura;
	}
	
	public Gato (Gato gato) {
		
		this.nombre=gato.nombre;
		this.edad=gato.edad;
		this.peso=gato.peso;
		this.altura=gato.altura;
		
		
		}
	
	

}
