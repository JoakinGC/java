package intro;

public class jugador {

	String nombre;
	int dorsal;
	float altura;
	
	static String equipo = "Elche";
	
	//Contructor por defecto, no tiene parametros.
	public jugador() {
		nombre = "";
		dorsal = -1;
		altura = 0.0F;
	}
	
	public jugador(String nombre , int dorsal , float altura) {
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.altura = altura;
	}
	
	public void mostrarDatos() {
		System.out.println("Mi nombre es " + nombre + " ,y mi dorsal es " + dorsal + "  .Mido " + altura + "\nEquipo: " + equipo);
	}
	
	public static void cambiarEquipo(String nuevoEquipo) {
		equipo = nuevoEquipo;
	}
}


