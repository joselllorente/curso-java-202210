package curso.java.ejercicios.poo.hospital;

public class Enfermo extends Persona {
	private String enfermedad;

	public Enfermo(String nombre, String apellidos, String dni, String enfermedad) {
		super(nombre, apellidos, dni);
		this.enfermedad = enfermedad;
	}

	public String getEnfermedad() {
		return enfermedad;
	}

	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}

	@Override
	public String toString() {
		return "Enfermo [enfermedad=" + enfermedad + ", " + super.toString() + "]";
	}
	
	
	
	
}
