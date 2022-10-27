package curso.java.ejercicios.poo.herencia.banda;

public class Bandurria extends InstrumentoCuerda {

	public Bandurria(String nombre, String tipo, String marca, double precio) {
		super(nombre, tipo, marca, precio);
	}

	public Bandurria(String nombre, String tipo, String marca) {
		super(nombre, tipo, marca);
	}

	@Override
	public void recoger() {
		System.out.println("Recogiendo Bandurria");

	}

	@Override
	public void guardar() {
		System.out.println("INSERT INTO TABLE TB_BANDURRIA");
	}
	
}
