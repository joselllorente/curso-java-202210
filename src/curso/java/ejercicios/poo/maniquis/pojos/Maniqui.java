package curso.java.ejercicios.poo.maniquis.pojos;

public class Maniqui {
	
	//VAriables de instancia
	private long id;
	private Camisa camisa;
	private Pantalon pantalon;
	private Vestido vestido;
	
	//Constructores
	public Maniqui(long id) {
		super();
		this.id = id;
		System.out.println("Creando maniqui desnudo");
	}
	
	public Maniqui(long id, Vestido vestido) {
		super();
		this.id = id;
		this.vestido = vestido;
		System.out.println("Vistiendo al maniqui con id "+id+" con un vestido de color "+vestido.getColor());
	}

	public Maniqui(long id, Camisa camisa, Pantalon pantalon) {
		super();
		this.id = id;
		this.camisa = camisa;
		this.pantalon = pantalon;
		System.out.println("Vistiendo al maniqui con id "+id+" con un pantalon y camisa");
	}

	
	
	//Get y Set
	public Camisa getCamisa() {
		return camisa;
	}

	public void setCamisa(Camisa camisa) {
		this.camisa = camisa;
	}

	public Pantalon getPantalon() {
		return pantalon;
	}

	public void setPantalon(Pantalon pantalon) {
		this.pantalon = pantalon;
	}

	public Vestido getVestido() {
		return vestido;
	}

	public void setVestido(Vestido vestido) {
		this.vestido = vestido;

	}

	public long getId() {
		return id;
	}
	
	
	//Funciones
	public void vestir (Camisa camisa, Pantalon pantalon) {
		System.out.println("Vistiendo al maniqui con id "+this.getId()+" con un pantalon y camisa");
		desvestir();
		this.camisa = camisa;
		this.pantalon = pantalon;
	}
	
	public void vestir ( Vestido vestido) {
		System.out.println("Vistiendo al maniqui con id "+this.getId()+" con un vestido de color "+vestido.getColor());
		desvestir();
		this.vestido = vestido;
	}
	
	public void desvestir () {
		System.out.println("Desvistiendo al maniqui con id "+ this.id );
		if (tieneCamisa())
			quitarCamisa();
		
		if (pantalon!=null)
			pantalon=null;
		
		if (vestido!=null)
			vestido=null;
	}
	
	private void quitarCamisa() {
		setCamisa(null);
	}
	
	private boolean tieneCamisa() {
		return camisa!=null;
	}
	
}
