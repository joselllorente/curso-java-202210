package curso.java.ejercicios.poo.hipodromo;

public class Apuesta {
	private double cantidad;
	private int dorsal;
	
	public Apuesta(double cantidad, int dorsal) {
		super();
		this.cantidad = cantidad;
		this.dorsal = dorsal;
	}
	
	public double getCantidad() {
		return cantidad;
	}
	public int getDorsal() {
		return dorsal;
	}
	
}
