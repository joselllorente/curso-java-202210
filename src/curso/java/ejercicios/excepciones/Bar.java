package curso.java.ejercicios.excepciones;

import curso.java.funciones.Utils;

public class Bar {

	public static void main(String[] args) {
		CoffeCup taza = new CoffeCup(Utils.tirarDado(100));
		Cliente cliente = new Cliente("Cliente1");
		
		try {
			cliente.tomarCafe(taza);
		} catch (TooHotTemperatureException thte) {
			System.out.println("El cliente se ha quemado " + thte.getMessage());
			
		} catch (TooColdTemperatureException tcte) {
			System.out.println("El cliente se ha dejado el café "+tcte.getMessage());
		}

	}

}
