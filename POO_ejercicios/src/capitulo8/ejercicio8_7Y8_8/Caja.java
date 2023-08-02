package capitulo8.ejercicio8_7Y8_8;



public class Caja { 

	public enum Unidad {CM, M} //centimetros y metros como posibles unidades de medida
	protected final double ancho, alto, fondo; //dimensiones 
	protected final Unidad unid; //unidades de medida 
	protected double volumen; //el volumen lo calculamos siempre em metros cúbicos 
	public String etiqueta; //permitimos que la etiqueta se modifique libremente 

	public Caja(double ancho, double alto, double fondo, Unidad unid) {
	
		this.ancho = ancho; 
		this.alto = alto; 
		this.fondo = fondo; 
		this.unid = unid;
	
		switch (unid) { 
			case CM: 
					volumen = (ancho / 100) * (alto / 100) * (fondo / 100); //pasamos a metros 
					break; 
			case M: 
					volumen = ancho * alto * fondo; //las medidas ya están en metros 
					break; 
			}
		}
	
		public double getVolumen() { 
			return volumen; 
		} 

		@Override 
		public String toString() { 
			return ancho + "x" + alto + "x" + fondo + " " + unid.toString() + "\n" + etiqueta; 
		}
	}
			