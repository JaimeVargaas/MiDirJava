package vinos;

public class Vendimia {

	
	
	//variables de instancia 
	private String descripcion;
	private boolean recogida;
	private boolean uva;
	

	//Constructores
	//1-
	public Vendimia(String descripcion, boolean recogida, boolean uva) {
		this.descripcion = descripcion;
		this.recogida = recogida;
		this.uva = uva;
	}
	
	//2-
	public Vendimia(String descripcion, boolean uva) {
		super();
		this.descripcion = descripcion;
		this.recogida=true;
		this.uva = uva;
	}
	
	//3-
	public Vendimia(String descripcion) {
		super();
		this.descripcion = descripcion;
		this.recogida=true;
		this.uva=true;
		
	}
	
	//getter's and setter's 

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isRecogida() {
		return recogida;
	}

	public void setRecogida(boolean recogida) {
		this.recogida = recogida;
	}

	public boolean isUva() {
		return uva;
	}

	public void setUva(boolean uva) {
		this.uva = uva;
	}
	
	
	//Metodo de la recogida 
	private String reco() {
		if(this.recogida==true) {
			return "Mecanico";
		}
		return "Manual";
	}
	
	//metodo de la uva 
	private String uvita() {
		if(this.uva==true) {
			return "Blanca";
		}
		return "Negra";
	}
	
	//metodo toString 
	@Override 
	public String toString() {
		return this.getClass().getSimpleName().toUpperCase()+ 
				"\n\tDescripcion:"+this.descripcion+
				"\n\tRecogida:"+this.reco()+
				"\n\tTIpo Uva:"+this.uvita();
	}
	
}
