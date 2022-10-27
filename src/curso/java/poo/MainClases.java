package curso.java.poo;

public class MainClases {

	public static void main(String[] args) {
		
		ClaseA ca = new ClaseA("Eva");
		ClaseA ca1 = new ClaseA("Raúl");
		ClaseA ca2 = null;	
	
		ca2 = ca1;
		//System.out.println(ca2.nombre);	
		//ca1.nombre="Rosa";
		//ca.nombre= ca2.nombre;
		
		//System.out.println(ca.nombre);
		System.out.println(ca);
		System.out.println(ca1);
		System.out.println(ca2);
		
		ClaseB cb = new ClaseB("Buenos días!!", 10);
		ClaseA ca3 = new ClaseA("Emilio", cb);
		
		
		System.out.println(ca3.getClaseb().getNumero3());
		
	}

}
