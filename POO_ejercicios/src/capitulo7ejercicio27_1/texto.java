package capitulo7ejercicio27_1;

public class texto {
	
	private String cad;
	private final int tamMax;
	static final String VOCALES = "aeiouáéíóú";
	
	public texto(int tamMax) {
		cad = "";	
		this.tamMax = tamMax;
	}
	
	public void add(char c) {
		if(tamMax > cad.length()) {
			cad =  cad + c;
		}
	}
	//No me agrada que le coloque el mismo nombre o una difrencia entre métodos hace confuso cuando
	//se llaman. Pero en este caso es por si usamos comillas simples o dobles.
	public void add(String c) {
		if(tamMax >= cad.length() + c.length()) {
			cad = cad + c;
		}
	}
	
	public void addPrincipio(char c) {
		if(tamMax > cad.length()) {
			cad = c + cad;
		}
	}
	
	public void addPrincipio(String c) {
		if(tamMax >= cad.length() + c.length()) {
			cad = c + cad;
		}
	}
	
	public void mostrar() { 
		System.out.println(cad); 
		} 
	
	
}
