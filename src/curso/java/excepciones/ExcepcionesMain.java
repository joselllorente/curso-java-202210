package curso.java.excepciones;

import java.io.IOException;

public class ExcepcionesMain {

	public static void main(String[] args) {
		
		System.out.println("Inicio");

		ClaseErrorA cea = new ClaseErrorA();
		try {
			cea.metodo1();
		} catch (MiExcepcion e1) {
			e1.printStackTrace();
			System.out.println(e1.getMessage());
		}
		
		
		try {
			
			
			System.out.println("Dentro del try");
//			String texto = null;
//			texto.toUpperCase();
//
//			String[] colores = {"Blanco","Azul"};
//			System.out.println(colores[colores.length]);
//			int num = 7/0;
			
			
		}catch(ArithmeticException | ClassCastException  ae) {
			//e.printStackTrace();
			System.out.println("Ha habido un problema con la division: " + ae.getMessage());
		}catch(ArrayIndexOutOfBoundsException aiobe) {
			System.out.println("Ha habido un problema con el array has cogido un elemento que no existe: " + aiobe.getMessage());
		}catch(NullPointerException npe) {
			System.out.println("Ha habido un problema con el objeto (es nulo): " + npe.getMessage());
		}catch(Exception e) {
			System.out.println("Se ha producido un error " +e.getMessage());	
		}finally {
			System.out.println("Continua");
		}
		
		
		
		System.out.println("Fin");
	}

}
