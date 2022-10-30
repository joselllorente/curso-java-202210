package curso.java.ejercicios.poo.hospital;

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
 
	
}
