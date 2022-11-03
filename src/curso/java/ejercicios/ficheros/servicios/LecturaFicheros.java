package curso.java.ejercicios.ficheros.servicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import curso.java.ejercicios.ficheros.interfaces.IFicheros;
import curso.java.ejercicios.ficheros.modelos.Alumno;

public class LecturaFicheros {

	public List<Alumno> leerArchivoEjercicio1(String nombre) throws FileNotFoundException{
        StringBuilder sb = new StringBuilder();
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
        	String nombreAlumno=datos[IFicheros.POSICION_NOMBRE];
        	String apellidoAlumno=datos[IFicheros.POSICION_APELLIDOS];
        	String dniAlumno=datos[IFicheros.POSICION_DNI];
        	String asignaturasAlumno = datos[IFicheros.POSICION_ASIGNATURAS];
        	
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
	
}
