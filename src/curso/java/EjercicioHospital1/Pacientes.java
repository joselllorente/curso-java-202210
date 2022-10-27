package curso.java.EjercicioHospital1;

public class Pacientes extends Persona{

	public Pacientes(String nombre, String apellido1, String apellido2, String dni) {
		super(nombre, apellido1, apellido2, dni);
		// TODO Auto-generated constructor stub
	}
	
	private int sintoma;

	public Pacientes(String nombre, String apellido1, String apellido2, String dni, int sintoma) {
		super(nombre, apellido1, apellido2, dni);
		this.sintoma = sintoma;
	}

	public int getSintoma() {
		return sintoma;
	}

	public void setSintoma(int sintoma) {
		this.sintoma = sintoma;
	}
	
}
