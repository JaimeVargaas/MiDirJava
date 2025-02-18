package ejer12;

import java.util.*;

public class Libro {
	private String codigo;
	private String titulo;
	private String nombre;
	
	private List<String> ListaPersonajes = new ArrayList<>();

	public Libro(String codigo, String titulo, String nombre, List<String> listaPersonajes) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.nombre = nombre;
		ListaPersonajes = listaPersonajes;
	}

	public String getCodigo() {return codigo;}
	public void setCodigo(String codigo) {this.codigo = codigo;}
	public String getTitulo() {return titulo;}
	public void setTitulo(String titulo) {this.titulo = titulo;}
	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	public List<String> getListaPersonajes() {return ListaPersonajes;}
	public void setListaPersonajes(List<String> listaPersonajes) {ListaPersonajes = listaPersonajes;}

	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(codigo, other.codigo);
	}

	@Override
	public String toString() {
		return this.codigo + ": " + this.titulo + " (escrito por " + this.nombre + this.ListaPersonajes + ")";
	}

	
	
	
	
}
