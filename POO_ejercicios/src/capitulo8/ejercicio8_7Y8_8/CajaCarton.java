package capitulo8.ejercicio8_7Y8_8;

public class CajaCarton extends Caja {
	
	
	static double cartonTotal = 0;  
	protected double area;  
	int etiqueta;
	
	CajaCarton(double ancho, double alto, double fondo) { 
		super(ancho, alto, fondo, CajaCarton.Unidad.CM);  
		area = 2 * (ancho * alto + ancho * fondo + alto * fondo);  
		cartonTotal += area;  	 
	} 

	double getArea() {
		return area; //devolvemos el área 
	}
	
	@Override  
	public double getVolumen() { 
		return volumen * 0.8;  
	} 
	
	@Override 
	public String toString() { 
		String result = "Cartón total " + cartonTotal + "cm2\n"; 
		result += "Área: " + area + "cm2\n"; 
		result += super.toString(); //aprovechamos el método de la superclase 
		return result; 
	}
}
