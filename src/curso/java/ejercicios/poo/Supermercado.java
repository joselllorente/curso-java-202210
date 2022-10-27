package curso.java.ejercicios.poo;

public class Supermercado {

	private String nombre;
	
	public Supermercado(String nombre) {
		super();
		this.nombre = nombre;
	}

	public static void main(String[] args) {
				
		Supermercado super1 = new Supermercado("Supermercado1");
		Cliente [] clientes = super1.crearClientes();
		super1.importeTotalClientes(clientes);
		//importeTotalClientes(clientes);

		
	}	
	
	private Cliente[] crearClientes () {
		Cliente cliente1 = new Cliente("nombre1","apellidos1","1111A");
		
		Cliente cliente2 = new Cliente("nombre2","apellidos2","2222B");
		Cliente cliente3 = new Cliente("nombre3","apellidos3","3333C");
		Cliente cliente4 = new Cliente("nombre4","apellidos4","4444D");
		
		
		
		Cliente.saludo="Hola";
		
		cliente1.comprar(100);
		cliente1.comprar(50);
		cliente2.comprar(160);
		cliente3.comprar(40);
		cliente4.comprar(10);

		Cliente[] clientes = {cliente1,cliente2,cliente3,cliente4};
		
		for (Cliente cliente : clientes) {
			System.out.println(cliente.getNombre());
		}
		
		return clientes;
	}
	
	
	private void importeTotalClientes(Cliente[] clientes) {
		double totalImporte = 0.0;
		for (Cliente cliente : clientes) {
			System.out.println(cliente.getNombre()+ "-" + cliente.getImporteCompra());
			totalImporte += cliente.getImporteCompra();
		}
		System.out.println("El total de la compra de todos los clientes del supermercado "+this.nombre + " es " + totalImporte);
	}

}
