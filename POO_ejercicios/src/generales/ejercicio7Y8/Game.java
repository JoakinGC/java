package generales.ejercicio7Y8;

import java.util.Scanner;

import generales.ejercicio7Y8.jugadores.Avanzado;
import generales.ejercicio7Y8.jugadores.Principiante;

public class Game {
	
	
	/*
	 * En un juego de ordenador existen 2 tipos de jugadores: los principiantes y 
	 * los avanzados.

 ·       Todos ellos deben tener un nombre y unos puntos de vida (del 0 al 100). 
 Además, pueden ir andando a unas coordenadas( x, y ) y también pueden disparar.

·       Los jugadores principiantes al disparar hacen un daño de 3 puntos de vida.

·       Los jugadores principiantes al disparar hacen un daño de 5 puntos de vida.

·       Los jugadores avanzados además de andar también pueden conducir un vehículo
 para desplazarse más rápido a unas coordenadas.

·       Cada vehículo tiene asociada una velocidad que puede ser leída y 
ajustada a un valor dado, pero no puede superar una velocidad máxima establecida.

·       La velocidad máxima de un vehículo sólo se podrá asignar una 
vez al crearse cada vehículo, y no podrá ser modificada.

·       Todos los atributos de las clases serán privados y tendrán 
métodos públicos para acceder a ellos (get/set) salvo que los requisitos indiquen 
lo contrario.



Nota: No se tiene que implementar ninguna lógica real dentro de los métodos, simplemente 
mostrar por consola que se está ejecutando el método en cuestión.
 Por ejemplo, en el método andar del jugador principiante se mostrará por pantalla 
 un mensaje similar a “Soy un jugador principiante y estoy andando a las coordenadas X , Y”.
	 * */

	public  Game() {
		
		Principiante player1 = new Principiante();
		Principiante player2 = new Principiante();
		int x = 0,x2 = 0,jugadorMostrar = 1,cambiarJugador = 0;
		String espaciosJugador1 = "",espaciosJugador2 = "";
		boolean comprobar = false;
		
		
		
		player1.setNombre();
		player1.setVida();
		
		System.out.println("¿Que quieres hacer?");
		String opciones = new Scanner(System.in).nextLine();
		while(true) {
			
			if(jugadorMostrar==1 && cambiarJugador == 0){
				mostrarJugadores(player1);
			}else if(jugadorMostrar==2 && cambiarJugador == 1){
				mostrarJugadores(player2);
			}
			switch(opciones) {
				case "d" :
					if(cambiarJugador == 1) {
				    	espaciosJugador1 += player1.Andar(x,espaciosJugador1,1);
				    	mostrarJugadores(player1);
				    	opciones = new Scanner(System.in).nextLine();
				    	x++;
					}else if(cambiarJugador == 0) {
						espaciosJugador2 += player2.Andar(x,espaciosJugador2,1);
				    	mostrarJugadores(player2);
				    	opciones = new Scanner(System.in).nextLine();
				    	x2++;
					}
				    	
					break;
				case "a":
					if(cambiarJugador == 1) {
						espaciosJugador1 = player1.Andar(x,espaciosJugador2,0);
						mostrarJugadores(player1);
						opciones = new Scanner(System.in).nextLine();
						if(x > 0)x--;
					}else if(cambiarJugador == 0) {
						espaciosJugador2 = player2.Andar(x,espaciosJugador2,0);
						mostrarJugadores(player2);
						opciones = new Scanner(System.in).nextLine();
						if(x2 > 0)x2--;
					}						
					break;
				case "p":
					comprobar = true;
					break;
				case "s":
					if(cambiarJugador == 1) {
						System.out.println(espaciosJugador1.length());						
					}else {
						System.out.println(espaciosJugador2.length());
					}
					opciones = new Scanner(System.in).nextLine();
					break;	
				case "n":
					if(jugadorMostrar==1) {
						player2.setNombre();
						player2.setVida();
						jugadorMostrar++;
					}
					opciones = new Scanner(System.in).nextLine();
					break;
				case "c":
					if(cambiarJugador == 0) {
						cambiarJugador = 1;
					}else if(jugadorMostrar == 2 && cambiarJugador == 1){
						cambiarJugador = 0;
					}					
					opciones = new Scanner(System.in).nextLine();
					break;
			}
			
			if(comprobar) break;
		}
	}
	
	
	
	
	
	private void pelea(Principiante jugador1, Principiante jugador2) {
			while(true) {
				System.out.println("Comienza una pelea!!");
				
			}
	}
	
	private void pelea(Avanzado jugador1, Avanzado jugador2) {
				
	}
	
	private void pelea(Avanzado jugador1, Principiante jugador2) {
			
	}
	
	private void mostrarJugadores(Avanzado jugador1, Avanzado jugador2) {
		jugador1.cuerpo();
		System.out.println(jugador1.getNombre());
		System.out.println(jugador1.getVida());
		System.out.println();
		jugador2.cuerpo();
		System.out.println(jugador2.getNombre());
		System.out.println(jugador2.getVida());
		System.out.println();
	}
	
	private void mostrarJugadores(Avanzado jugador1, Principiante jugador2) {
		jugador1.cuerpo();
		System.out.println(jugador1.getNombre());
		System.out.println(jugador1.getVida());
		System.out.println();
		jugador2.cuerpo();
		System.out.println(jugador2.getNombre());
		System.out.println(jugador2.getVida());
		System.out.println();
	}
	private void mostrarJugadores(Principiante jugador1, Principiante jugador2) {
		jugador1.cuerpo();
		System.out.println(jugador1.getNombre());
		System.out.println(jugador1.getVida());
		System.out.println();
		jugador2.cuerpo();
		System.out.println(jugador2.getNombre());
		System.out.println(jugador2.getVida());
		System.out.println();
	}
	
	private void mostrarJugadores(Principiante jugador1) {
		jugador1.cuerpo();
		System.out.println(jugador1.getNombre());
		System.out.println(jugador1.getVida());
		System.out.println();
	}
}
