package curso.java.ejercicios.poo.herencia.banda;

public abstract class InstrumentoCuerda extends Instrumento {

	public InstrumentoCuerda(String nombre, String tipo, String marca, double precio) {
		super(nombre, tipo, marca, precio);
		// TODO Auto-generated constructor stub
	}

	public InstrumentoCuerda(String nombre, String tipo, String marca) {
		super(nombre, tipo, marca);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void limpiar() {
		System.out.println("Limpiando Instrumento de cuerda");
	}

}
