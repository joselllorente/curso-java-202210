package curso.java.ficheros;

import java.io.IOException;

import curso.java.ficheros.servicio.ArchivoServicio;

public class EjemploLeerArchivo {
    public static void main(String[] args) {
        //String nombreArchivo = "D:\\Cursos\\Java\\archivo\\java.txt";
    	String nombreArchivo = "./recursos/java.txt";
        ArchivoServicio servicio = new ArchivoServicio();

        
        try {
			System.out.println(servicio.leerArchivo(nombreArchivo));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
