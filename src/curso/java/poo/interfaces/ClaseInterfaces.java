package curso.java.poo.interfaces;

import curso.java.ejercicios.poo.herencia.banda.Instrumento;

public abstract class ClaseInterfaces extends Instrumento implements ITransporte, ILogistica{

	public ClaseInterfaces(String nombre, String tipo, String marca, double precio) {
		super(nombre, tipo, marca, precio);
		limpiar();
	}

	@Override
	public void limpiar() {
		System.out.println();
		
	}

	@Override
	public void recoger() {
		System.out.println(NUM);
		
	}

	
	
	

}
