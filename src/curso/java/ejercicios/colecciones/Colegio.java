package curso.java.ejercicios.colecciones;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class Colegio {
	
	private List<Estudiante> estudiantes;

	public Colegio() {
		super();
		this.estudiantes = new CopyOnWriteArrayList<Estudiante>();
	}
	
	public static void main(String[] args) {
		Colegio colegio = new Colegio();
		colegio.inciaColegio();
		
	}
	
	private void inciaColegio() {
		crearEstudiantes();
		mostrarDatosEstudiantes();
		
		//Para añadir objetos de manera individual en vez de en el set
		Asignatura asignatura4Alumno3 = new Asignatura ("Historia", 6);
		Estudiante estudiante3 = estudiantes.get(2);
		estudiante3.addAsignatura(asignatura4Alumno3);
//		Set<Asignatura> asignaturasEstudiante3 = estudiante3.getAsignaturas();
//		asignaturasEstudiante3.add(asignatura4Alumno3);
		
		mostrarDatosEstudiantes();
		
		mostrarDatosEstudiantesMatematicas();
		mostrarDatosEstudiantesAprobados();
		eliminaSuspensosLengua();
		mostrarDatosEstudiantes();
		
		
		
	}
	
	private void mostrarDatosEstudiantes() {
		for (Estudiante estudiante : estudiantes) {
			System.out.println(estudiante);
			for (Asignatura asignatura : estudiante.getAsignaturas()) {
				System.out.println(asignatura);
			}
		}
		
	}
	
	
	private void mostrarDatosEstudiantesMatematicas() {
		for (Estudiante estudiante : estudiantes) {
			boolean tieneMatematicas = false;
			for (Asignatura asignatura : estudiante.getAsignaturas()) {
				if(asignatura.getNombre().equals("Matematicas")) {
					tieneMatematicas = true;
				}
				
			}
			if (tieneMatematicas) {
				System.out.println(estudiante);
			}
		}
	}
	
	
	private void mostrarDatosEstudiantesAprobados() {
		for (Estudiante estudiante : estudiantes) {
			double sumanotas = 0;
			for (Asignatura asignatura : estudiante.getAsignaturas()) {
				sumanotas += asignatura.getNota();
			}
			
			if (sumanotas/estudiante.getAsignaturas().size() >= 5) {
				System.out.println("Alumno aprobado con "+(sumanotas/estudiante.getAsignaturas().size()));
				System.out.println(estudiante);
			}
		}
		
	}
	
	
	private void eliminaSuspensosLengua() {
		System.out.println("Eliminando alumnos");
		for (Estudiante estudiante : estudiantes) {
			System.out.println("Comprobando los datos para "+estudiante.getNombre());
			for (Asignatura asignatura : estudiante.getAsignaturas()) {
				if(asignatura.getNombre().equals("Lengua") && asignatura.getNota()<5 ) {
					estudiantes.remove(estudiante);
				}
			}
			System.out.println("Termina con "+estudiante.getNombre());
		}
		System.out.println("Finaliza eliminaSuspensosLengua");
	}
	
	private void crearEstudiantes() {
		//Alumno1
		Asignatura asignatura1Alumno1 = new Asignatura ("Lengua", 3);
		Asignatura asignatura2Alumno1 = new Asignatura ("Matematicas", 4);
		Asignatura asignatura3Alumno1 = new Asignatura ("Fisica", 10);
		
		Set <Asignatura> asignaturasAlumno1 = new HashSet <Asignatura>();
		asignaturasAlumno1.add(asignatura1Alumno1);
		asignaturasAlumno1.add(asignatura2Alumno1);
		asignaturasAlumno1.add(asignatura3Alumno1);
		
		Estudiante estudiante1 = new Estudiante("pepe", "brbrbr", "1111111A", asignaturasAlumno1);
		estudiantes.add(estudiante1);
		
		
		//Alumno2
		Asignatura asignatura1Alumno2 = new Asignatura ("Lengua", 3);
		Asignatura asignatura2Alumno2 = new Asignatura ("Matematicas", 8);
		Asignatura asignatura3Alumno2 = new Asignatura ("Fisica", 6);
		
		Set <Asignatura> asignaturasAlumno2 = new HashSet <Asignatura>();
		asignaturasAlumno2.add(asignatura1Alumno2);
		asignaturasAlumno2.add(asignatura2Alumno2);
		asignaturasAlumno2.add(asignatura3Alumno2);
		
		Estudiante estudiante2 = new Estudiante("Ramon", "Apellidos", "2222222B", asignaturasAlumno2);
		estudiantes.add(estudiante2);
		
		//Alumno3
		Asignatura asignatura1Alumno3 = new Asignatura ("Lengua", 2);
		Asignatura asignatura2Alumno3 = new Asignatura ("Matematicas", 8);
		Asignatura asignatura3Alumno3 = new Asignatura ("Fisica", 6);
		
		Set <Asignatura> asignaturasAlumno3 = new HashSet <Asignatura>();
		asignaturasAlumno3.add(asignatura1Alumno3);
		asignaturasAlumno3.add(asignatura2Alumno3);
		asignaturasAlumno3.add(asignatura3Alumno3);
		
		Estudiante estudiante3 = new Estudiante("Maria", "Apellidos", "33333C", asignaturasAlumno3);
		estudiantes.add(estudiante3);
		
		
		
		
		
		
	}

}
