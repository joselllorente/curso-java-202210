package curso.java.ejercicios.poo.herencia.banda;

public class Bateria extends Instrumento {
	private int numTimbales; 
	private int numPlatos;
	
	public Bateria(String nombre, String tipo, String marca, double precio, int numTimbales, int numPlatos) {
		super(nombre, tipo, marca, precio);
		this.numTimbales = numTimbales;
		this.numPlatos = numPlatos;
	}
	
	public int getNumTimbales() {
		return numTimbales;
	}
	public void setNumTimbales(int numTimbales) {
		this.numTimbales = numTimbales;
	}
	public int getNumPlatos() {
		return numPlatos;
	}
	public void setNumPlatos(int numPlatos) {
		this.numPlatos = numPlatos;
	}
	
	public void aporrear() {
		System.out.println("Aporreando la bateria "+this.getNombre());
	}

	@Override
	public String toString() {
		return "Bateria [numTimbales=" + numTimbales + ", numPlatos=" + numPlatos + ", " + super.toString()
				+ "]";
	}

	@Override
	public void tocar() {
		System.out.println("Tocando la bateria");
	}

	@Override
	public void limpiar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recoger() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void guardar() {
		System.out.println("INSERT INTO TABLE TB_BATERIA");
	}
	
}
