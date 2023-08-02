package ejercicios_cadenas;

import java.util.Scanner;

public class ejercicio2 {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		
		String prueba = "Mensaje/*contenido*/ ksalksalksl/*msakmskma*/mskamska/*ksmasmakl*/";
		
		System.out.println(prueba);
		System.out.println(codigoSinComentarios(prueba));
		
	}
	
	private static boolean vacio(String mensaje) {
		boolean vacio = false;

		if(mensaje.isEmpty()) vacio = true;
		
		return vacio;
	}
	
	private static char[] codigoSinComentarios(String mensaje) {
		
		char[] codigo = mensaje.toCharArray();
		 	
		for(int i = 0; i < codigo.length-1;i++) {
				if(codigo[i] == '/' && codigo[i+1] == '*') {
					for(int j = i; j < codigo.length-1;j++) {
						
						if(codigo[j] == '*'
								&& 
							codigo[j + 1] == '/') {
							
							codigo[j] = ' ';
							codigo[j+1] = ' ';
							break;
							
						}						
						codigo[j] = ' ';						
				}
			}
		}
		
		return codigo;
	}
}
