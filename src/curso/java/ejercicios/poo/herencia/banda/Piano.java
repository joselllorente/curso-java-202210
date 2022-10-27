package curso.java.ejercicios.poo.herencia.banda;

public class Piano extends Instrumento {
	private int numOctavas; 
	private int numPedales;
	
	public Piano(String nombre, String tipo, String marca, double precio, int numOctavas, int numPedales) {
		super(nombre, tipo, marca, precio);
		this.numOctavas = numOctavas;
		this.numPedales = numPedales;
	}
	
	public int getNumOctavas() {
		return numOctavas;
	}
	public void setNumOctavas(int numOctavas) {
		this.numOctavas = numOctavas;
	}
	public int getNumPedales() {
		return numPedales;
	}
	public void setNumPedales(int numPedales) {
		this.numPedales = numPedales;
	}

	@Override
	public String toString() {
		return "Piano [numOctavas=" + numOctavas + ", numPedales=" + numPedales + ", " + super.toString() + "]";
	}

	@Override
	public void limpiar() {
		System.out.println("Limpiando el piano");
	}

	@Override
	public void recoger() {
		System.out.println("Recoger el piano");
	}

	@Override
	public void guardar() {
		System.out.println("INSERT INTO TABLE TB_PIANO");
	}

	
	
	
	
}
