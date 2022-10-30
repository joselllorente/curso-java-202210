package curso.java.colecciones;

import java.util.HashSet;
import java.util.Set;

public class Conjuntos {

	public static void main(String[] args) {
		
		Set<String> colores = new HashSet<String>();
		
		String color = "Amarillo";
		boolean added =colores.add("Amarillo");
		System.out.println(added);
		
		colores.add("Azul");
		String color2 = new String("Amarillo"); 
		System.out.println(color.hashCode());
		added = colores.add(color2);
		System.out.println(added);
		colores.add("Rojo");
		colores.add("Blanco");
		
		for (String colorin : colores) {
			System.out.println(colorin);
		}
		colores.remove("Rojo");
		System.out.println("========================");
		for (String colorin : colores) {
			System.out.println(colorin);
		}
		
		colores.contains("Blanco");
		
//		Set<Boton> botones = new HashSet<Boton>();
//		Boton boton1 = new Boton("Rojo","Redondo");
//		Boton boton2 = new Boton("Rojo","Cuadrado");
//		
//		System.out.println(botones.add(boton1));
//		System.out.println(botones.add(boton2));
//		System.out.println(botones.size());
//		
//		for (Boton boton : botones) {
//			System.out.println(boton.getColor());
//		}
		
		
		
	}

}
