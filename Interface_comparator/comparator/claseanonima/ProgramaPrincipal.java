package capitulo9.comparator.claseanonima;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ProgramaPrincipal {

	public static void main(String[] args) {
			   
//	   Ejemplo utilizando la interfaz Comparartor con clases anónimas 
   
	   ArrayList< EstudianteComparator > arraylist2 = new ArrayList< EstudianteComparator >();
	   
	   arraylist2.add(new EstudianteComparator(101, "Ramón", 26));
	   arraylist2.add(new EstudianteComparator(505, "Andrés", 24));
	   arraylist2.add(new EstudianteComparator(809, "María", 32));

	   EstudianteComparator [] vEstudianteComparators = arraylist2.toArray(new EstudianteComparator [0] );// ejemplo de crear un vector de nuestro ArrayList para luego ordenarlo también
	   
	   System.out.println("Ordenamos ArrayList estudiantes COMPARATOR por nombre:");
//	   Collections.sort(arraylist2, EstudianteComparator.ComparadorNombre);
	   arraylist2.sort(EstudianteComparator.ComparadorNombre);
//	   for(EstudianteComparator estudiante: arraylist2){
//			System.out.println(estudiante);
//	   }
	   //utilizando una expresion lambda que implementa la interfaz funcional Consumer<T>
	   arraylist2.forEach(estudiante -> System.out.println(estudiante));
	   
	   System.out.println("Ordenamos VECTOR estudiantes COMPARATOR por nombre:");
	   Arrays.sort(vEstudianteComparators,EstudianteComparator.ComparadorNombre);
	   System.out.println( Arrays.deepToString(vEstudianteComparators) );
	   

	   
	   System.out.println("Ordenamos ArrayList estudiantes COMPARATOR por su número de matriculación:");
	   Collections.sort(arraylist2, EstudianteComparator.ComparardorNumMatricula);
//	   arraylist2.sort(EstudianteComparator.ComparardorNumMatricula);
//	   for(EstudianteComparator estudiante: arraylist2){
//			System.out.println(estudiante);
//	   }
	   //utilizando una expresion lambda que implementa el metodo abstracto accept() de la interfaz funcional Consumer<T>
	   arraylist2.forEach(estudiante -> System.out.println(estudiante));

	   
	   
	   System.out.println("Ordenamos VECTOR estudiantes COMPARATOR por número de matriculación:");
	   Arrays.sort(vEstudianteComparators,EstudianteComparator.ComparardorNumMatricula);
	   System.out.println( Arrays.deepToString(vEstudianteComparators) );
	   	   
	   
	   
	}

}
