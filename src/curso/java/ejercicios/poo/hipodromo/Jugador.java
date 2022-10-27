package curso.java.ejercicios.poo.hipodromo;

import curso.java.funciones.Utils;

public class Jugador {
	private String nombre;
	private double saldo;
	private Apuesta apuesta;
	
	public Jugador(String nombre, double saldo) {
		super();
		this.nombre = nombre;
		this.saldo = saldo;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Apuesta getApuesta() {
		return apuesta;
	}
	private void setApuesta(Apuesta apuesta) {
		this.apuesta = apuesta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void apostar(Caballo[] caballos) {
		int cantidad=0;
		int dorsal = 0;
		boolean apuestaCorrecta=false;

		//Controlo que la cantidad apostada sea correcta
		do {
			cantidad = Integer.parseInt(Utils.pideValor("Cuánto quieres apostar?? Tienes "+this.getSaldo()));
			apuestaCorrecta = compruebaApuesta(cantidad);
		}while(!apuestaCorrecta);
		
		//Controlo que el dorsal del caballo elegido sea correcto (uno de los de los caballos que participan en la carrera)
		String texto= "¿Por qué caballo quieres apostar?? ";
		for (Caballo caballo : caballos) {
			texto+=caballo.getDorsal()+", ";
		}
		apuestaCorrecta=false;
		do {
			dorsal = Integer.parseInt(Utils.pideValor(texto));
			apuestaCorrecta = compruebaApuestaDorsal(dorsal,caballos);
		}while(!apuestaCorrecta);
		
		//Creo la apuesta
		Apuesta apuesta = new Apuesta(cantidad,dorsal);
		//Asigno la apuesta al jugador
		this.setApuesta(apuesta);
		//Actualizo el saldo quitnadole la cantidad apostadad
		this.saldo-=cantidad;
		//this.apuesta = apuesta;
	}
	
	private boolean compruebaApuesta(double cantidad) {
		return cantidad<=this.saldo && cantidad>0;
	}
	
	private boolean compruebaApuestaDorsal(int dorsal, Caballo[] caballos) {
		boolean apuestaDorsalCorrecta = false;
		for (Caballo caballo : caballos) {
			if(caballo.getDorsal()==dorsal) {
				apuestaDorsalCorrecta = true;
			}
		}
		if(!apuestaDorsalCorrecta) {
			System.out.println("Dorsal incorrecto");
		}
		return apuestaDorsalCorrecta;
	}
}
