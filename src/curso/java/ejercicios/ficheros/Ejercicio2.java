package curso.java.ejercicios.ficheros;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import curso.java.ejercicios.ficheros.modelos.Alumno;
import curso.java.ejercicios.ficheros.servicios.LecturaFicheros;

public class Ejercicio2 {

	private static final String FICHERO2 = "./recursos/alumnos-colegio.txt";
	
	public static void main(String[] args) {
		
		LecturaFicheros lecturaFichero = new LecturaFicheros();
		try {
			
			Map<String,List<Alumno>> mapa = lecturaFichero.leerArchivoEjercicio2(FICHERO2);
			Set<Entry<String,List<Alumno>>> entryMapa = mapa.entrySet();
			
			int maximoAlumnos=0;
			String colegioMasAlumnos= "";
			
			for (Entry<String, List<Alumno>> entry : entryMapa) {
				String colegio = entry.getKey();
				System.out.println("Colegio: "+ colegio);
				List<Alumno> alumnos = entry.getValue();
				int numAlumnos = alumnos.size();
				
				if (numAlumnos>maximoAlumnos) {
					maximoAlumnos= numAlumnos;
					colegioMasAlumnos=colegio;
				}
				
				//Recorremos los alumnos					
				//for(Alumno alumno: alumnos) {
					//System.out.println("\t"+alumno);
				//}
			}
			System.out.println("EL colegio con mas alumnos es "+ colegioMasAlumnos + " con "+ maximoAlumnos);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
