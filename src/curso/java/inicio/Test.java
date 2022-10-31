package curso.java.inicio;

public class Test {

	public static void main(String[] args) {
		System.out.println("Empezando3");
		String texto= "Lorem Ipsum is simply dummy text of the printing and typesetting industry. "
				+ "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, "
				+ "when an unknown printer took a galley of type and scrambled it to make a type specimen book. "
				+ "It has survived not only five centuries, but also the leap into electronic typesetting, "
				+ "remaining essentially unchanged. "
				+ "It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, "
				+ "and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
		
		int posicionPrimerPunto = texto.indexOf(".")+1; 
		String subCadena = texto.substring(posicionPrimerPunto);
		//System.out.println(subCadena);
		int posicionSegundoPunto = subCadena.indexOf(".")+1;
		String cadenaFinal = subCadena.substring(0 ,  posicionSegundoPunto );
		//System.out.println(cadenaFinal);
		
		//String [] frases = texto.split("\\.");
		//System.out.println(texto.split("\\.")[1]);
//		for (String frase : frases) {
//			System.out.println(frase+"\n");
//		}                   

		String mensaje = "Hola esto es una prueba";
		String m2 = mensaje.toUpperCase();
		System.out.println(mensaje);
		System.out.println(m2);
		
		System.out.println(mensaje + m2);
		
	}

}
