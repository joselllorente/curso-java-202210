package curso.java.ficheros.servicio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

public class ArchivoServicio {

    public void crearArchivo(String nombre){
        File archivo = new File(nombre);
        try (BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo, false))){

            buffer.append("Hola que tal amigos!\n")
                    .append("Todo bien? yo escribiendo en un archivo...\n")
                    .append("Hasta luego Lucas!\n");
            // buffer.close();
            System.out.println("El archivo se ha creado con éxito!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void crearArchivo2(String nombre){
        File archivo = new File(nombre);
        
        try (PrintWriter buffer = new PrintWriter(new FileWriter(archivo))){

            buffer.println("Hola que tal amigos!");
            buffer.println("Todo bien? yo acá escribiendo un archivo...");
            buffer.printf("Hasta luego %s!", "JoseLuis5");
            // buffer.close();
            System.out.println("El archivo se ha creado con éxito!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String leerArchivo(String nombre) throws IOException{
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);
        FileReader fileReader = new FileReader(archivo);
        BufferedReader reader = new BufferedReader(fileReader);
        
        String linea;
        while ( (linea = reader.readLine()) != null){
            sb.append(linea).append("\n");
        }
        
//        try (BufferedReader reader = new BufferedReader(new FileReader(archivo))){
//
//            String linea;
//            while ( (linea = reader.readLine()) != null){
//                sb.append(linea).append("\n");
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        return sb.toString();
    }

    public String leerArchivo2(String nombre){
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);
        try (Scanner s = new Scanner(archivo)){

            s.useDelimiter("\n");
            while (s.hasNext()){
                sb.append(s.next()).append("\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
    
    
    public void mostrarContenidoDirectorio(String directorio) {
    	File dir = new File(directorio);
        
        if(dir.isDirectory()) {
        	String[] ficheros = dir.list();
        	for (String nombreFichero : ficheros) {
				System.out.print(nombreFichero + " ");
				String nuevoFichero = directorio+nombreFichero;
				File file = new File(nuevoFichero);
				if(file.isDirectory()) {
					System.out.println("Es un directorio");
				}else {
					System.out.println("Es un fichero");
				}
					
			}
        }else {
        	System.err.println("No es un directorio");
        }
    }
}
