package curso.java.funciones;

import java.util.Scanner;

public class Utils {
	
	/**
	 * Funcion para solicitar un valor por consola
	 * @param texto
	 * @return
	 */
	public static String pideValor(String texto) {
		String reply ="";
		
		System.out.println(texto);
		Scanner scan = new Scanner(System.in);
		reply = scan.nextLine();
		
		return reply;
	}

	/**
	 * Función que pide un valor con el texto por defecto Introduce una opción"
	 * @return String con el valor introducido
	 */
	public static String pideValor() {
		return pideValor("Introduce una opción");
	}
	
	/**
	 * Función para pintar el menú que se le pasa
	 * @param menu (menu a pintar)
	 */
	public static void pintaMenu(String menu) {
		System.out.println(menu);
	}
	
	
	/**
	 * Función para pintar el menú por defecto
	 */
	public static void pintaMenu() {
		pintaMenu("1. Pintar cuadrado\n2. Validar email\n3. Serie Fibonacci\n4. Insertar Nombres\n5. Salir");
	}
	
	/**
	 * Función para pintar el menú a partir de los elementos de un array
	 * @param menu Array con las distintas opciones del menu
	 */
	public static void pintaMenu(String [] menu) {
		for (String opcion : menu) {
			pintaMenu(opcion);
		}
	}
	
	/**
	 * Funcion que simula la tirada de un dado
	 * @param numCaras. Número de caras del dado
	 * @return numero obtenido en la tirada
	 */
	public static int tirarDado (int numCaras) {
    	double random = Math.random();
    	int tirada = (int)Math.ceil((numCaras * random));
    	//System.out.println(tirada);
    	return tirada;
    }
	
}
