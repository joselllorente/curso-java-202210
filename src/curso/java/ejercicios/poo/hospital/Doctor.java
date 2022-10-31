package curso.java.ejercicios.poo.hospital;

import curso.java.funciones.Utils;
import curso.java.funciones.UtilsHospital;

public class Doctor extends EmpleadoHospital {
	private String especialidad;
		
	public Doctor(String nombre, String apellidos, String dni, String especialidad) {
		super(nombre, apellidos, dni);
		this.especialidad = especialidad;
	}

	public String getEspecialidad() {
		return especialidad;
	}


	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}


	@Override
	public void ficharEntrada() {
		System.out.println("El doctor "+getNombre() + " esta fichando la hora de entrada");

	}

	@Override
	public void ficharSalida() {
		System.out.println("El doctor "+getNombre() + " esta fichando la hora de salida");

	}
 
	public String tratarPaciente(Paciente paciente) {
		String enfermedad = "";
		System.out.println("El doctor "+this.getNombre() + " está tratando al paciente "+paciente.getNombre() +" que tiene " + paciente.getSintoma() );
		//Si el resultado generado aleatoriamente es mayor de 8 el paciente necesita ser hospitalizado
		if(Utils.tirarDado(10)>1) {
			enfermedad = UtilsHospital.ENFERMEDADES[Utils.tirarDado(3)-1];
		}
		
		return enfermedad;
	}
	
}
