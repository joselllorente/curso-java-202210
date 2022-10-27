package curso.java.ejercicios.poo.herencia.banda;

public class Guitarra extends InstrumentoCuerda {
	private int numCuerdas=5;
	private String material;
	
	
	public Guitarra(String nombre, String tipo, String marca, double precio, int numCuerdas, String material) {
		super(nombre, tipo, marca, precio);
		this.numCuerdas = numCuerdas;
		this.material = material;
	}

	public Guitarra(String nombre, String tipo, String marca, int numCuerdas, String material) {
		super(nombre, tipo, marca);
		this.numCuerdas = numCuerdas;
		this.material = material;
	}

	public int getNumCuerdas() {
		return numCuerdas;
	}

	public void setNumCuerdas(int numCuerdas) {
		this.numCuerdas = numCuerdas;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public void tocar() {
		System.out.println("Se esta tocando la guitarra "+ ( isAfinado()?" correctamente": " mal"   )  );
	}

	@Override
	public String toString() {
		return "Guitarra [numCuerdas=" + numCuerdas + ", material=" + material + ", " + super.toString() + "]";
	}

	@Override
	public void recoger() {
		System.out.println("Recogiendo la guitarra");
	}
	
	@Override
	public void guardar() {
		System.out.println("INSERT INTO TABLE TB_GUITARRA");
	}
	
}
