package ejercicio2;

import java.util.Objects;

public class Parcela {
	private String ID;
	private int aerea;
	private String dniPropetario;
	private String tipo;
	
	public Parcela() {}
	
	public Parcela(String iD, int aerea, String dniPropetario, String tipo) {		
		setID(iD);
		setAerea(aerea);
		setDniPropetario(dniPropetario);
		setTipo(tipo);
	}


	public String getID() {
		return ID;
	}


	public void setID(String iD2) {
		if(iD2.length() == 4) {
			ID = iD2;
		}else {
			System.err.println("LONGITUD NO PERMITIDA DEL ID");
		}
	}


	public int getAerea() {
		return aerea;
	}


	public void setAerea(int aerea) {
		if(aerea > 0) {
			this.aerea = aerea;			
		}else {
			System.err.println("NO puede ser menor a 0  o 0 el aerea");
			this.aerea = 0;
		}
	}


	

	public String getDniPropetario() {
		return dniPropetario;
	}


	public void setDniPropetario(String dni) {
		
		
		if(dni.length()==9) {
			boolean prueba = false;
			int cont = 0;
			int cont2 = 0;
			char t[] = dni.toCharArray();
			for(int i = 0;i < t.length;i++) {
				if(Character.isDigit(t[i])&& i <=7) cont++;
				
				if(Character.isLetter(t[i])&& i ==8) cont2++;
			}
			if(cont == 8 && cont2 == 1) {
				this.dniPropetario = dni;
			}else {
				System.err.println("Formato NO aceptado");
			}
		}else {
			System.err.println("LONGITUD NO PERMITIDA DNI");
		}
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		if(tipo.equals("A")||tipo.equals("B")||tipo.equals("C")) {
			this.tipo = tipo;
		}else {
			System.err.println("Tipo NO aceptado");
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(ID, aerea, dniPropetario, tipo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parcela other = (Parcela) obj;
		return Objects.equals(ID, other.ID) && aerea == other.aerea
				&& Objects.equals(dniPropetario, other.dniPropetario) && Objects.equals(tipo, other.tipo);
	}
	
	
	
}
