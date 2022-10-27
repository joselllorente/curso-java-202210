package curso.java.ejercicios.poo;

public class Cliente {
	//Variables de clase
	static String saludo;
	
	//Variables de instancia
	private String nombre;
	private String apellidos;
	private String dni;
	private double importeCompra;
	
	//Constructor
	public Cliente(String nombre, String apellidos, String dni) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}

	//Get y Set
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public double getImporteCompra() {
		return importeCompra;
	}

	public String getDni() {
		return dni;
	}
	
	//Funciones
	void comprar(double valorCompra) {
		Math.random();
		this.importeCompra += valorCompra;
	}
	
	void pagar (double importe) {
		
	}
	
}
