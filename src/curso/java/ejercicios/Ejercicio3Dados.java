package curso.java.ejercicios;

import java.util.Arrays;

import curso.java.funciones.Utils;

public class Ejercicio3Dados {

	public static void main(String[] args) {
		int numCaras = 6;
		int numTiradas =  Integer.parseInt(Utils.pideValor("Cuántas veces debo tirar el dado?"));
		int[] tiradasDado = new int[numTiradas];
		int numMasAlto = 0;
		int numMasBajo = numCaras;
		int total = 0;
		
		
		for (int i = 0; i < tiradasDado.length; i++) {
			int tirada = Utils.tirarDado(numCaras);
			tiradasDado[i]= tirada;
			total += tirada;
			numMasAlto = Math.max(tirada, numMasAlto); 
			numMasBajo = Math.min(tirada, numMasBajo);
		}
		//System.out.println(tiradasDado);
		System.out.println(Arrays.toString(tiradasDado));
		Arrays.sort(tiradasDado);
		System.out.println("La media es "+ (total/numTiradas));
		System.out.println("El numero mas alto "+ numMasAlto);
		System.out.println("El numero mas bajo "+ numMasBajo);
		
	}
	

}
