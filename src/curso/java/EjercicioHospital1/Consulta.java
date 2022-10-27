package curso.java.EjercicioHospital1;

public class Consulta {
	
	private Pacientes pacientes;
	private Doctor doctor;
	private String nombre;
	
	public Consulta(Pacientes pacientes, Doctor doctor, String nombre) {
		super();
		this.pacientes = pacientes;
		this.doctor = doctor;
		this.nombre = nombre;
	}
	
	
	public Consulta(Doctor doctor, String nombre) {
		super();
		this.doctor = doctor;
		this.nombre = nombre;
	}


	public Pacientes getPacientes() {
		return pacientes;
	}
	public void setPacientes(Pacientes pacientes) {
		this.pacientes = pacientes;
	}
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
		
}
