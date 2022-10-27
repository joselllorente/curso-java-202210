package curso.java.inicio;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("Introduce el numero de elementos de la serie de Fibonacci");
		Scanner scan = new Scanner(System.in);
		int numElementos = scan.nextInt();
		for (int i=0; i<numElementos ; i++) {
			int numero = fibonacciRecursiva (i);
			System.out.print(numero+",");
		}
		
		
		//fibonacciNormal(numElementos);
		
		

	}
	static void fibonacciNormal(int numElementos) {

		long num1=0, num2=1, suma=num1+num2;
		
		System.out.print(num1+",");
		System.out.print(num2+",");
		for (int i=0; i<numElementos-2 ; i++) {
			System.out.print(suma+",");
			num1 = num2;
			num2 = suma;
			suma = num1 + num2;
		}

	}
	
	static int fibonacciRecursiva (int numero) {
		
		if (numero ==0 || numero ==1) {
			return numero;
		}else {
			return fibonacciRecursiva(numero-1) + fibonacciRecursiva(numero-2);
		}
		
	}

}
