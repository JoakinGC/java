package jugador_VEprofesor;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		Principiante principiante = new Principiante("Javi");
		System.out.println(principiante);

		principiante.disparar();
		
		Jugador jug2 = new Principiante("Mar");
		
		jug2.disparar();
		
		jug2 = null;
		
		
		Avanzado avanzado = new Avanzado("Maron");
		System.out.println(avanzado.toString());
		
		jug2 = new Avanzado("Morfo");
		
		jug2.disparar();
		
		//polimosfimso dinamico
		
		
		
		Jugador [] jugadores = new Jugador[2];
		
		jugadores[0] = principiante;
		jugadores[1] = avanzado;
		
		for (int i = 0; i < jugadores.length; i++) {
			jugadores[i].disparar();
			
			
			//....
			
			//jugadores[i].saludar();
			
			//No se puede acceder a los métodos especificos de la clase hijo.
		}
		
		Vehiculo vehiculo = new Vehiculo(30);
		int velocidad = 30;
		
		avanzado.conducir(1, 2, vehiculo, velocidad);

		
		
	}

}
