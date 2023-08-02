package ejercicios3;

public class ejercicios_partidos {



			private static void mostrarInforme(String[] equipos, int[][] equiposPartidos) {
			
				for (int i = 0; i < equiposPartidos.length; i++) {
				System.out.println(
						equipos[i] 
						+" ha ganado " + equiposPartidos[i][1] 
						+" ha perdido " + equiposPartidos[i][3] 
						+" ha empatado " + equiposPartidos[i][2] 
						+ " y tiene " + equiposPartidos[i][4] + " puntos");
				}
			}
			
			private static void mostrarInformeEmpates(String[] equipos, int[][] equiposPartidos) {
				for(int i = 0;i < equipos.length;i++) {
					System.out.println(equipos[i]+" Empato: " + equiposPartidos[i][2]);
				}
				
			}
			
			private static void mostrarGanador(String[] equipos, int [][] equiposPartidos) {
				int indice = -1;
				float mayor = -1;
				for(int i = 0; i < equiposPartidos.length;i++) {
					if(equiposPartidos[i][4] >= mayor) {
						indice = i;
						mayor = equiposPartidos[i][4];
					}
				}
				System.out.println("El equipo "  + equipos[indice] + "es el ganador con una puntuacion de: " + mayor);
			}
			
			
			private static void calcularPuntuaciones( int [][] matriz  ) {
				
				for(int i = 0; i < matriz.length; i++) {
					matriz[i][4] = (matriz[i][1]*3) + matriz[i][2];
				}
				
			}
			
			private static void mostrarVector( int [] vector ) {
				for (int i = 0; i < vector.length; i++) {
					System.out.print( vector[i] + " " );
				}
			}
			
			
			private static void mosrtarMatriz(int [][] matriz) {
				for (int i = 0; i < matriz.length; i++) {
					mostrarVector( matriz[i] );
					System.out.println();
				}
				
			}
			
			
			private static void mostrarVector( String [] vector ) {
				for (int i = 0; i < vector.length; i++) {
					System.out.print( vector[i] + " " );
				}
			}
			
			
			
			
			
			public static void main(String[] args) {
				// TODO Auto-generated method stub

				String [] equipos = {"España" , "Japón", "Alemania", "Costa Rica"};
				
				int [][] equiposPartidos = 
						
					{
							{10, 7, 1, 2, -1},
							{10, 8, 1, 1, -1},
							{10, 5, 2, 3, -1},
							{10, 2, 5, 3, -1}
					};
				
//				mostrarVector(equipos);
				
//				System.out.println(equipos);
				
				calcularPuntuaciones( equiposPartidos );

				mosrtarMatriz(equiposPartidos);
				
				System.out.println();
				
				mostrarInforme( equipos, equiposPartidos );
				
				mostrarGanador(equipos, equiposPartidos);
				
				mostrarInformeEmpates(equipos, equiposPartidos);

			}
}
