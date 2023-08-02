package capitulo7.ejercicio7_10_2;

import capitulo7.ejercicio7_10_2.maquinaria.Tren;
import capitulo7.ejercicio7_10_2.maquinaria.Vagones;
import capitulo7.ejercicio7_10_2.personal.Especial;
import capitulo7.ejercicio7_10_2.personal.Maquinista;
import capitulo7.ejercicio7_10_2.personal.Mecanico;
import capitulo7.ejercicio7_10_2.personal.Rango;

public class PuentoEntrada {

	public static void main(String[] args) {
		
		/*Maquinista maquinista = new Maquinista();
		maquinista.setNombre("Javi");
		maquinista.setSueldo(96543210);
		
		System.out.println(maquinista.toString());
		
		System.out.println("Nombre: "+maquinista.getNombre()+ ", sueldo: " + maquinista.getSueldo());
		
		
		Maquinista maquinista2 = new Maquinista("Pedro", "43546478J",49202,Rango.APRENDIZ);
		
		Rango [] rangos = Rango.values();
		
		for(int i = 0; i < rangos.length;i++) {
			System.out.println(rangos[i]);
		}
			
			//System.out.println(maquinista2.toString());
		
		
		
		
		//Mecanico mecanico = new Mecanico("Josefinasosjajskdjajdjakljdjajdajdjajdlajdjlajldjkajkldjlajddjadkajdkaljdlakdjajd","","");
		
		
		*/
		
		Vagones vagon1 = new Vagones(1000,"Carbon",100);
		Vagones vagon2 = new Vagones(1000,"especies",100);
		Vagones vagon3 = new Vagones(1000,"Telas",100);
		Vagones vagon4 = new Vagones(1000,"Cemento",100);
		Vagones vagon5 = new Vagones(1000,"Agua",100);
		
		Vagones vagones[] = {vagon1,vagon2,vagon3,vagon4,vagon5};
		
		
		Maquinista maquinista = new Maquinista("Pepe","0202021", 1000, Rango.APRENDIZ);
		
		Tren tren = new Tren();
			
		
		
		
	}

}
