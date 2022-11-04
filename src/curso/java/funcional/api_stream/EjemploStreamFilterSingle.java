package curso.java.funcional.api_stream;

import java.util.Optional;
import java.util.stream.Stream;

import curso.java.funcional.api_stream.models.Usuario;

public class EjemploStreamFilterSingle {
    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u -> u.getNombre().equals("Pepe"))
                .peek(System.out::println);

        Optional<Usuario> usuario = nombres.findFirst();
        // System.out.println(usuario.orElse(new Usuario("John", "Doe")).getNombre());
        // System.out.println(usuario.orElseGet(() -> new Usuario("John", "Doe")).getNombre());
        if(usuario.isPresent()) {
            System.out.println(usuario.get().getNombre());
        } else {
            System.out.println("No se encontró el objeto!");
        }
        //nombres.forEach(System.out::println);

    }
}
