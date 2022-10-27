package curso.java.poo.herencia;

public class MainHerencia {

	public static void main(String[] args) {
		Estudiante estudiante = 
				new Estudiante("Nombre1",17,false,"Física");
		//estudiante.setAsignaturaFavorita("Matemáticas");
		//estudiante.metodo1();
		if (estudiante.isMayorEdad()) {
			
		}
		System.out.println(estudiante.isMayorEdad());
	}

}
