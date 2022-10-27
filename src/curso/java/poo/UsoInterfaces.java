package curso.java.poo;

import curso.java.ejercicios.poo.herencia.banda.Bateria;
import curso.java.ejercicios.poo.herencia.banda.Guitarra;
import curso.java.ejercicios.poo.herencia.banda.GuitarraElectrica;
import curso.java.ejercicios.poo.herencia.banda.Instrumento;
import curso.java.ejercicios.poo.herencia.banda.Piano;
import curso.java.ejercicios.poo.hipodromo.Caballo;
import curso.java.ejercicios.poo.hipodromo.Jugador;
import curso.java.poo.interfaces.IInsertable;
import curso.java.poo.interfaces.IUpdatable;

public class UsoInterfaces {

	public static void main(String[] args) {
		UsoInterfaces ui = new UsoInterfaces();
		Instrumento[] instrumentos = ui.crearBanda();
		for (Instrumento instrumento : instrumentos) {
			ui.insertar(instrumento);
			//No se pueden actualizar porque no tienen implementada la interfaz Updatable
			//ui.actualizar(instrumento);
		}
		
		Caballo c1 = new Caballo(1,"",0,0,0);
		ui.insertar(c1);
		ui.actualizar(c1);
		
		//No se puede guardar el jugador porque no tiene implementada la interfaz IInsertable
		//Jugador j = new Jugador("N1",0);
		//ui.insertar(j);
	}

	public Instrumento[] crearBanda() {

		Guitarra guitarra = new Guitarra("Guitarra1", "Española", "Alhambra", 5, "madera");
		GuitarraElectrica guitarraElectrica = new GuitarraElectrica("GE-1", "Electrica", "Fender", 500, 5, null, 120);
		Bateria bateria = new Bateria("Bateria1", "Tipo1", "Marca1", 100, 2, 2);
		Piano piano = new Piano("Piano1", "Cola", "Marca1", 50, 4, 2);

		Instrumento[] instrumentos = { guitarra, guitarraElectrica, bateria, piano };
		return instrumentos;

	}

	public void test (String texto) {
		
	}
	
	public void insertar (IInsertable objeto) {
		objeto.guardar();
	}
	
	public void actualizar (IUpdatable objeto) {
		objeto.update(1);
	}
	
}