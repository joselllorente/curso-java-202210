package curso.java.ejercicios;

import java.util.Arrays;

import curso.java.funciones.Utils;

/**
 * Se tira 5 veces dos dados. 
 * Obtener en que tirada se ha obtenido el número más alto con los valores de cada dado
 * @author Jose Luis
 *
 */
public class Ejercicio4DosDados {
	
	public static void main(String[] args) {
		int numTiradas = 5;
		int numDados = 2;
		int numCaras = 6;
		
		int sumaTiradaMasAlta = 0;
		int tiradaMasAlta = 0;
		
//		int [][] tiradas = new int[numTiradas][numDados];
//		
//		for (int i = 0; i < tiradas.length; i++) {
//			for (int j = 0; j < tiradas[i].length; j++) {
//				tiradas[i][j]=Utils.tirarDado(numCaras);
//			}
//		}
		
		
		int [] tiradasDado1 = new int[numTiradas];
		int [] tiradasDado2 = new int[numTiradas];
		
		for (int i = 0; i < numTiradas; i++) {
			int tiradaDado1 =Utils.tirarDado(numCaras); 
			int tiradaDado2 =Utils.tirarDado(numCaras);
			
			tiradasDado1[i]= tiradaDado1;
			tiradasDado2[i]= tiradaDado2;
			
			if (sumaTiradaMasAlta<(tiradaDado1+tiradaDado2)) {
				sumaTiradaMasAlta = tiradaDado1+tiradaDado2;
				tiradaMasAlta = i+1;
			}
		}
		System.out.println(Arrays.toString(tiradasDado1));
		System.out.println(Arrays.toString(tiradasDado2));
		System.out.println("La tirada con la suma mas alta ha sido la "+ tiradaMasAlta);
		System.out.println("La suma mas alta ha sido de "+ sumaTiradaMasAlta);
	}

}

