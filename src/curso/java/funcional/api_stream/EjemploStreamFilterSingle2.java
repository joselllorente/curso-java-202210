package curso.java.funcional.api_stream;

import java.util.stream.Stream;

import curso.java.funcional.api_stream.models.Usuario;

public class EjemploStreamFilterSingle2 {
    public static void main(String[] args) {

        Usuario usuario = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .peek(System.out::println)
                .filter(u -> u.getId().equals(4))
                .findFirst().orElseGet(() -> new Usuario("John", "Doe"));

        System.out.println(usuario);

    }
}
