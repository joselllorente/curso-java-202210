package curso.java.ejercicios.poo.hipodromo;

public class Carrera {
	private String nombre;
	private double distancia;
	private Caballo[] caballos;
	private Caballo caballoGanador;
	
	public Carrera(String nombre, double distancia, Caballo[] caballos) {
		super();
		this.nombre = nombre;
		this.distancia = distancia;
		this.caballos = caballos;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getDistancia() {
		return distancia;
	}
	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	public Caballo[] getCaballos() {
		return caballos;
	}
	public void setCaballos(Caballo[] caballos) {
		this.caballos = caballos;
	} 
	
	/**
	 * Lanza la carrera de caballos
	 * @return el dorsal del caballo ganador
	 */
	public int iniciarCarrera() {
		System.out.println("Empieza la carrera "+this.nombre);
		boolean hayGanador = false;
		
		do {
			System.out.println("Los caballos estan corriendo");
			for (Caballo caballo : this.caballos) {
				caballo.correr();
			}
			System.out.println();
			hayGanador = comprobarGanador();
		}while (!hayGanador);
		
//		while (!hayGanador) {
//			System.out.println("Los caballos están corriendo");
//			for (Caballo caballo : caballos) {
//				caballo.correr();
//			}
//			hayGanador = comprobarGanador();
//		}
		
		System.out.println("Carrera terminada. Ha ganado el caballo con dorsal"+ this.caballoGanador.getDorsal());
		return this.caballoGanador.getDorsal();
	}
	
	/**Metodo para saber si algún caballo ha ganado
	 * 
	 * @return
	 */
	private boolean comprobarGanador() {
		int mayorDistancia=0;
		
		for (Caballo caballo : caballos) {
			//Para saber qué caballos han llegado al final 
			if (caballo.getDistanciaTotalAvanzada()>this.distancia) {
				//Para saber cual ha ganado
				if (caballo.getDistanciaTotalAvanzada()>mayorDistancia) {
					mayorDistancia=caballo.getDistanciaTotalAvanzada();
					this.caballoGanador= caballo;
				}
			}
		}
		boolean hayGanador = this.caballoGanador!=null;
		return hayGanador;
	}
}
