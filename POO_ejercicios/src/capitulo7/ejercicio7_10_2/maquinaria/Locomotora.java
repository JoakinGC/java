package capitulo7.ejercicio7_10_2.maquinaria;

import capitulo7.ejercicio7_10_2.personal.Mecanico;

public class Locomotora {
	
	private String matricula;
	private int potencia;
	private int anYoFab;
	
	Mecanico mecanico;
	
	public Locomotora() {}

	public Locomotora(String matricula, int potencia, int anYoFab, Mecanico mecanico) {
		this.matricula = matricula;
		this.potencia = potencia;
		this.anYoFab = anYoFab;
		this.mecanico = mecanico;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getAnYoFab() {
		return anYoFab;
	}

	public void setAnYoFab(int anYoFab) {
		this.anYoFab = anYoFab;
	}

	public Mecanico getMecanico() {
		return mecanico;
	}

	public void setMecanico(Mecanico mecanico) {
		this.mecanico = mecanico;
	}	
}
