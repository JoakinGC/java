package ejercicio1;

import ejercicio1.Persona.Cliente;
import ejercicio1.Persona.Directivo;
import ejercicio1.Persona.Subordinado;

public class Main {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Joaquin",20,"123456789");
		Cliente cliente2 = new Cliente("Pepe",24,"123456789");
		Cliente clientes[] = new Cliente[2];
		
		clientes[0]=cliente;
		clientes[1]=cliente2;
		
		Subordinado empleado = new Subordinado("Cocinero","Joaquin",19);
		Subordinado empleado2 = new Subordinado("Cocinero","Joaquin2",29);
		
		//cliente.mostrarInfo();
		//empleado.mostrarInfo();
		
		Subordinado[] empleados = new Subordinado[2];
		empleados[0] = empleado;
		empleados[1] = empleado2;
		
		Directivo jefe = new Directivo("Juan",40,"Superior",empleados);
		Directivo directores[]= new Directivo[1];
		
		directores[0] = jefe;
		
		empleado.setJefe(jefe);
		
		jefe.mostrarInfo();
		empleado.mostrarInfo();
		
		Empresa cocaCola = new Empresa("Coca Cola",empleados,directores,clientes);
		System.out.println(cocaCola.toString());
		
		
	}

}
