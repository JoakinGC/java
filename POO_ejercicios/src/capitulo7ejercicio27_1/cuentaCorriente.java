package capitulo7ejercicio27_1;



class CuentaCorriente {
	
	//Si bien coloc algunos atributos con private no lo hizo con todos y unos más importantes que otros tampoco como el DNI
	//¿porque?
	
	private double saldo; 
	public String nombre;  
	String dni;  
	private double limite;
	Banco banco;
	
	static String nombreBanco = "Java Developers FEMPA";
	
	
	CuentaCorriente(String nombre, String dni,Banco banco){ 
		this(0,-50,dni);
		this.nombre = nombre;
		this.banco = banco;
		
		//Porque no usar solo una funcion contructora con los parametros que solo usamos y porque 
		// varias funciones constructuras si bien se diferencia con los parametros puede llegar a servir algunos
		// En la mayoria de casos solo se presta para la confunsión en este caso
		
} 
	
	void cambiarBanco(Banco banco) {
		this.banco = banco;
	}
	
	
	
	
	/* el uso del this de esta manera no termino de entenderlo saber a que hace
	 * referencia segun el libro es lo mismo que hacer la asignación uno por uno pero de esta manera colocamos 
	 * todos en una sola linea de código.*/
	
	CuentaCorriente(double saldo){
		this(saldo,0,"Sin DNI");
		
	}
	
	CuentaCorriente(double saldo, double limite, String dni) {
		this.saldo = saldo;
		this.nombre = "Sin asignar";
		this.dni = dni;
		this.limite = limite;
	}
	
	boolean egreso(double cant) { 
		
		boolean operacionPosible;
		
		if ((saldo - cant) >= limite) {  
				saldo -= cant;  
				operacionPosible = true; 
		}else { 
				System.out.println("No hay dinero suficiente"); 
				operacionPosible = false; 
		}
		
		return (operacionPosible); 
	}	 
	
	

	void ingreso(double cant) { 
		saldo += cant; 
	}
	
	void mostrarInformacion() { 
		
		System.out.println("Información del Banco: ");
		
		if(banco == null) {
			System.out.println("Cuenta no asociada a ningún banco");
		}else {
			banco.mostrarInformacion();
		}
		
		System.out.println("Nombre: " + nombre); 
		System.out.println("Dni: " + dni); 
		System.out.println("Saldo: " + saldo); 
		System.out.println("Limite descubierto: " + limite);
		System.out.println("Nombre de banco: " + nombreBanco);
	}
}
