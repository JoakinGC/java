package evalacionJava;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		/**/
		
		
		System.out.println("Funciono");
		for(int horas = 0;horas<=23;horas++) {
			
			for(int minutos = 0;minutos <= 59; minutos++) {
				
				for(int segundos = 0;segundos <= 59; segundos++) {
					
					
					if((horas >= 0 && horas < 10) && (minutos >= 0 && minutos < 10)&& (segundos >= 0 && segundos < 10)) {
						
				System.out.println("0"+horas + " : 0" + minutos +" : "+segundos+"0");
				
					}else if((horas >= 0 && horas < 10)&& (minutos >= 0 && minutos < 10)){
					
					System.out.println("0"+horas + " : 0" + minutos +" : "+segundos);

					}else if((horas >= 0 && horas < 10)) {
					
						System.out.println("0"+horas + " : " + minutos +" : "+segundos);
						
					}else if(horas == 0 && minutos == 0 && (segundos == 0 && segundos < 10)) {
					
						System.out.println("0"+horas + " :  0" + minutos +" : "+"0"+segundos);
					//son muchos casos pero con esto abarca de manera general
					// otros if se puede usar en minuto que no es cero y lo mismo con horas y a la inversa.
					}else if(minutos == 59 && horas == 23 && segundos == 59) {
						minutos = 0;
						segundos = 0;
						horas = 0; 
					}else {
						System.out.println(horas + " : " + minutos +" : "+segundos);
					}
				}
			}
			
		}

	}
}
