package capitulo9.comparator;

import java.util.Comparator;

public class Estudiante {
	
    private String nombre;
    private int numMatricula;
    private int edad;

    public Estudiante(int numMatricula, String nombre, int edad) {
        this.numMatricula = numMatricula;
        this.nombre = nombre;
        this.edad = edad;
    }

    
    public String getNombre() {
        return nombre;
   }
   public void setNombre(String nombre) {
	this.nombre = nombre;
   }
   public int getNumMatricula() {
	return numMatricula;
   }
   public void setNumMatricula(int numMatricula) {
	this.numMatricula = numMatricula;
   }
   public int getEdad() {
	return edad;
   }
   public void setEdad(int edad) {
	this.edad = edad;
   }	
    
    @Override
    public String toString() {
        return "[ numMatricula=" + numMatricula + ", name=" + nombre + ", age=" + edad + "]";
    }
   
}