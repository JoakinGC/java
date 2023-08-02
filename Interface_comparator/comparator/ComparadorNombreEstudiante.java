package capitulo9.comparator;

import java.util.Comparator;

public class ComparadorNombreEstudiante implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Estudiante e1 = (Estudiante) o1;//.toUpperCase()  
		Estudiante e2 = (Estudiante) o2;//.toLowerCase()
		//orden ascendente
		return e1.getNombre().compareTo(e2.getNombre()); //por orden alfabético ascendente, se utiliza precisamente el método compareTo() de la interfaz Comparable que implementa clase String directamente
	}
}
