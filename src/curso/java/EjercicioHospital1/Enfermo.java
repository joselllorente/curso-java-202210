package curso.java.EjercicioHospital1;

public class Enfermo extends Pacientes{

	public Enfermo(String nombre, String apellido1, String apellido2, String dni, int sintoma) {
		super(nombre, apellido1, apellido2, dni, sintoma);
		// TODO Auto-generated constructor stub
	}
	
	String enfermedad;
	int habitacion;

	public int getHabitacion() {
		return habitacion;
	}

	public void setHabitacion(int habitacion) {
		this.habitacion = habitacion;
	}

	public String getEnfermedad() {
		return enfermedad;
	}

	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}
	
}
