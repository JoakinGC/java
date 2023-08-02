package capitulo7ejercicio27_1;

public class main {

	public static void main(String[] args) {
		/* 
		* Creamos un objeto CuentaCorriente para probar la clase y realizar algunas 
		* operaciones de ejemplo. 
		*/ 
		
		
		
		/*CuentaCorriente c = new CuentaCorriente("Pepe", "12345678A"); 
		
		
		c.ingreso(1000); 
		c.egreso(300);  
		c.mostrarInformacion(); 
		System.out.println("Puedo sacar 700 euros: " + c.egreso(700));  
		System.out.println("Puedo sacar 500 euros: " + c.egreso(500));*/ 

		//Ejercicio 7.2:
		
		CuentaCorriente c1,c2,c3,c4;
		Banco b1,b2;
		
		
		//Como decia antes me parec mal usa dos funciones contructores y guardalos en dos variables
		// Cuando se puede usar una que tendria un parametro más que es el nombre de banco.
		b1 = new Banco("Internacion FEMPA JAVA");
		b2 =  new Banco("Caja de ahorro",10.6,"/cLarga s/n" );
		
		c1 = new CuentaCorriente("Pepe", "12345678A",b1);
		c4 = new CuentaCorriente("Pepe4", "12545678A",b1);
		
		c2 = new CuentaCorriente(1000);
		c3 = new CuentaCorriente(1000,50,"123345678A");
		
		c1.mostrarInformacion();
		//c2.mostrarInformacion();
		//c3.mostrarInformacion();
		c4.mostrarInformacion();
		
		//Comporbación métodos:
		
		/*c = new CuentaCorriente(100);
		c.mostrarInformacion();
		
		c = new CuentaCorriente(2000,-300,"98765432-Z");
		c.mostrarInformacion();
		
		
		c.cambiarNombreBanco("BBVA");
		c.mostrarInformacion();
		c1.mostrarInformacion();*/

	}

}
