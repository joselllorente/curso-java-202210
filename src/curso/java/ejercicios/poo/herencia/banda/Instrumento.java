package curso.java.ejercicios.poo.herencia.banda;

import curso.java.funciones.Utils;
import curso.java.poo.interfaces.IInsertable;

public abstract class Instrumento implements IInsertable{
	private String nombre;
	private String tipo;
	private String marca;
	private double precio;
	private boolean afinado;
	
	public Instrumento(String nombre, String tipo, String marca, double precio) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.marca = marca;
		this.precio = precio;
	}
	
	public Instrumento(String nombre, String tipo, String marca) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.marca = marca;
	}
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public boolean isAfinado() {
		return afinado;
	}
	public void setAfinado(boolean afinado) {
		this.afinado = afinado;
	}

	public void afinar() {
		int tirada = Utils.tirarDado(10);
		if(tirada>8) {
			System.out.println("Instrumento "+this.nombre +" no afinado correctamente");
			this.afinado=false;
		}else {
			System.out.println("Instrumento "+this.nombre +" afinado correctamente");
			this.afinado=true;
		}
	}
	
	public void tocar() {
		//Uso de operador ternario
		System.out.println("Tocando el instrumento "+ this.nombre + ( isAfinado()?" correctamente": " mal"   )  );
		
//		if(isAfinado()) {
//			System.out.println("Tocando el instrumento "+ this.nombre + " correctamente");
//		}else {
//			System.out.println("Tocando el instrumento "+ this.nombre + " mal");
//		}
	}

	@Override
	public String toString() {
		return "Instrumento [nombre=" + nombre + ", tipo=" + tipo + ", marca=" + marca + ", precio=" + precio
				+ ", afinado=" + afinado + "]";
	}

	
	protected abstract void limpiar();
	
	public abstract void recoger();
		
}
