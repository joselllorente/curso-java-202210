package curso.java.ejercicios.ficheros.servicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import curso.java.ejercicios.ficheros.interfaces.IFicheros;
import curso.java.ejercicios.ficheros.modelos.Alumno;

public class LecturaFicheros {

	public List<Alumno> leerArchivoEjercicio1(String nombre) throws FileNotFoundException{
        File archivo = new File(nombre);
        Scanner scan = new Scanner(archivo);
        scan.useDelimiter("\n");

        //Creo la lista donde almacenaré los alumnos
        List<Alumno> listadoAlumnos = new ArrayList<Alumno>();
        while (scan.hasNext()){
        	
        	//sb.append(scan.next()).append("\n");
        	String linea = scan.next();
        	String[] datos = linea.strip().split("\\|");
        	
        	//Creacion de objetos
        	//Recogemos información
        	String nombreAlumno=datos[IFicheros.EJERCICIO1_POSICION_NOMBRE];
        	String apellidoAlumno=datos[IFicheros.EJERCICIO1_POSICION_APELLIDOS];
        	String dniAlumno=datos[IFicheros.EJERCICIO1_POSICION_DNI];
        	String asignaturasAlumno = datos[IFicheros.EJERCICIO1_POSICION_ASIGNATURAS];
        	
        	String [] asignaturas = asignaturasAlumno.split(";");
        	
        	Set<String> setAsignaturasAlumno = new HashSet<String>();
        	for (String asignatura : asignaturas) {
        		setAsignaturasAlumno.add(asignatura);
			}
        	
        	//Por cada línea genero un objeto
        	Alumno alumno = new Alumno(nombreAlumno,apellidoAlumno,dniAlumno,setAsignaturasAlumno);
            
            //Cada objeto lo meto en una lista
        	listadoAlumnos.add(alumno);
        }

        return listadoAlumnos;
    }
	
	public Map<String,List<Alumno>> leerArchivoEjercicio2(String nombre) throws FileNotFoundException{
        File archivo = new File(nombre);
        Scanner scan = new Scanner(archivo);
        scan.useDelimiter("\n");

        //Creo el mapa donde almacenaré el nombre del colegio con los alumnos
        Map<String,List<Alumno>> mapaColegioAlumnos = new HashMap<String,List<Alumno>>();
        while (scan.hasNext()){
        	String linea = scan.next();
        	String[] datos = linea.strip().split("\\|");
        	
        	//Creacion de objetos
        	//Recogemos información
        	String colegio = datos[IFicheros.EJERCICIO2_POSICION_COLEGIO];
        	String nombreAlumno=datos[IFicheros.EJERCICIO2_POSICION_NOMBRE];
        	String apellidoAlumno=datos[IFicheros.EJERCICIO2_POSICION_APELLIDOS];
        	String dniAlumno=datos[IFicheros.EJERCICIO2_POSICION_DNI];
        	String asignaturasAlumno = datos[IFicheros.EJERCICIO2_POSICION_ASIGNATURAS];
        	
        	String [] asignaturas = asignaturasAlumno.split(";");
        	
        	Set<String> setAsignaturasAlumno = new HashSet<String>();
        	for (String asignatura : asignaturas) {
        		setAsignaturasAlumno.add(asignatura);
			}
        	
        	//Por cada línea genero un objeto
        	Alumno alumno = new Alumno(nombreAlumno,apellidoAlumno,dniAlumno,setAsignaturasAlumno);
            
            //Miramos si el colegio esta en el mapa
        	if (mapaColegioAlumnos.containsKey(colegio)) {
        		List<Alumno> listaAlumnos = mapaColegioAlumnos.get(colegio);
        		listaAlumnos.add(alumno);
        		
        	}else {//El colegio no está en el mapa, se añade nuevo
        		List<Alumno> listaAlumnos = new ArrayList<Alumno>();
        		listaAlumnos .add(alumno);
        		mapaColegioAlumnos.put(colegio, listaAlumnos);
        		//mapaColegioAlumnos.put(colegio, Arrays.asList(alumno));
        	}
        }

        //Ejecución Varargs
        //test("Azul","Rojo","Blanco","verde");
		
		return mapaColegioAlumnos;
	}
	
	//VARARGS
	private void test (String ...colores ) {
		for (String color : colores) {
			System.out.println(color);
		}
	}
	
	
	
	
}
