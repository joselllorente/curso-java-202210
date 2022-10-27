package curso.java.inicio;

import java.util.Scanner;

import curso.java.funciones.Utils;

public class Ejercicio1 {

	public static void main(String[] args) {
//		System.out.println("1. Pintar cuadrado");
//		System.out.println("2. Validar email");
//		System.out.println("3. Serie Fibonacci");
//		System.out.println("4. Insertar Nombres");
//		System.out.println("5. Salir");
		
		int opcion=0;
		do {
			//String [] menu = {"1.Opcion1","2.Opcion2","3.Salir"};
			Utils.pintaMenu();
			
			opcion = Integer.parseInt(Utils.pideValor());

			switch (opcion){
				case 1: pintaCuadrado();break;
				case 2: validarEmail();break;
				case 3: serieFibonacci();break;
				case 4: pintarAlumnos();break;
				case 5: System.out.println("Adios");break;
				default: System.out.println("Opcion incorrecta");
			}
			
			
			//System.out.println("Opcion seleccionada "+opcion);
		}while(opcion!=5);
		
		System.out.println("Termina");
		
	}
	
	/**
	 * Función para pintar un cuadrado usando bucles 
	 */
	static void pintaCuadrado () {
		int tamanio = Integer.parseInt(Utils.pideValor("Introduce tamaño"));
		for (int fila=0;  fila<tamanio   ;fila++) {
			for (int columna=0;  columna<tamanio   ;columna++) {
				if (fila==0 || fila==tamanio-1 || columna==0 || columna==tamanio-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			//Esto es para hacer un salto de linea después de pintar cada linea
			System.out.println();
		}
		
	}
	
	/**
	 * Método para validar un email
	 */
	static void validarEmail() {
		String email = Utils.pideValor("Introduce un email");
		email = email.trim();
		String mensajeError = "";
		
		//Validaciones del email
		//No puede contener espacios en blanco  
		if(email.contains(" ")) {
			mensajeError += "El email no puede tener espacios en blanco. ";
		}
		
		//Solo tiene que haber 1 @
		if (email.indexOf("@")==-1 || email.indexOf("@")!=email.lastIndexOf("@") ) {
			mensajeError += "Tiene que haber un @. ";
		}
		
		if(!email.substring(email.indexOf("@")).contains(".") ) {
			mensajeError += "Tiene que haber una . punto despues de la @. ";
		}else {//Cuando si hay punto
			String subcadena = email.substring(email.lastIndexOf(".")+1);
			int tamnioDominio = email.substring(email.lastIndexOf(".")+1).length();
			if (tamnioDominio<2 || tamnioDominio>6) {
				mensajeError += "El tamaño del dominio tiene que estar entre 2 y 6. ";
			}
		}
		
		if (mensajeError.equals("")) {
			System.out.println("El email "+email + " es correcto");
		}else {
			System.out.println("El email "+email + " es incorrecto "+ mensajeError);
		}
	}
	
	static void serieFibonacci() {
		int numElementos = Integer.parseInt(Utils.pideValor("Introduce el numero de elementos de la serie de Fibonacci"));
		int num1=0, num2=1, suma=num1+num2;
		
		System.out.print(num1+",");
		System.out.print(num2+",");
		for (int i=0; i<numElementos-2 ; i++) {
			System.out.print(suma+",");
			num1 = num2;
			num2 = suma;
			suma = num1 + num2;
		}

	}
	
	static void pintarAlumnos() {
		int numAlumnos = Integer.parseInt(Utils.pideValor("Introduce el numero de Alumnos"));
		String [] alumnos = new String[numAlumnos];
		
		for (int j = 0; j <= alumnos.length; j++) {
			alumnos[j] = Utils.pideValor("Introduce nombre alumno "+(j+1));
		}
		
		for (String nombreAlumno : alumnos) {
			System.out.println(nombreAlumno );
		}
		
		
	}

}













