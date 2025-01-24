package jamon;

public class Granja {

	//variables de instancia 
	private String nombre;
	private boolean denominacion;
	private double precio;
	
	/*
	 * CONSTRUCTORES
	 */
	// Primer constructor
	public Granja(String n,boolean d, double p) {
		this.nombre=n;
		this.denominacion=d;
		this.precio=p;
	}
	// Segundo constructor
	public Granja(String n) {
		this.nombre=n;
		this.denominacion=false;
		this.precio=15;

	}
	
	//Metodos getter´s and setter´s
	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	public boolean getDenominacion() {return denominacion;}
	public void setDenominacion(boolean denominacion) {this.denominacion = denominacion;}
	public double getPrecio() {return precio;}
	public void setPrecio(double precio) {this.precio = precio;}
	
	//metodo de denominacion 
	private String deno() {
		if(this.denominacion== true) {
			return "con denominacion"; 
	
		}else {
			return "Sin denominacion";
		}
	}
	
	//Metodo toString 
	
	@Override
	public String toString() {
		return this.nombre+", "+deno()+"- Precio base @="+this.precio;
	}
}
