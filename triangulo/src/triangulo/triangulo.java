package triangulo;


import java.util.Scanner;

public class triangulo {

		    static Scanner sc = new Scanner(System.in);

		    public static void main(String[] args) {
		    	
		    	
		    	
		    	
		        int p;
		        System.out.print("De cuantos pisos quieres la piramide? ");
		        p = sc.nextInt();
		        if (p < 2) {
		            System.err.println("Necesita como minimo 2 pisos.");

		        } else {
		        	
		        	// Usar printlf para los ceros
		            for (int f = 0; f < p; f++) {
		                for (int c = 0; c < (p - f); c++) {
		                    System.out.print(" ");
		                }
		                System.out.print("*");
		                for (int a = 1; a < (f * 2 ); a++) {
		                    if(f==(p-1)){
		                        System.out.print("*");
		                    }
		                    else{
		                        System.out.print(" ");
		                    }
		                }
		                if(f>=1){
		                    System.out.print("*");
		                }
		                System.out.print("\n");
		            }
		        }
	 }

}
