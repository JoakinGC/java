package capitulo9.comparator;

import java.util.Comparator;

public class ComparadorNombreEstudiante implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Estudiante e1 = (Estudiante) o1;//.toUpperCase()  
		Estudiante e2 = (Estudiante) o2;//.toLowerCase()
		//orden ascendente
		return e1.getNombre().compareTo(e2.getNombre()); //por orden alfab�tico ascendente, se utiliza precisamente el m�todo compareTo() de la interfaz Comparable que implementa clase String directamente
	}
}
