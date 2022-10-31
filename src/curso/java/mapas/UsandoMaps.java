package curso.java.mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import curso.java.ejercicios.colecciones.Estudiante;

public class UsandoMaps {

	public static void main(String[] args) {
		
		Map<String, Estudiante> mapa1 = new HashMap<String,Estudiante>();
		
		Estudiante estudiante1 = new Estudiante("Nombre1","Apellido1","11111A");
		Estudiante estudiante2 = new Estudiante("Nombre2","Apellido2","22222B");
		mapa1.put(estudiante1.getDni(), estudiante1);
		Estudiante e = mapa1.put(estudiante1.getDni(), estudiante2);
		
		System.out.println(e.getNombre());
		
		Estudiante estudiante = mapa1.get("11111A");
		System.out.println(mapa1.get("11111A").getNombre());
		
//		if (mapa1.containsKey("11111A")) {
//			
//		}
//		
		for (String clave : mapa1.keySet()) {
			System.out.println(clave);
			System.out.println((mapa1.get(clave).getNombre()));
		}
		
		for (Estudiante estu : mapa1.values()) {
			System.out.println(estu.getNombre());
		}
		
		Set<Entry<String, Estudiante>> entrySet = mapa1.entrySet();
		for (Entry<String, Estudiante> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue().getNombre());
		}
		
		Map<Estudiante, Integer> edadEstudiantes = new HashMap<Estudiante,Integer>();
		edadEstudiantes.put(estudiante1, 1);
		
		//Diferencia con List
//		List<Estudiante> estudiantes = new ArrayList<Estudiante>();
//		estudiantes.add(estudiante2);
//		estudiantes.add(estudiante1);
//		String dni = "111111A";
//		for (Estudiante estudiante : estudiantes) {
//			if (estudiante.getDni().equals(dni)) {
//				System.out.println(estudiante.getNombre());
//				break;
//			}
//		}

	}
	

}
