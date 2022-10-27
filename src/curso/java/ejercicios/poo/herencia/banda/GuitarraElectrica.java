package curso.java.ejercicios.poo.herencia.banda;

public final class GuitarraElectrica extends Guitarra {

	private double potencia;

	public GuitarraElectrica(String nombre, String tipo, String marca, double precio, int numCuerdas, String material,
			double potencia) {
		super(nombre, tipo, marca, precio, numCuerdas, material);
		this.potencia = potencia;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	@Override
	public void tocar() {
		super.tocar();
		System.out.println(" electrica con la potencia "+this.potencia);
	}

	@Override
	public String toString() {
		return "GuitarraElectrica [potencia=" + potencia + ", " + super.toString() + "]";
	}
	
	
	
	
	

}
