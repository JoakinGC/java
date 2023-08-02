package jugador_VEprofesor;

public class Vehiculo {
	private int VEL_MAX;
	private int velocidad;
	
	
	public Vehiculo(int VEL_MAX) {				
		setVEL_MAX(VEL_MAX);
		velocidad = 0;
	}


	public int getVEL_MAX() {
		return VEL_MAX;
	}


	public void setVEL_MAX(int vEL_MAX) {
		if(vEL_MAX <= 0) {
			System.err.println("NO puede ser 0 o MENOR");
		}else{
			VEL_MAX = vEL_MAX;
		}
	}


	public int getVelocidad() {
		return velocidad;
	}


	public void setVelocidad(int velocidad) {
		
		if(velocidad <= 0) {
			System.err.println("NO puede ser 0 o MENOR de 0");
		}else {
			this.velocidad = velocidad;
		}
	}
	
	public void acelerar(int velocidad){
		
		if(velocidad <= VEL_MAX) {		
				System.out.println("KACHAAAAAUUUUUUUU");		
				setVelocidad(velocidad);
		}
	}
	
	public void frenar(int velocidad){
		if(velocidad <= this.velocidad && velocidad > 0) {
			System.out.println("BOOOMMM");		
			this.velocidad = this.velocidad - velocidad;
		}
	}
	
	public void desplazar(int x, int y) {
		System.out.println("EL auto llego a : " + x +" y " + y+"\n A una velocidad de " + velocidad + "Km/h");
	}
	
	public void  encender() {
		System.out.println("Estoy encendido");
	}
	
	public void  apagar() {
		System.out.println("Estoy apagado");
	}
}
