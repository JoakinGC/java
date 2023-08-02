package cadenas_carecteres;

public class cadenas {

	public static void main(String[] args) {
		char c = 97;
		String cadena = String.valueOf(c);
		String cadena2 = "a";
		System.out.println(cadena);
		
		c = new char('Hola');
		
		if(Character.isLowerCase(c)) {
			System.out.println("Prueba");
		};
		
		if(cadena.equals(cadena2)) {
			System.out.println("Prueba2");
		};

	}

}
