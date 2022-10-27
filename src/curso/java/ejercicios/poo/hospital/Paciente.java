package curso.java.ejercicios.poo.hospital;

public class Paciente extends Persona {
	private String sintoma;

	public Paciente(String nombre, String apellidos, String dni, String sintoma) {
		super(nombre, apellidos, dni);
		this.sintoma = sintoma;
	}

	public String getSintoma() {
		return sintoma;
	}

	public void setSintoma(String sintoma) {
		this.sintoma = sintoma;
	}

	@Override
	public String toString() {
		return "Paciente [sintoma=" + sintoma + ", " + super.toString() + "]";
	}
	
	
	
	
}
