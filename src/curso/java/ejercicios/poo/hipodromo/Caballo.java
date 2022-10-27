package curso.java.ejercicios.poo.hipodromo;

import curso.java.funciones.Utils;
import curso.java.poo.interfaces.IUpdatable;

public class Caballo implements IUpdatable{
	private int dorsal;
	private String nombre;
	private int velocidad;// (1-10)
	private int experiencia;// (1-10)
	private int edad;// (1-20)
	//Sirve para ver cuanta distancia ha avanzado un
	private int distanciaTotalAvanzada;
	
	public Caballo(int dorsal, String nombre, int velocidad, int experiencia, int edad) {
		super();
		this.dorsal = dorsal;
		this.nombre = nombre;
		this.velocidad = velocidad;
		this.experiencia = experiencia;
		this.edad = edad;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getDistanciaTotalAvanzada() {
		return distanciaTotalAvanzada;
	}

	public void setDistanciaTotalAvanzada(int distanciaTotalAvanzada) {
		this.distanciaTotalAvanzada = distanciaTotalAvanzada;
	}

	public int correr () {
		int avance = this.velocidad + this.experiencia - this.edad + Utils.tirarDado(10);
		this.distanciaTotalAvanzada += avance;
		System.out.println("El caballo "+this.dorsal + " ha avanzado "+ avance + " lleva en total "+ this.distanciaTotalAvanzada+"");
		return avance;
	}

	@Override
	public void guardar() {
		System.out.println("INSERT INTO TABLE TB_CABALLO");
		
	}

	@Override
	public void update(long id) {
		System.out.println("UPDATE TABLE TB_CABALLO");
		
	}
}