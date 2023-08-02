package capitulo7.ejercicio7_10_2.maquinaria;

import java.util.Iterator;

import capitulo7.ejercicio7_10.vagon;
import capitulo7.ejercicio7_10_2.personal.Maquinista;

public class Tren {
	
	private static final int MAX_VAGONES = 5;
	private Locomotora locomotora;
	private Vagones[] vagones = new Vagones[MAX_VAGONES];
	private Maquinista maquinista;
	private int indiceVagones = 0;
		
	
	
	public Tren() {
		
	}

	public Tren(Locomotora locomotora, Vagones[] vagones, Maquinista maquinista) {
		
		this.locomotora = locomotora;
		setVagones(vagones);
		this.maquinista = maquinista;
	}

	public void setVagones(Vagones[] vagones2) {
		
		int contador = 0;
		
		if(vagones.length <= MAX_VAGONES) {
			this.vagones = vagones;
			for(int i = 0; i < vagones.length;i++) {
				if(vagones[i] != null) {
					contador++;
				}
			}
		}
		
		indiceVagones =  contador;
		
	}

	public void addVagon ( Vagones vagon) {
		if(indiceVagones <= MAX_VAGONES) {
			vagones[indiceVagones] = vagon;
			indiceVagones++;
		}
	}
	
	public void removeVagon(Vagones vagon) {
		if(indiceVagones >= 0) {
			indiceVagones--;
		}
	}
	 
	
}
