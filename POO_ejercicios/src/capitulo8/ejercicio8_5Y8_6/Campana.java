package capitulo8.ejercicio8_5Y8_6;

public class Campana  extends Instrumento{
		public Campana() {
			super();
		}
		
		@Override
		public void interpretar() {
			for(int i = 0;i < numNotas;i++) {
				switch(notas[i]) {
				case DO:
					System.out.println("Dolonnnnnn");
					break;
				case RE:
					System.out.println("Reeeeeen");
					break;
				case MI:
					System.out.println("Miiiiii");
					break;
				case FA:
					System.out.println("Faaaaaa");
					break;
				case SOL:
					System.out.println("Soooool");
					break;
				case LA:
					System.out.println("Laaaaaa");
					break;
				case SI:
					System.out.println("Siiiiiiii");
					break;
				}				
			}
			System.out.println("");
		}
}
