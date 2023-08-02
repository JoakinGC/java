package jugador_VEprofesor;

abstract class Jugador {
	
	private final int VIDA_MAX = 100;
	protected String nombre;
	protected int pv;
	protected int danio;
	
	public Jugador() {
		this.nombre = "";
		this.pv = VIDA_MAX;
	}
	
	public Jugador( String nombre) {
		this.nombre = nombre;
		this.pv = VIDA_MAX;
	}
	
	public void andar(int x, int y) {
		System.out.println("Jugador andando a la posición " + x + " , " + y);
	}
	
	abstract int disparar() ;


	public int getPv() {
		return pv;
	}

	public void setPv(int pv) {
		if(pv <= VIDA_MAX){
			this.pv = pv;
		}else {
			this.pv = VIDA_MAX;
		}
	}
	
	protected int getDanio() {
		return danio;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", pv=" + pv + ", danio=" + danio + "]";
	}
}
