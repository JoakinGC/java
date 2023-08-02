package capitulo7.ejercicio7_10;

import capitulo7.ejercicio7_10.personal.Maquinista;

public class Tren {
	Locomotora locomotora; 
	vagon vagones[]; 
	Maquinista responsable; 
	
	private int numVagones;  
	public Tren(Locomotora locomotora, Maquinista responsable) { 
		this.locomotora = locomotora; 
		this.responsable = responsable; 
	 
		vagones = new vagon[5]; 
		numVagones = 0;  
	}
	 
	public void enganchaVagon(int capacidadMax, int capacidadActual, String mercancia) { 
	if (numVagones < 5) { 
		System.out.println("El tren no admite más vagones"); 
	} else { 
		vagon v = new vagon (capacidadMax, capacidadActual, mercancia); 
		vagones [numVagones] = v; 
		numVagones ++; 
		}
	}
}
