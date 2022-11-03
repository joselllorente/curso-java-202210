package curso.java.ejercicios.ficheros;

import java.io.FileNotFoundException;
import java.util.List;

import curso.java.ejercicios.ficheros.modelos.Alumno;
import curso.java.ejercicios.ficheros.servicios.LecturaFicheros;

public class Ejercicio1 {

	private static final String FICHERO1 = "./recursos/alumnos.txt";
	private static final String FICHERO2 = "./recursos/alumnos-colegio.txt";
	
	public static void main(String[] args) {
		
		LecturaFicheros lecturaFichero = new LecturaFicheros();
		try {
			
			List<Alumno> alumnos= lecturaFichero.leerArchivoEjercicio1(FICHERO1);
			System.out.println(alumnos.size());
			for (Alumno alumno : alumnos) {
				System.out.println(alumno);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}
