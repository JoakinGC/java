package capitulo8.ejercicio8_5Y8_6;

public class Main {

	public static void main(String[] args) {
		Campana c = new Campana();
		c.add(Instrumento.Nota.DO);
		c.add(Instrumento.Nota.SI);
		c.add(Instrumento.Nota.SOL);
		c.add(Instrumento.Nota.RE);
		
		Piano p = new Piano();
		p.add(Instrumento.Nota.DO);
		p.add(Instrumento.Nota.MI);
		p.add(Instrumento.Nota.FA);
		p.add(Instrumento.Nota.DO);
		p.interpretar();
		
		
		/*Al crear la clase instrumento  creamos el esquema que tendran si o si la mayoria
		 * de instrumentos no limitandonos a dos intrusmentos como este caso por lo que una 
		 * clase abstracta no se puede dar valores o usar si se puede establece el cuerpo de 
		 * muchas otras clases similares entre si */
	}

}
