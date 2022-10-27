package curso.java.inicio;

public class Condicionales {

	public static void main(String[] args) {
		
		if (funcion1() | funcion2()) {
			System.out.println("Ambos valores son true");
		}
		System.out.println("Termina");
	}
	
	static boolean funcion1() {
		System.out.println("Funcion1");
		return true;
	}

	static boolean funcion2() {
		System.out.println("Funcion2");
		return true;
	}
}
