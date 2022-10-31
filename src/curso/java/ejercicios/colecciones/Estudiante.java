package curso.java.ejercicios.colecciones;

import java.util.Set;

public class Estudiante {
	private String nombre;
	private String apellidos;
	private String dni;
	private Set<Asignatura> asignaturas;
	
	public Estudiante(String nombre, String apellidos, String dni, Set<Asignatura> asignaturas) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.asignaturas = asignaturas;
	}
	
	public Estudiante(String nombre, String apellidos, String dni) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Set<Asignatura> getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(Set<Asignatura> asignaturas) {
		this.asignaturas = asignaturas;
	}
	
	public void addAsignatura(Asignatura asignatura) {
		this.asignaturas.add(asignatura);
	}

	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni +"]";
	}
	
	
	
}
