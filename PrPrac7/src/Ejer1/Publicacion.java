package Ejer1;

public class Publicacion {
	protected String codigoISBN;
	protected String titulo;
	protected String fecha;
	
	public Publicacion(String codigoISBN, String titulo, String fecha) {
		super();
		this.codigoISBN = codigoISBN;
		this.titulo = titulo;
		this.fecha = fecha;
	}

	public String getCodigoISBN() {return codigoISBN;}
	public void setCodigoISBN(String codigoISBN) {this.codigoISBN = codigoISBN;}
	public String getTitulo() {return titulo;}
	public void setTitulo(String titulo) {this.titulo = titulo;}
	public String getFecha() {return fecha;}
	public void setFecha(String fecha) {this.fecha = fecha;}

	@Override
	public String toString() {
		return "Publicacion [codigoISBN=" + codigoISBN + ", titulo=" + titulo + ", fecha=" + fecha + "]";
	}
	
	
	
	
	
}	
