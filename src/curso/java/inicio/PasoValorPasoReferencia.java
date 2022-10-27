package curso.java.inicio;

public class PasoValorPasoReferencia {

	public static void main(String[] args) {
		
//		int num = 7;
//		System.out.println(num);
//		metodo1(num);
//		System.out.println(num);
		
		String palabra ="Hola";
		System.out.println(palabra);
		metodo1(palabra);
		System.out.println(palabra);
		
//		String [] colores = {"Blanco","Azul"};
//		System.out.println(colores[0]);
//		metodo2(colores);
//		System.out.println(colores[0]);

	}
	
	//Paso por valor
	static void metodo1 (int numero) {
		numero += 2;
		System.out.println(numero);
	}

	//Paso por valor
	static void metodo1 (String palabra) {
		System.out.println(palabra);
		palabra = "Adios";
		System.out.println(palabra);
	}
	
	//Paso por referencia
	static void metodo2 (String [] colores) {
		colores[0]="Negro";
		System.out.println(colores[0]);
	}
}
