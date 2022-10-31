package curso.java.ejercicios.poo.hospital;

import curso.java.funciones.UtilsHospital;

public class Hospital {

	private String nombre;
	private Paciente[] salaEspera;
	private Enfermero[] enfermeros;
	private Enfermo[] habitaciones;
	private Consulta[] consultas;
	

	public Hospital(String nombre) {
		this.nombre = nombre;
		this.salaEspera = new Paciente[4];
		this.enfermeros = new Enfermero[2];
		this.habitaciones = new Enfermo[3];
		this.consultas = new Consulta[2];
	}

	public static void main(String[] args) {
		Hospital hospital = new Hospital("Hospital Central");
		hospital.iniciaHospital();
		
	}
	
	/**
	 * Se crean los objetos de los empleados del hospital
	 * @return
	 */
	private EmpleadoHospital[] crearEmpleados () {
		Doctor doctor1 = new Doctor("Doctor1", "Apellidos1", "1111A", "General");
		Doctor doctor2 = new Doctor("Doctor2", "Apellidos2", "2222B", "General");
		
		//Creo las consultas con los doctores
		Consulta consulta1 = new Consulta(1, doctor1);
		Consulta consulta2 = new Consulta(2, doctor2);
		consultas[0] = consulta1;
		consultas[1] = consulta2;
		
		//Creo los enfermeros
		Enfermero enfermero1 = new Enfermero("Enfermero1","Apellidos","3333C","Recepción");
		Enfermero enfermero2 = new Enfermero("Enfermero2","Apellidos","4444C","Recepción");
		
		enfermeros[0]= enfermero1;
		enfermeros[1]= enfermero2;
		
		//Ponemos a fichar a todos los empleados
		EmpleadoHospital[] empleados = {doctor1,doctor2,enfermero1,enfermero2};
		
		return empleados;
	}
	
	private void iniciaHospital() {
		//Creamos los empleados del Hospital
		EmpleadoHospital[] empleados = crearEmpleados();
		
		//Fichamos la entrada de todos los empleados
		ficharEntrada(empleados);
		
		//Entran los pacientes
		entradaPacientes();
		
		//Se empieza a tratarles
		boolean hayPacientes = true;
		do {
			//Los enfermeros atienden a los pacientes, y los llevan a la consulta
			hayPacientes = atenderPacientes();
			//Los doctores en las consultas tratan a los pacientes
			tratarPacientes();
		
		}while (hayPacientes);
		
		//Los empleados se van
		ficharSalida(empleados);
	} 
	
	/**
	 * Creamos objetos de tipo Paciente y los asignamos a la sala de espera
	 */
	private void entradaPacientes() {
		salaEspera[0]= new Paciente("Paciente1","Apellido","5555D","Fiebre Alta");
		salaEspera[1]= new Paciente("Paciente2","Apellido","6666E","Mucha Tos");
		salaEspera[2]= new Paciente("Paciente3","Apellido","7777F","Mareos");
		salaEspera[3]= new Paciente("Paciente4","Apellido","8888G","Fiebre Alta");
	}
	
	/**
	 * Los enfermeros atienden a los pacientes y los llevan a la sala de espera
	 * @return si quedan pacientes en la sala de espera
	 */
	private boolean atenderPacientes() {
		boolean hayPacientes = true;
		
		//Cada enfermero recoge un paciente de la sala de espera
		for (Enfermero enfermero : enfermeros) {
			//Recorreo los pacientes de la sala de espera
			for (int i = 0; i < salaEspera.length; i++) {
				Paciente paciente = salaEspera[i];
				if (paciente!=null) {
					//El enfermero atiende al paciente
					enfermero.atenderPaciente(paciente,UtilsHospital.consultaVacia(consultas));
					//Vacio su hueco en la sala de espera
					salaEspera[i]=null;
					//Si es el último paciente atendido indico que ya no hay más pacientes
					if((i+1)==salaEspera.length) {
						hayPacientes = false;
					}
					break;
				}
				
			}
			
		}
		
		return hayPacientes;
		
	}
	
	/**
	 * Se trata a los pacientes de las consultas
	 */
	private void tratarPacientes() {
		for (Consulta consulta : consultas) {
			Paciente paciente = consulta.getPaciente(); 
			if (paciente!=null) {
				Doctor doctor = consulta.getDoctor();
				String enfermedad = doctor.tratarPaciente(paciente);
				//Si esta enfermo
				if (!enfermedad.equals("")) {
					System.out.println("El paciente tiene " + enfermedad );
					boolean hayHabitacion = hospitalizarPaciente(paciente, enfermedad);
					if(!hayHabitacion) {
						System.out.println("El paciente se deriva a otro Hospital, no hay habitaciones disponibles");
					}else {
						System.out.println("Hospitalizado!");
					}
				}else {
					System.out.println("El paciente no está grave se va a su casa");
				}
			}
			//Liberamos la consulta
			consulta.setPaciente(null);
		}
	}
	
	private boolean hospitalizarPaciente(Paciente paciente, String enfermedad) {
		boolean habitacionDisponible=false;
		//Miro si hay habitación disponible
		for (int i=0;i<habitaciones.length;i++) {
			//Si está la habitación vacia creo al enfermo 
			if (habitaciones[i]==null) {
				Enfermo enfermo = new Enfermo(paciente.getNombre(),paciente.getApellidos(), paciente.getDni(), enfermedad);
				habitaciones[i]=enfermo;
				System.out.println("Asignada la habitación "+(i+1) +" al enfermo " + enfermo.getNombre() );
				habitacionDisponible=true;
				break;
			}
		}
		
		return habitacionDisponible;
	}
	
	private void ficharEntrada (IEmpleadoHospital empleado) {
		empleado.ficharEntrada();
	}
	
	private void ficharEntrada (IEmpleadoHospital[] empleados) {
		for (IEmpleadoHospital empleado : empleados) {
			ficharEntrada(empleado);
		}
	}
	
	private void ficharSalida (IEmpleadoHospital[] empleados) {
		for (IEmpleadoHospital empleado : empleados) {
			ficharSalida(empleado);
		}
	}
	
	private void ficharSalida (IEmpleadoHospital empleado) {
		empleado.ficharSalida();
	}
}

