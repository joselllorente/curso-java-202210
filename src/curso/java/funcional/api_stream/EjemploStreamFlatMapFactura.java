package curso.java.funcional.api_stream;

import java.util.Arrays;
import java.util.List;

import curso.java.funcional.api_stream.models.Factura;
import curso.java.funcional.api_stream.models.Usuario;

public class EjemploStreamFlatMapFactura {
    public static void main(String[] args) {

        Usuario u1 = new Usuario("John", "Doe");
        Usuario u2 = new Usuario("Pepe", "Pérez");

        u1.addFactura(new Factura("compras tecnologías"));
        u1.addFactura(new Factura("compras muebles"));

        u2.addFactura(new Factura("bicicleta"));
        u2.addFactura(new Factura("notebook gamer"));

        List<Usuario> usuarios = Arrays.asList(u1, u2);
        usuarios.stream()
                .flatMap(u -> u.getFacturas().stream())
                .forEach(f -> System.out.println(f.getDescripcion().concat(" : cliente ")
                .concat(f.getUsuario().toString())));

        /*for(Usuario u: usuarios){
            for(Factura f: u.getFacturas()){
                System.out.println(f.getDescripcion());
            }
        }*/
    }
}
