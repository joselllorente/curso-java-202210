package curso.java.colecciones;

import java.util.ArrayList;
import java.util.List;

public class ListasJava {

	public static void main(String[] args) {
		
		List<String> lista1 = new ArrayList<String>();
		
		lista1.add("Hola");
		lista1.add("Hola");
//		lista1.add(1);
//		lista1.add(new Boton("",""));
		lista1.add("qué");
		lista1.add("tal?"); 
		lista1.add(1, "hoy es viernes por fin!!!");
		
		System.out.println(lista1.size());
		System.out.println(lista1.isEmpty());
		System.out.println(lista1.contains("Adios"));
		System.out.println(lista1.get(0));
		
		lista1.set(0, "Hey!");
		
		for (String texto : lista1) {
			System.out.println(texto);
		}
		
		lista1.remove(0);
		lista1.remove("Hola");
	}

}
