package capitulo9.comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ProgramaPrincipal {
	
	public static void main(String[] args) {
			   
//	   Ejemplo utilizando la interfaz Comparartor 
   
	   ArrayList< Estudiante > arrayListEstudiantes = new ArrayList< Estudiante >();
	   
	   arrayListEstudiantes.add(new Estudiante(101, "Ram�n", 26));
	   arrayListEstudiantes.add(new Estudiante(505, "Andr�s", 24));
	   arrayListEstudiantes.add(new Estudiante(809, "Mar�a", 32));
	   
	   System.out.println("Ordenamos ArrayList estudiantes COMPARATOR por nombre:");
	   //Collections.sort(arraylist2,  new ComparadorNombreEstudiante());
	   ComparadorNombreEstudiante objetoComparadorNombreEstudiante = new ComparadorNombreEstudiante();
	   arrayListEstudiantes.sort( objetoComparadorNombreEstudiante);
	   
	   //mostramos los estudiantes ordenados por nombre
	   for(Estudiante estudiante: arrayListEstudiantes){
			System.out.println(estudiante);
	   }
	   
	
	   System.out.println("Ordenamos ArrayList estudiantes COMPARATOR por su n�mero de matricula:");
	   //arrayListEstudiantes.sort( new ComparadorNumMatriculaEstudiante());

	   Collections.sort(arrayListEstudiantes, new ComparadorNumMatriculaEstudiante());

	   for(Estudiante estudiante: arrayListEstudiantes){
			System.out.println(estudiante);
	   }
	}
}
