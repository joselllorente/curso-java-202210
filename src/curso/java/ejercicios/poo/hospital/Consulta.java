package curso.java.ejercicios.poo.hospital;

public class Consulta {
	private int numConsulta;
	private Doctor doctor;
	private Paciente paciente;
	
	public Consulta(int numConsulta, Doctor doctor) {
		super();
		this.numConsulta = numConsulta;
		this.doctor = doctor;
	}

	public int getNumConsulta() {
		return numConsulta;
	}

	public void setNumConsulta(int numConsulta) {
		this.numConsulta = numConsulta;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	
	
	
}
