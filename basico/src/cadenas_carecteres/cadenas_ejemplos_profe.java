package cadenas_carecteres;

public class cadenas_ejemplos_profe {

	public static void main(String[] args) {
		
				// TODO Auto-generated method stub

				/*char caracter = '\'' ;

				System.out.println(caracter);

				//		String cadena = caracter;

				caracter = 'A';

				boolean mayuscula = Character.isUpperCase(caracter); 

				if( mayuscula ) {
					System.out.println("Letra mayuscula ... paso a minuscula");
					char letra = Character.toLowerCase(caracter);
					System.out.println("letra: " + letra);
					System.out.println("caracter: " + caracter);



				}


				//		float num = 12.4F;
				//		
				//		String cadenaFloat = String.valueOf(num);
				//		System.out.println(cadenaFloat);

*/

				String cadena1 = "Alondra";
				String cadena2 = "Nutria";
				String cadena3 = "Zorro";


				System.out.println(cadena2.compareTo(cadena1));

				String cadena4 = cadena1.concat(cadena2);

				System.out.println(cadena4);

				//		System.out.println( cadena4.charAt(879) );


				String text = "   HOla   soy Javi   ME voy   a casa     ";  
				String textStripped = text.strip();
				//		String textStripped = text.stripLeading();
				//		String textStripped = text.stripTrailing();
				String textTrimmed = text.trim();

				System.out.println(textStripped+"FIN");
				System.out.println("--");
				System.out.println(textTrimmed +"FIN");


				String nombres = " Pepe , Juan, Maria, etc";

				System.out.println( nombres.indexOf("Pepe")  );

				String cadenaNull="HOla";
				//		String cadenaNull = new String("Hola");
				//		int [] vector = new int[4];

				cadenaNull=null;

				if (cadenaNull != null) {

					if (cadenaNull.isEmpty() ) {
						System.out.println("Estoy vacía");
					}
				}
				
				String cadenaSplit = "En,un,lugar,de,la,Mancha";
				String[] palabras = cadenaSplit.split(",");
				
				for (int i = 0; i < palabras.length; i++) {
					System.out.println(palabras[i]);
				}
				
				
				for (String palabra : palabras) {
					
					System.out.println( palabra  );
					
				}
				
				
				
				
				
				











			}

		

	}


