package Ejer1;

public class Juego {
	private String nombre;
	private Plataforma plataforma;
	private int UnidadesVendidas;
	
	public Juego(String nombre, Plataforma plataforma, int unidadesVendidas) {
		super();
		this.nombre = nombre;
		this.plataforma = plataforma;
		UnidadesVendidas = unidadesVendidas;
	}
	
	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}

	public Plataforma getPlataforma() {return plataforma;}
	public void setPlataforma(Plataforma plataforma) {this.plataforma = plataforma;}

	public int getUnidadesVendidas() {return UnidadesVendidas;}
	public void setUnidadesVendidas(int unidadesVendidas) {UnidadesVendidas = unidadesVendidas;}

	@Override
	public String toString() {
		return this.nombre + ", " + "plataforma " + this.plataforma + ", " + this.UnidadesVendidas + " unidades vendidas";
	}
	
	
	
	
	
}
