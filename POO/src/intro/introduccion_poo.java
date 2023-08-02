package intro;

public  class introduccion_poo {

	public static void main(String[] args) {
		/*LLamada de la clase jugador.*/
		
		jugador Jugador = new jugador();

		
		Jugador.nombre = "Pepe";
		Jugador.dorsal = 2;
		Jugador.altura = 1.7F;
		
		jugador Jugador2 = new jugador();

		
		Jugador2.nombre = "Pepe2";
		Jugador2.dorsal = 1;
		Jugador2.altura = 1.9F;
		
		jugador Jugador3 = new jugador();

		
		Jugador3.nombre = "Pepe3";
		Jugador3.dorsal = 3;
		Jugador3.altura = 1.85F;
		
		
		jugador [] vector = new jugador[3];
		
		vector[0] = Jugador;
		vector[1] = Jugador2;
		vector[2] = Jugador3;
		
		for(int i = 0; i < vector.length;i++) {
			System.out.println(vector[i].nombre+"\nSu altura: " + vector[i].altura+"\nSu dorsal: "+ vector[i].dorsal);
			vector[i].mostrarDatos();
		}
		
		//System.out.println(Jugador2);
		//System.out.println(Jugador2.nombre);
		
		//Jugador.cambiarEquipo();
		jugador.cambiarEquipo("Hercules");
		
		for(int i = 0; i < vector.length;i++) {
			System.out.println(vector[i].nombre+"\nSu altura: " + vector[i].altura+"\nSu dorsal: "+ vector[i].dorsal);
			vector[i].mostrarDatos();
		}
		
	}

}
