package ejercicio2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	private static Parcela parcelas[] = new Parcela[20];
	private static Scanner sc = new Scanner(System.in);
	private static int contParcelas;

	public static void main(String[] args) {
		byte i = -1;
		
		do{
			mostrarMenu();
			byte opcion = (byte)sc.nextInt();
			
			switch (opcion) {
			case 5:{
				mostraParcelas();
				opcion = (byte)sc.nextInt();
				break;
			}case 3: {
				mostrarMenu();
				opcion = (byte)sc.nextInt();
				break;
			}case 2:{
				eliminarParcela();
				opcion = (byte)sc.nextInt();
				break;
			}case 1:{
				crearParcela();
				mostrarMenu();
				opcion = (byte)sc.nextInt();
				break;
			}case 0:{				
				i = 0;
				break;
				}
			}
		}while (i!=0);
	}
	
	private static void mostraParcelas() {
		for(int i = 0; i < parcelas.length;i++) {
			if(parcelas[i]==null) break;
			
			System.out.println("Parcela: ");
			System.out.println(parcelas[i].getID());
			System.out.println("Aereas: ");
			System.out.println(parcelas[i].getAerea()/100/100+"Hectareas");
			System.out.println("DNI del propietario: ");
			System.out.println(parcelas[i].getDniPropetario());
			System.out.println("Tipo: ");
			System.out.println(parcelas[i].getTipo());
		}
		
	}

	private static void eliminarParcela() {
		System.out.println("ID: ");
		String id = new Scanner(System.in).nextLine();
		int indice = -1;
		for (int i = 0; i < parcelas.length; i++) {
			if(parcelas[i]==null)break;
			if(id.equals(parcelas[i].getID())) {
				parcelas[i] =null;
				indice = i;
			}
		}
		
		for(int i = 0; i < parcelas.length;i++) {
			if(parcelas[i] == null && i == indice) {
				for(int j = i; j < parcelas.length;j++) {
					if(parcelas[j] != null) {
						parcelas[i] = parcelas[j];
					}
				}
			}
		}
		
		
		
	}

	private static void mostrarMenu() {
		System.out.println("Introduzca la opcion que desea realizar");
		System.out.println("1. Crear una parcela");
		System.out.println("2. Eliminar una parcela");
		System.out.println("3. Actualizar una parcela");
		System.out.println("4. Mostrar datos de una parcela");
		System.out.println("5. Mostrar datos de todas las parcelas");
		System.out.println("6. Mostrar parcelas de un propietario dado el DNI");
		System.out.println("0. Crear una parcela");
	}

	private static void crearParcela() {
		
		Parcela parcela = new Parcela();
		int cont  = 1;
		do {
			System.out.println("ID");
			String id = new Scanner(System.in).nextLine();
			parcela.setID(id);
			
			System.out.println("Aerea en mt cuadrados:");
			int aereas = new Scanner(System.in).nextInt();
			parcela.setAerea(aereas);
			
			System.out.println("DNI del propietario");
			String dni = new Scanner(System.in).nextLine();
			parcela.setDniPropetario(dni);
			
			System.out.println("Tipo: ");
			String tipo = new Scanner(System.in).nextLine();
			parcela.setTipo(tipo);
			
			if(parcela.getAerea() != 0&&parcela.getDniPropetario() != null&&parcela.getID() != null&&parcela.getTipo() != null) {
				parcelas[contParcelas] = parcela;
				cont = 0;
				contParcelas++;
			}
		}while(cont !=0);
		
	}
	
	
	

}
