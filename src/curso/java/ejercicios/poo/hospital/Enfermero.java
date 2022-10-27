package curso.java.ejercicios.poo.hospital;

import curso.java.funciones.UtilsHospital;

public class Enfermero extends Persona implements IEmpleadoHospital {
	private String seccion;
	
	public Enfermero(String nombre, String apellidos, String dni, String seccion) {
		super(nombre, apellidos, dni);
		this.seccion = seccion;
	}

	
	public String getSeccion() {
		return seccion;
	}


	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}


	public void atenderPaciente(Paciente paciente, Consulta consulta) {
		System.out.println("Enferemero "+ this.getNombre() +"atendiendo al paciente "+ paciente.getNombre());
		consulta.setPaciente(paciente);
		
	}
	
	@Override
	public void ficharEntrada() {
		System.out.println("El enfermero "+getNombre() + " esta fichando la hora de entrada");

	}

	@Override
	public void ficharSalida() {
		System.out.println("El enfermero "+getNombre() + " esta fichando la hora de salida");

	}

}
