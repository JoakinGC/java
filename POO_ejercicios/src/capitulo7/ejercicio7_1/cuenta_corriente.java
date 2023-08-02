package capitulo7.ejercicio7_1;

public class cuenta_corriente {
	
	/**/
	
	private  float saldo;
	private float limiteDescubierto = -50;
	private String nombre;
	private  int DNI;
	
	public cuenta_corriente(String nombre, float saldo, int DNI,float limite) {
		
		if(comprobarNombre(nombre)) System.err.println("");
		
		
	}
	
	private boolean comprobarNombre(String nombre) {
		String aux;
		
		
		if(nombre.length() == 0 ) {
			System.err.println("La longitud debe ser mayor a 0");
			return true;
		}
		
		
		
		return false;
	}
	
}
