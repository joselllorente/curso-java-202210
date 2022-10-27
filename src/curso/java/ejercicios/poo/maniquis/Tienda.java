package curso.java.ejercicios.poo.maniquis;

import curso.java.ejercicios.poo.maniquis.pojos.Boton;
import curso.java.ejercicios.poo.maniquis.pojos.Camisa;
import curso.java.ejercicios.poo.maniquis.pojos.Maniqui;
import curso.java.ejercicios.poo.maniquis.pojos.Pantalon;
import curso.java.ejercicios.poo.maniquis.pojos.Vestido;

public class Tienda {
	private String nombre;
	
	public Tienda(String nombre) {
		super();
		this.nombre = nombre;
	}

	public static void main(String[] args) {
		Tienda tienda1 = new Tienda("Tienda1");
		Maniqui[] maniquis = tienda1.crearTienda();
		System.out.println("Numero de maniquis" + maniquis.length);
		
		
		//maniquis[0].getCamisa().getBotones()[0]=null;
		Boton[] botonesCamisa = maniquis[0].getCamisa().getBotones();
		botonesCamisa[0]=null;
		
		
		maniquis[1].desvestir();
		
		tienda1.calculaPrecioRopaManiquis(maniquis);
	}

	private void calculaPrecioRopaManiquis(Maniqui[] maniquis) {
		double totalPrecio=0;
		for (Maniqui maniqui : maniquis) {
			if (maniqui.getCamisa()!=null)
				totalPrecio+=maniqui.getCamisa().getPrecio();
			if (maniqui.getVestido()!=null)
				totalPrecio+=maniqui.getVestido().getPrecio();
			if (maniqui.getPantalon()!=null)
				totalPrecio+=maniqui.getPantalon().getPrecio();
		}
		System.out.println("El precio de toda la ropa que llevan los maniquies es de " + totalPrecio);
	}
	
	private Maniqui[] crearTienda() {
		Boton boton1 = new Boton("negro","redondo");
		Boton boton2 = new Boton("negro","redondo");
		Boton boton3 = new Boton("negro","redondo");
		Boton boton4 = new Boton("negro","redondo");
		Boton boton5 = new Boton("negro","redondo");
		Boton boton6 = new Boton("negro","redondo");
		
		Boton [] botonesCamisa1 = {boton1,boton2};
		Boton [] botonesCamisa2 = {boton3,boton4,boton5};
		
		Camisa camisa1 = new Camisa("Negra","L",40, botonesCamisa1);
		Camisa camisa2 = new Camisa("Negra","M",60);
		camisa2.setBotones(botonesCamisa2);
		
		Pantalon pantalon = new Pantalon("Vaquero","40",50, boton6);
		
		Vestido vestido = new Vestido("Verde","38",60);
		
		Maniqui maniqui1 = new Maniqui(1);
		Maniqui maniqui2 = new Maniqui(2, vestido);
		
		maniqui1.vestir(camisa1,pantalon);
		
		Maniqui[] maniquis= {maniqui1,maniqui2};
		
		return maniquis;
	}
	

}
