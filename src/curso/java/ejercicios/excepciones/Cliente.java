package curso.java.ejercicios.excepciones;

public class Cliente {
	private String nombre;

	public Cliente(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void tomarCafe(CoffeCup taza) throws TooHotTemperatureException, TooColdTemperatureException{
		if(taza.getTemperature()>80) {
			throw new TooHotTemperatureException ("Café muy caliente "+taza.getTemperature());
		}else if(taza.getTemperature()<20) {
			throw new TooColdTemperatureException ("Café muy frio "+taza.getTemperature());
		}else {
			System.out.println("El cliente se toma el café tranquilamente "+taza.getTemperature());
		}
	}
	
}
