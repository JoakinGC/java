package capitulo8.ejercicio8_7Y8_8;

public class main {

	public static void main(String[] args) {
		 
		Caja a, b; 
		a = new Caja(100, 200, 200, Caja.Unidad.CM); 
		a.etiqueta = "Antonio Pérez\nCalle Larga n 8"; 
		b = new Caja(1.2, 0.9, 1.45, Caja.Unidad.M); 
		b.etiqueta = "Pepa González. Entregar antes de las 10:00h"; 
		System.out.println(a); 
		System.out.println("Volumen: " + a.getVolumen()); 
		System.out.println(b); 
		System.out.println("Volumen: " + b.getVolumen());
		
		Caja a2 = new CajaCarton(100, 200, 200); //variable de tipo Caja 
		a2.etiqueta = "Dirección envio"; 
		System.out.println(a); 
		System.out.println("Volumen: " + a.getVolumen()); 
		CajaCarton b2 = new CajaCarton(50.6, 75.5, 100); 
		b2.etiqueta = 23; 
		System.out.println(b); 
		System.out.println("Volumen: " + b.getVolumen());
		
		//NO me quedo ninguna duda con respecto al como se usa las nuevas propiedades que vimos 
		// De hecho quedo claro que al ser un objecto que tiene caracteristicas similares a
		// la clase caja que nosotros creamos esta hereda sus atributos mas la  nuevas caracterestiscas que agrega la clase caja Carton
		// 
	
		
		
	}

}


