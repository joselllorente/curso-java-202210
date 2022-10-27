package curso.java.EjercicioHospital1;

public class Doctor extends Persona implements Empleados{

	public Doctor(String nombre, String apellido1, String apellido2, String dni) {
		super(nombre, apellido1, apellido2, dni);
		// TODO Auto-generated constructor stub
	}
	
	private String especialidad;
	
	
	public Doctor(String nombre, String apellido1, String apellido2, String dni, String especialidad) {
		super(nombre, apellido1, apellido2, dni);
		this.especialidad = especialidad;
	}


	public String getEspecialidad() {
		return especialidad;
	}


	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}


	@Override
	public void ficharEntrar() {
		// TODO Auto-generated method stub
		System.out.println("Ha entrado a trabajar el doctor "+this.getNombre()+" con la especialidad "+this.getEspecialidad());
	}
	
	@Override
	public void ficharSalir() {
		// TODO Auto-generated method stub
		System.out.println("Ha salido de trabajar el doctor "+this.getNombre()+" con la especialidad "+this.getEspecialidad());
	}
	
	public void diagnosticar(Consulta consulta, Enfermo enfermo) {
		if(consulta.getPacientes().getSintoma()>=7) {
			enfermo.setNombre(consulta.getPacientes().getNombre());
			enfermo.setApellido1(consulta.getPacientes().getApellido1());
			enfermo.setApellido2(consulta.getPacientes().getApellido2());
			enfermo.setDni(consulta.getPacientes().getDni());
			enfermo.setSintoma(consulta.getPacientes().getSintoma());
			enfermo.setEnfermedad("malo");
			
			System.out.println("El paciente "+enfermo.getNombre()+" esta enfermo con un "+enfermo.getSintoma()+" de gravedad "
					+ "y ha sido atendido por el especialista "+this.getNombre());
		}else {
			consulta.setPacientes(null);
		}
	}
}
