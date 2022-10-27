package curso.java.EjercicioHospital1;

import curso.java.funciones.Utils;

public class Hospital {
	
	private Pacientes[] salaEspera;
	private Enfermo[] enfermo;
	private Enfermero[] enfermero;
	private Doctor[] doctor;
	private Empleados[] empleados;
	private Consulta [] consulta;
	private boolean [] habitacion;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hospital hospital = new Hospital();
		//Creamos los empleados,pacientes y consultas
		hospital.crearEmpleados();
		hospital.crearPacientes();
		hospital.crearConsulta();
		//Empezamos la jornada laboral
		hospital.empezarJornada();
		//Metemos al enfermo en la habitacion vacia
		hospital.asignarHabitacion();
		
		//Terminamos la jornada laboral
		hospital.terminarJornada();
	}

	private void crearPacientes () {
		salaEspera = new Pacientes[4];
		salaEspera[0] = new Pacientes("Juan", "Ape1", "Ape2", "12345678A", Utils.tirarDado(10));
		salaEspera[1] = new Pacientes("Carlos", "Ape1", "Ape2", "12345678A", Utils.tirarDado(10));
		salaEspera[2] = new Pacientes("Alberto", "Ape1", "Ape2", "12345678A", Utils.tirarDado(10));
		salaEspera[3] = new Pacientes("Ramon", "Ape1", "Ape2", "12345678A", Utils.tirarDado(10));

		enfermo = new Enfermo[4];
		enfermo [0] = new Enfermo(null, null, null, null, 0);
		enfermo [1] = new Enfermo(null, null, null, null, 0);
		enfermo [2] = new Enfermo(null, null, null, null, 0);
		enfermo [3] = new Enfermo(null, null, null, null, 0);
	
	}
	
	private void crearConsulta () {
		consulta = new Consulta[4];
		consulta[0] = new Consulta(doctor[0], "A");
		consulta[1] = new Consulta(doctor[1], "B");
		
	}
	
	private void crearEmpleados () {
		
		enfermero = new Enfermero[2];
		enfermero[0] = new Enfermero("Carlota", "Ape1", "Ape2", "12345678A", "A");
		enfermero[1] = new Enfermero("Sergio", "Ape1", "Ape2", "12345678A", "B");
		
		doctor = new Doctor[2];
		doctor[0] = new Doctor("Jennifer", "Ape1", "Ape2", "12345678A", "Neurologo");
		doctor[1] = new Doctor("Borja", "Ape1", "Ape2", "12345678A", "Alergologo");
	}
	
	private void empezarJornada() {

		for(int i=0; i<doctor.length;i++) {
			System.out.println();
			doctor[i].ficharEntrar();
		}
		
		System.out.println("----------------------------------------------------");
		//Comprobamos si la consulta esta vacia y llamamos a la funcion de enfermero
		for(int i=0; i<salaEspera.length;i++) {
			if(consulta[0].getPacientes()==null) {
				enfermero[Utils.tirarDado(2)-1].atenderPaciente(salaEspera[i], consulta[0]);
				consulta[0].getDoctor().diagnosticar(consulta[0], enfermo[i]);
			}else if (consulta[1].getPacientes()==null) {
				enfermero[Utils.tirarDado(2)-1].atenderPaciente(salaEspera[i], consulta[1]);
				consulta[1].getDoctor().diagnosticar(consulta[1], enfermo[i]);
			}else {
				i=salaEspera.length;
			}
		}
		
	}
	
	private void terminarJornada() {
		System.out.println("----------------------------------------------------");
		for(int i=0; i<doctor.length;i++) {
			System.out.println();
			doctor[i].ficharSalir();
		}
		
	}
	
	private void asignarHabitacion() {
		habitacion = new boolean [3];
		habitacion[0]=false;
		habitacion[1]=false;
		habitacion[2]=false;
		System.out.println("\n ASIGNACION DE HABITACIONES");
		for(int i=0;i<enfermo.length;i++) {
			if(enfermo[i].getNombre()!=null) {
				for(int u=0;u<habitacion.length;u++) {
					if(!habitacion[u]) {
						habitacion[u]=true;
						enfermo[i].setHabitacion(u);
					}
				}
				
				System.out.println("El enfermo "+enfermo[i].getNombre()+" esta asignado a la habitacion "+enfermo[i].getHabitacion());
			}
		}
		
			
		
	}
	
}
