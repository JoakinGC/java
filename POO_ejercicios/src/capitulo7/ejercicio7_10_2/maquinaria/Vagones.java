package capitulo7.ejercicio7_10_2.maquinaria;

public class Vagones {
	
	private final int CARGA_MAC;
	
	private int cargaActual;
	private String tipoCarga;
	
	
	public Vagones() {
		CARGA_MAC = 0;
	}
	
	public Vagones(int cargaActual, String tipoCarga) {
		CARGA_MAC = 0;
		this.cargaActual = cargaActual;
		this.tipoCarga = tipoCarga;
	}
	
	public Vagones(int cargaActual, String tipoCarga, int CARGA_MAX) {
		this.CARGA_MAC = CARGA_MAX;
		setCargaActual(cargaActual);
		this.tipoCarga = tipoCarga;
	}

	public void setCargaActual(int cargaActual) {
		if( cargaActual > CARGA_MAC) {
			cargaActual = -1;
		}else {
			this.cargaActual = cargaActual;
		}
	}

	public int getCARGA_MAC() {
		return CARGA_MAC;
	}

	public String getTipoCarga() {
		return tipoCarga;
	}

	public void setTipoCarga(String tipoCarga) {
		this.tipoCarga = tipoCarga;
	}

	public int getCargaActual() {
		return cargaActual;
	}
	
	
	public boolean addCarga(int kg) {
		boolean addEdd = true;
		
		if( cargaActual + kg > CARGA_MAC) {
			addEdd = false;
		}else {
			this.cargaActual += kg;
		}
		
		return addEdd;
	}
}
