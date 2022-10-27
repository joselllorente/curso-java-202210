package curso.java.poo.herencia;

public class ClasePadre {
	private String nombre;
	private int edad;
	private boolean mayorEdad;
	
	public ClasePadre(String nombre, int edad, boolean mayorEdad) {
		System.out.println("Constructor ClasePadre");
		this.nombre = nombre;
		this.edad = edad;
		this.mayorEdad = mayorEdad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isMayorEdad() {
		return mayorEdad;
	}

	public void setMayorEdad(boolean mayorEdad) {
		this.mayorEdad = mayorEdad;
	}
	
	public int metodo1() {
		int num = 9;
		System.out.println("Llamando metodo 1 de clase padre");
		return num;
	}
	
}
