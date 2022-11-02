package curso.java.ejercicios.mapas;

public class Colegio {
	private String nombre;
	private String direccion;
	
	public Colegio(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Colegio [nombre=" + nombre + ", direccion=" + direccion + "]";
	}

}
