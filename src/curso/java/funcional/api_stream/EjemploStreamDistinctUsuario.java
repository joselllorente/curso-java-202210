package curso.java.funcional.api_stream;

import java.util.stream.Stream;

import curso.java.funcional.api_stream.models.Usuario;

public class EjemploStreamDistinctUsuario {
    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia", "Pato Guzman", "Pato Guzman")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .distinct();

        nombres.forEach(System.out::println);
    }
}
