package clinica;

public class MainClinica {

	public static void main(String[] args) {
	Veterinario veterinario = new Veterinario();
	Animal labrador = new Perro("Konstantino",5,23,15);
	
	veterinario.anadirAnimal(labrador);
	veterinario.cuidar(labrador);
	veterinario.cuidar(labrador);
	
	
	System.out.println( veterinario.toString());
	
	
}

}