package jugador_VEprofesor;

public class Principiante extends Jugador{
	private final int DANIO_MAX = 3;
	
	Principiante(String nombre){
		super(nombre);
		danio = DANIO_MAX;
	}
	
	@Override
	int disparar() {
		System.out.println("Soy un principiante disparando. Daño: " + danio);
		
		
		return 0;
	}

	@Override
	public String toString() {
		return "Principiante [DANIO_MAX=" + DANIO_MAX + ", toString()=" + super.toString() + "]";
	}
	
	/*@Override
	int disparar() {
		System.out.println("Soy un principiante disparando. Daño: " + getDanio);
		
		si no queremos usar proteted podemos usar getDanio pero sin cambiar el valor.
		
		return 0;
	}*/
	
	public void saludar() {
		System.out.println("Hola");
	}
}
