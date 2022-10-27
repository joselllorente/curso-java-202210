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
		hospital.entradaPacientes();
		
	}
	
	private void iniciaHospital() {
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
		IEmpleadoHospital[] empleados = {doctor1,doctor2,enfermero1,enfermero2};
		for (IEmpleadoHospital empleado : empleados) {
			ficharEntrada(empleado);
		}
		
	}
	
	private void entradaPacientes() {
		salaEspera[0]= new Paciente("Paciente1","Apellido","5555D","Fiebre Alta");
		salaEspera[1]= new Paciente("Paciente2","Apellido","6666E","Fiebre Alta");
		salaEspera[2]= new Paciente("Paciente3","Apellido","7777F","Fiebre Alta");
		salaEspera[3]= new Paciente("Paciente4","Apellido","8888G","Fiebre Alta");
	}
	
	private void atenderPacientes() {
		boolean hayPacientes = true;
		while (hayPacientes) {
			//Cada enfermero recoge un paciente de la sala de espera
			for (Enfermero enfermero : enfermeros) {
				//Recorreo los pacientes de la sala de espera
				for (int i = 0; i < salaEspera.length; i++) {
					Paciente paciente = salaEspera[i];
					if (paciente!=null) {
						enfermero.atenderPaciente(paciente,UtilsHospital.consultaVacia(consultas));						
					}
				}
				
			}
		}
	}
	
	
	
	private void ficharEntrada (IEmpleadoHospital empleado) {
		empleado.ficharEntrada();
	}
	
	private void ficharSalida (IEmpleadoHospital empleado) {
		empleado.ficharEntrada();
	}
}

