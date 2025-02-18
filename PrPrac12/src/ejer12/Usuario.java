package ejer12;

import java.util.*;

public class Usuario implements InterfazUsuario{

	private String nombre;
	private Set<Libro> lista = new HashSet<Libro>();
	
	public Usuario(String nombre) {
		super();
		this.nombre = nombre;
	}
	public String getNombre() {return nombre;}
	public void setNombre(String nombre) {this.nombre = nombre;}
	public Set<Libro> getLista() {return lista;}
	public void setLista(Set<Libro> lista) {this.lista = lista;}
	


	@Override
	public boolean sacaLibro(Libro lib) {
		if(this.lista.add(lib)) {

			return true;
		}
		else
			return false;
	}

	@Override
	public int cantidadLibrosSacados() {
		return lista.size();
	}

	@Override
	public boolean puedeSacarMasLibros() {
		if(this.lista.size()>10)
			return false;
		else
			return true;
	}

	@Override
	public Libro devuelveLibro(String tit) {
		Libro res = null;
		
		for(Libro lib : this.lista) {
			 lib= (Libro) lista;
			 if(lib.getTitulo().equals(tit))
				res = lib;
		 }
		return res;
	}
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(nombre.toLowerCase(), other.nombre.toLowerCase());
	}
	@Override
	public String toString() {
		String cad = null;
		for(Libro lib : this.lista) {
			cad += this.nombre + " (" + (this.lista.size()>0? lib.getTitulo():"No tiene libros sacados") +  lib.getTitulo() + "; ";
		}
		return cad += ")";
	}
	
	
	
	
}
