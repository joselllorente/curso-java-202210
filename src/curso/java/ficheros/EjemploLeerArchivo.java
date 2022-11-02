package curso.java.ficheros;

import curso.java.ficheros.servicio.ArchivoServicio;

public class EjemploLeerArchivo {
    public static void main(String[] args) {
        //String nombreArchivo = "D:\\Cursos\\Java\\archivo\\java.txt";
    	String nombreArchivo = "./recursos/java.txt";
        ArchivoServicio servicio = new ArchivoServicio();

        System.out.println(servicio.leerArchivo(nombreArchivo));
    }
}
