package vinos;

public class Enologo {
	
	
	//variables de instancia 
	private String nombre;
	private double minuta;
	private boolean colegiado;


	//COnstructores 
	//1-
	public Enologo(String nombre, double minuta, boolean colegiado) {
		this.nombre = nombre;
		this.minuta = minuta;
		this.colegiado = colegiado;
	}
	
	//2-
	public Enologo(String nombre, double minuta) {
		this.nombre = nombre;
		this.minuta = minuta;
		this.colegiado = false;

	}
	
	//metodos getter's and setter's 

	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}

	public double getMinuta() {return minuta;}
	public void setMinuta(double minuta) {this.minuta = minuta;}

	public boolean isColegiado() {return colegiado;}
	public void setColegiado(boolean colegiado) {this.colegiado = colegiado;}
	
	
	//metodo del colegiado 
	public String cole() {
		if(this.colegiado==true) {
			return "Colegiado";
		}
		return "No colegiado";
	}
	
	//Metodo toString redefinido 
	@Override 
	public String toString() {
		return this.nombre+"-"+this.minuta+"-"+this.cole();
	}

	//Metodo equals redefinidio 
	//Método equals, consideraremos que dos enólogos son iguales si coincide su nombre y su minuta.
	
	@Override 
	public boolean equals(Object ob) {
		Enologo e = (Enologo)ob;
		
		if(this.nombre.equals(e.nombre)&&this.minuta == e.minuta){
			return true;
		}
		return false;
	}
}
