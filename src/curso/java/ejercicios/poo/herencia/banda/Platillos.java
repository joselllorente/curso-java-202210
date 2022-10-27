package curso.java.ejercicios.poo.herencia.banda;

public class Platillos extends Instrumento {

	public Platillos(String nombre, String tipo, String marca, double precio) {
		super(nombre, tipo, marca, precio);
		// TODO Auto-generated constructor stub
	}

	public Platillos(String nombre, String tipo, String marca) {
		super(nombre, tipo, marca);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void guardar() {
		System.out.println("INSERT INTO TABLE TB_PLATILLOS");

	}

	@Override
	protected void limpiar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void recoger() {
		// TODO Auto-generated method stub

	}

}
