package curso.java.inicio;

import curso.java.funciones.Utils;

public class Ejercicio2Colegio {
	
	private static final String BUSQUEDA="buscar";
	private static final String BORRADO ="borrar";
	private static final String INSERTAR="insertar";
	private static final String MOSTRAR ="mostrar";
	private static final String ALUMNOS="alumnos";
	private static final String PLAZAS_LIBRES ="plazas";
	
	public static void main(String[] args) {
		
		int numAulas = Integer.parseInt(Utils.pideValor("Introduce número de aulas"));
		String [][] colegio = new String[numAulas][];
		for (int i =0;i<numAulas;i++) {
			int numAlumnos = Integer.parseInt(Utils.pideValor("¿Cuántos alumnos caben en el aula "+(i+1)+"?"));
			colegio[i] = new String[numAlumnos];
		}
		
		int opcion=0;
		do {
			String[] menu = {"\n1. Insertar Alumno por Aula","2. Buscar Alumno",
					"3. Borrar Alumno","4. Mostrar Alumnos por Aula ", "5. Mostrar Alumnos",
					"6. Mostrar plazas libres de todas las aulas","7. Salir"};
			Utils.pintaMenu(menu);
			
			opcion = Integer.parseInt(Utils.pideValor("Introduce una opcion:"));
			switch (opcion) {
				case 1: gestionAlumnos(colegio,INSERTAR,"En que aula quieres meter al alumno"); break;
				case 2: operarSobreAlumno(colegio,BUSQUEDA);break;
				case 3: operarSobreAlumno(colegio,BORRADO);break;
				case 4: gestionAlumnos(colegio,MOSTRAR,"De que aula quieres mostrar los alumnos");break;
				case 5: mostrarColegio(colegio,ALUMNOS);break;
				case 6: mostrarColegio(colegio,PLAZAS_LIBRES);break;
				case 7: System.out.println("Adios"); break;
			}
		}while(opcion!=7);
	}

	static void mostrarColegio(String [][] colegio,String accion) {
		int contadorAula=0;
		for (String[] aula : colegio) {
			contadorAula++;
			System.out.println("Aula "+contadorAula);
			int contadorAlumno=0;
			for (String alumno : aula) {
				if (accion.equals(ALUMNOS)) {
					System.out.println("\tAlumno: "+ (alumno!=null?alumno:"vacio") );
				}else if(accion.equals(PLAZAS_LIBRES)){
					contadorAlumno++;
					if (alumno==null) {
						System.out.println("Plaza "+ contadorAlumno + " del aula "+ contadorAula + " está libre");
					}
				}
			}
		}
		
		
	}
	
	
	static void gestionAlumnos (String [][] colegio, String accion, String texto) {
		int aula = 0;
		boolean aulaCorrecta=true;
		do {
			aula = Integer.parseInt(Utils.pideValor(texto));
			aulaCorrecta = validaAula(aula, colegio);
			if(!aulaCorrecta) {
				System.out.println("El aula introducida no existe");
			}else {
				String [] aulaSeleccionada =  colegio[aula-1];
				boolean aulaCompleta = true;
				
				for (int i = 0; i < aulaSeleccionada.length; i++) {
					if (aulaSeleccionada[i]==null) {
						if (accion.equals(INSERTAR)) {
							aulaSeleccionada[i] = Utils.pideValor("Introduce el nombre del alumno "+ (i+1));
						}
						aulaCompleta = false;
						//break;
						i=aulaSeleccionada.length;
					}else {
						if (accion.equals(MOSTRAR)) {
							System.out.println("Alumno"+aulaSeleccionada[i]);
						}
					}
				}
				
				if(aulaCompleta && accion.equals(INSERTAR) ) {
					System.out.println("El aula está llena");
				}
				
			}
			
		}while(!aulaCorrecta);
		
		
	}
	
	static void operarSobreAlumno(String [][] colegio,String accion) {
		
		String nombreABuscar = Utils.pideValor("Introduce Nombre del alumno a "+accion);
		boolean alumnoEncontrado = false;
		
		for (int i = 0; i < colegio.length; i++) {//Filas
			for (int j = 0; j < colegio[i].length; j++) {//Columnas
				String nombreAlumno =colegio[i][j];
				if (nombreAlumno!=null && nombreAlumno.equals(nombreABuscar)) {
					
					if(accion.equals(BUSQUEDA)) {
						System.out.println("Alumno encontrado en el aula "+ (i+1));
					}else if(accion.equals(BORRADO)) {
						colegio[i][j] = null;
						System.out.println("Alumno borrado");
					}
					
					alumnoEncontrado = true;
					//Establezco valores a i y j para que las condiciones 
					//de los bucles no se cumplan y deje de ejecutarse
					j = colegio[i].length;
					i = colegio.length-1;
				}
			}
		}
		
		if(!alumnoEncontrado) {
			System.out.println("El alumno "+nombreABuscar + " no está en el colegio");
		}
		
		
	}
	
	
	static void borrarAlumno(String [][] colegio) {
		boolean alumnoEncontrado = false;
		String nombreABorrar = Utils.pideValor("Introduce Nombre del alumno a borrar");
		for (int i = 0; i < colegio.length; i++) {//Filas
			for (int j = 0; j < colegio[i].length; j++) {//Columnas
				String nombreAlumno =colegio[i][j]; 
				if (nombreAlumno!=null && nombreAlumno.equals(nombreABorrar)) {
					colegio[i][j] = null;
					alumnoEncontrado = true;
					//Establezco valores a i y j para que las condiciones 
					//de los bucles no se cumplan y deje de ejecutarse
					j = colegio[i].length;
					i = colegio.length;
				}
			}
		}
		
		if(!alumnoEncontrado) {
			System.out.println("El alumno "+nombreABorrar + " no está en el colegio");
		}
	}
	
	static void buscarAlumno(String [][] colegio) {
		
		String nombreABuscar = Utils.pideValor("Introduce Nombre del alumno a buscar");
		
		int contadorAula=0;
		boolean alumnoEncontrado = false;
		
		for (String[] aula : colegio) {
			contadorAula++;
			for (String alumno : aula) {
				if (alumno!=null && alumno.equals(nombreABuscar)) {
					System.out.println("Alumno encontrado en el aula "+ contadorAula);
					alumnoEncontrado = true;
					break;
				}
			}
			if(alumnoEncontrado) {
				break;
			}
		}
		
		if(!alumnoEncontrado) {
			System.out.println("El alumno "+nombreABuscar + " no está en el colegio");
		}
	}
	
	
	static boolean validaAula (int aula, String [][] colegio) {
		return aula<=colegio.length && aula>0;
	}
}







