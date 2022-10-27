package curso.java.ejercicios.poo.herencia.banda;

public class BandaMusica {


	public static void main(String[] args) {
		BandaMusica banda = new BandaMusica();
		Instrumento[] instrumentos = banda.crearBanda();
		banda.iniciarConcierto(instrumentos);

	}
	
	private void iniciarConcierto(Instrumento[] instrumentos) {
		
		//Afinamos los instrumentos
		for (Instrumento instrumento : instrumentos) {
			instrumento.afinar();
			
		}
		
		for (Instrumento instrumento : instrumentos) {
			System.out.println(instrumento.getClass().getSimpleName());
			if (instrumento instanceof Bateria) {
				//((Bateria)instrumento).aporrear();
				Bateria b = (Bateria)instrumento;
				b.aporrear();
			}else {
				instrumento.tocar();
			}
		}
	}
	
	public Instrumento[] crearBanda() {
		
		Guitarra guitarra = new Guitarra("Guitarra1","Española","Alhambra",5, "madera" );
		GuitarraElectrica guitarraElectrica = new GuitarraElectrica("GE-1", "Electrica", "Fender", 500, 5, null, 120);
		Bateria bateria = new Bateria ("Bateria1","Tipo1","Marca1",100,2,2);
		Piano piano = new Piano("Piano1","Cola","Marca1",50,4,2);
		
		Instrumento[] instrumentos = {guitarra,guitarraElectrica,bateria,piano};

//		bateria.tocar();
//		//Hago un cast
//		if (bateria instanceof Bateria) {
//			Bateria bateria2 = (Bateria) bateria;
//			bateria2.aporrear();
//		}else {
//			System.out.println("No es del tipo Bateria");
//		}
		
		//Instrumento i = new Instrumento("N1","T1","Marca",90);
		return instrumentos;
		
	}
	
	

}

