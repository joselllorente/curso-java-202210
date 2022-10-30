package curso.java.funciones;

import curso.java.ejercicios.poo.hospital.Consulta;

public class UtilsHospital {
	
	public static final String [] ENFERMEDADES = {"COVID", "INFARTO", "DERRAME"};

	public static Consulta consultaVacia (Consulta[] consultas) {
		for (Consulta consulta : consultas) {
			if (consulta.getPaciente()==null) {
				return consulta;
			}
		}
		//Si no ha encontrada nada devuelve null
		return null;
	}
}
