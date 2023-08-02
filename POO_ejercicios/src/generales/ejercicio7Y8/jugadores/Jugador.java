package generales.ejercicio7Y8.jugadores;

import java.util.Scanner;

abstract class Jugador {
	protected String nombre;
	protected int vida;
	
	protected Jugador() {
		
	}
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre() {
		System.out.println("¿Cúal es el nombre de tu personaje?");
		String nombre = new Scanner(System.in).nextLine();
		this.nombre = nombre;
	}


	public int getVida() {
		return vida;
	}


	public void setVida() {
		this.vida = 100;
		System.out.println(vida);
	}


	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", vida=" + vida + "]";
	}


	public String Andar(int x,String espacios,int elejir) {
		//String espacios2 = espacios.substring(0);
		System.out.println(espacios.length());
		int aux = espacios.length()-1;
		if(x >= 0 && elejir == 1) {
			for(int i = 0;i < 10;i++){
				espacios += " ";
				System.out.println(espacios+"  ...");
				System.out.println(espacios+" :   :");
				System.out.println(espacios+"  ...");
				System.out.println(espacios+"   . ");
				System.out.println(espacios+":  .  :");
				System.out.println(espacios+".......");
				System.out.println(espacios+"   .");
				System.out.println(espacios+"   .");
				System.out.println(espacios+"  . .");
				System.out.println(espacios+"..   ..");
				System.out.println("Espacios .lenght: "  + espacios.length());
			}	
		}else if(x > 0 && elejir == 0) {
			
			for(int i = 0;i < 10;i++){
				espacios = espacios.substring(0,aux);
				System.out.println(espacios+"  ...");
				System.out.println(espacios+" :   :");
				System.out.println(espacios+"  ...");
				System.out.println(espacios+"   . ");
				System.out.println(espacios+":  .  :");
				System.out.println(espacios+".......");
				System.out.println(espacios+"   .");
				System.out.println(espacios+"   .");
				System.out.println(espacios+"  . .");
				System.out.println(espacios+"..   ..");	
				System.out.println("Espacios .lenght: "  + espacios.length());
				aux--;
			}
		}else if(x == 0 && elejir == 0&& espacios.length() > 0) {
			
			for(int i = 0;i < 10;i++){
				espacios = espacios.substring(0,aux);
				System.out.println(espacios+"  ...");
				System.out.println(espacios+" :   :");
				System.out.println(espacios+"  ...");
				System.out.println(espacios+"   . ");
				System.out.println(espacios+":  .  :");
				System.out.println(espacios+".......");
				System.out.println(espacios+"   .");
				System.out.println(espacios+"   .");
				System.out.println(espacios+"  . .");
				System.out.println(espacios+"..   ..");	
				System.out.println("Espacios .lenght: "  + espacios.length());
				aux--;
			}
			espacios = "";
		}
		return espacios;
	}	
	
	public void cuerpo() {
		System.out.println("    ...");
		System.out.println("   :   :");
		System.out.println("    ...");
		System.out.println("     . ");
		System.out.println("  .......");
		System.out.println("  .  .  .");
		System.out.println("     . ");
		System.out.println("    . .");
		System.out.println("  ..   ..");
	}
	
	
}
