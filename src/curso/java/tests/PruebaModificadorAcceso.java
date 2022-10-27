package curso.java.tests;

import curso.java.poo.ClaseA;

public class PruebaModificadorAcceso extends ClaseA {

	
	public PruebaModificadorAcceso(int numero1, int numero2, String nombre) {
		super(numero1, numero2, nombre);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ClaseA ca = new ClaseA("Nombre");
		ca.getNombre();
		

	}
	
	void funcion2 () {
		//funcion1();
	}

}
