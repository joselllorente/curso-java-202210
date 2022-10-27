package curso.java.excepciones;

import java.io.IOException;

public class ClaseErrorA {
	
	
	public void metodo1 () throws MiExcepcion  {
		
		
		System.out.println("Llamando a metodo1");
		int numerador = 9;
		int denominador = 0;
		if (denominador==0) {
			ArithmeticException ae = new ArithmeticException("Estas dividiendo por cero y no se puede");
			Exception e = new Exception("Estas dividiendo por cero y no se puede");
			IOException ioe = new IOException("Mensaje");
			MiExcepcion me = new MiExcepcion("Excepcion propia");
//			try {
//				throw e;
//			}catch(Exception ex) {
//				System.out.println("Error");
//			}
			throw me;
			
		}
		System.out.println("Voy a realizar la division");
		int division =numerador/denominador;
		
		
	}
	
	public void metodo1(String a) {
		
	}

	public void metodo1(int a) {
		
	}
}
