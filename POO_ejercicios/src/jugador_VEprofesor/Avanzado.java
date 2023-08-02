package jugador_VEprofesor;

public class Avanzado extends Jugador{

	private final int DANIO_AVANZADO = 5;
	
	public Avanzado(String nombre) {
		super(nombre);
		super.danio = DANIO_AVANZADO;
	}
	
	@Override
	int disparar() {
		
		System.out.println("Soy un avanzado disparando. Daño: " + danio);
		return danio;
	}

	
	//Solo si nos parece necesrio cambiaremos el método toString().
	/*@Override
	public String toString() {
		return "Avanzado [DANIO_AVANZADO=" + DANIO_AVANZADO + ", toString()=" + super.toString() + "]";
	}*/
	
	public void conducir(int x,int y, Vehiculo vehiculo,int velocidad) {
		vehiculo.encender();
		vehiculo.acelerar(velocidad);
		vehiculo.desplazar(x, y);
		vehiculo.frenar(velocidad);
		vehiculo.apagar();
	}
}
