package curso.java.ejercicios.mapas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import curso.java.funciones.Utils;

public class MainColegio {

	public static void main(String[] args) {
		
		MainColegio main = new MainColegio();
		Map<Colegio,List<Alumno>> colegios = main.crearColegio();
		main.mostrarDatosAlumnos(colegios);
		System.out.println("====================================");
		//Busqueda por dni usando el mapa inicial, menos rendimiento hay que rerrorer todos los objetos
		main.buscarAlumno(colegios,Utils.pideValor("Introduce Dni del alumno a buscar"));
		
		//Busqueda por dni alternativa para que tenga un mayor rendimiento
		Map<String,Alumno> alumnos = main.crearColegio2();
		main.buscarAlumno2(alumnos,Utils.pideValor("Introduce Dni del alumno a buscar"));
	}
	
	
	private void buscarAlumno2(Map<String,Alumno> alumnos, String dni) {
		Alumno alumno = alumnos.get(dni);
		System.out.println(alumno);
		System.out.println(alumno.getColegio());
	}
	
	private void buscarAlumno(Map<Colegio,List<Alumno>> colegios, String dni) {
		for (Colegio cole : colegios.keySet()) {
			List<Alumno> alumnos = colegios.get(cole);
			for (Alumno alumno : alumnos) {
				if(alumno.getDni().equals(dni)) {
					System.out.println(cole);
					System.out.println(alumno);
				}
			}
		}
	}
	
	
	private void mostrarDatosAlumnos(Map<Colegio,List<Alumno>> colegios) {
		
		//Primero por clave y a partir de la clave obtenemos su valor
		for (Colegio cole : colegios.keySet()) {
			System.out.println(cole);
			List<Alumno> alumnos = colegios.get(cole);
			for (Alumno alumno : alumnos) {
				System.out.println(alumno);
			}
		}
		
		System.out.println("====================================");
		
		//Acceder directamente a la clave y al valor
		Set<Entry<Colegio, List<Alumno>>> colegiosEntry = colegios.entrySet();
		for( Entry<Colegio, List<Alumno>> colegioEntry  :  colegiosEntry) {
			Colegio cole = colegioEntry.getKey();
			System.out.println(cole);
			List<Alumno> alumnos = colegioEntry.getValue();
			for (Alumno alumno : alumnos) {
				System.out.println(alumno);
			}
		}
		
		
		
		
		
	}
	
	
	private Map<Colegio,List<Alumno>> crearColegio() {
		
		Colegio colegio1 = new Colegio("Colegio1","Dir1");
		Colegio colegio2 = new Colegio("Colegio2","Dir2");
		
		Alumno alumno1 = new Alumno("Nombre1","Apellido1","1111A");
		Alumno alumno2 = new Alumno("Nombre2","Apellido2","2222B");
		Alumno alumno3 = new Alumno("Nombre3","Apellido3","3333C");
		List<Alumno> alumnosCole1 = new ArrayList<>();
		alumnosCole1.add(alumno3);
		alumnosCole1.add(alumno1);
		alumnosCole1.add(alumno2);
		
		Alumno alumno4 = new Alumno("Nombre4","Apellido1","4444D");
		Alumno alumno5 = new Alumno("Nombre5","Apellido2","5555E");
		Alumno alumno6 = new Alumno("Nombre6","Apellido3","6666F");
		List<Alumno> alumnosCole2 = new ArrayList<>();
		alumnosCole2.add(alumno4);
		alumnosCole2.add(alumno5);
		alumnosCole2.add(alumno6);
		
		Map<Colegio,List<Alumno>> colegios = new HashMap<Colegio,List<Alumno>>(); 
		colegios.put(colegio2, alumnosCole2);
		colegios.put(colegio1, alumnosCole1);
		
		
		return colegios;
	}
	
	
	
	private Map<String,Alumno> crearColegio2() {
		
		Colegio colegio1 = new Colegio("Colegio1","Dir1");
		Colegio colegio2 = new Colegio("Colegio2","Dir2");
		
		Alumno alumno1 = new Alumno("Nombre1","Apellido1","1111A");
		alumno1.setColegio(colegio1);
		Alumno alumno2 = new Alumno("Nombre2","Apellido2","2222B");
		alumno2.setColegio(colegio1);
		Alumno alumno3 = new Alumno("Nombre3","Apellido3","3333C");
		alumno3.setColegio(colegio1);
		
		Alumno alumno4 = new Alumno("Nombre4","Apellido1","4444D");
		alumno4.setColegio(colegio2);
		Alumno alumno5 = new Alumno("Nombre5","Apellido2","5555E");
		alumno5.setColegio(colegio2);
		Alumno alumno6 = new Alumno("Nombre6","Apellido3","6666F");
		alumno6.setColegio(colegio2);
		
		Map<String, Alumno> alumnos = new HashMap<String, Alumno>(); 
		alumnos.put(alumno1.getDni(),alumno1);
		alumnos.put(alumno2.getDni(),alumno2);
		alumnos.put(alumno3.getDni(),alumno3);
		alumnos.put(alumno4.getDni(),alumno4);
		alumnos.put(alumno5.getDni(),alumno5);
		alumnos.put(alumno6.getDni(),alumno6);
		
		
		return alumnos;
	}

}

