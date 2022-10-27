package curso.java.EjercicioHospital1;

public class Enfermero extends Persona implements Empleados{

	public Enfermero(String nombre, String apellido1, String apellido2, String dni) {
		super(nombre, apellido1, apellido2, dni);
		// TODO Auto-generated constructor stub
	}

	private String seccion;

	public Enfermero(String nombre, String apellido1, String apellido2, String dni, String seccion) {
		super(nombre, apellido1, apellido2, dni);
		this.seccion = seccion;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	@Override
	public void ficharEntrar() {
		// TODO Auto-generated method stub
		System.out.println("Ha entrado a trabajar el enfermero "+this.getNombre()+" de la seccion "+this.getSeccion());
	}

	@Override
	public void ficharSalir() {
		// TODO Auto-generated method stub
		System.out.println("Ha salido de trabajar el enfermero "+this.getNombre()+" de la seccion "+this.getSeccion());
	}
	
	/**
	 * Funcion para asignar a una consulta ya creada un paciente
	 * @param paciente
	 * @param consulta
	 */
	
	public void atenderPaciente(Pacientes paciente, Consulta  consulta) {
		System.out.println("\nEl paciente "+paciente.getNombre()+" con dni "+paciente.getDni()+" se encuentra malo en una escala de "+paciente.getSintoma());
		consulta.setPacientes(paciente);
	}
}
