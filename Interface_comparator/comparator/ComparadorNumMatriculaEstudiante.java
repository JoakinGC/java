package capitulo9.comparator;

import java.util.Comparator;

public class ComparadorNumMatriculaEstudiante implements Comparator<Estudiante> {

	@Override
	public int compare(Estudiante estudiante1, Estudiante estudiante2) {
		
		return estudiante1.getNumMatricula() - estudiante2.getNumMatricula();
		
	}
}
