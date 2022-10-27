package curso.java.poo.herencia;

public class Estudiante extends ClasePadre{
	
	private String asignaturaFavorita;
	
	public Estudiante(String nombre, int edad, boolean mayorEdad) {
		super(nombre, edad, mayorEdad);
		System.out.println("Constructor Estudiante");
		// TODO Auto-generated constructor stub
	}
	
	public Estudiante(String nombre, int edad, boolean mayorEdad, String asignaturaFavorita) {
		super(nombre, edad, mayorEdad);
		System.out.println("Constructor Estudiante con asignatura");
		this.asignaturaFavorita= asignaturaFavorita;
		
	}
	
	public String getAsignaturaFavorita() {
		return asignaturaFavorita;
	}

	public void setAsignaturaFavorita(String asignaturaFavorita) {
		this.asignaturaFavorita = asignaturaFavorita;
	}

	@Override
	public int metodo1() {
		// TODO Auto-generated method stub
		int numeroPadre = super.metodo1();
		int numeroHijo = numeroPadre+7;
		System.out.println("Llamando metodo 1 de clase hija");
		return numeroHijo;
	}

	@Override
	public String toString() {
		return "Estudiante [asignaturaFavorita=" + asignaturaFavorita + ", nombre=" + getNombre() + ", edad()="
				+ getEdad() + "]";
	}

	

	

	

	
	
	
	
//	@Override
//	public void metodo1() {
//		System.out.println("Llamando metodo 1 de clase hija");
//	}
	
}
