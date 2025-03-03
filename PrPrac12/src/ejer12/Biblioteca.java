package ejer12;

import java.util.*;

public class Biblioteca implements InterfazBiblioteca {
	
	private List<Usuario> usuario = new ArrayList<Usuario>();
	private SortedSet<Libro> libro = new TreeSet<Libro>();
	

	
	public Biblioteca(List<Usuario> usuario, SortedSet<Libro> libro, List<Libro> librosPrestados) {
		super();
		this.usuario = usuario;
		this.libro = libro;
	}
	
	public List<Usuario> getUsuario() {return usuario;}
	public void setUsuario(List<Usuario> usuario) {this.usuario = usuario;}
	public SortedSet<Libro> getLibro() {return libro;}
	public void setLibro(SortedSet<Libro> libro) {this.libro = libro;}

	@Override
	public boolean altaUsuario(Usuario usu) {
		// TODO Auto-generated method stub
		return usuario.add(usu);
	}

	@Override
	public boolean altaLibro(Libro lib) {
		// TODO Auto-generated method stub
		return libro.add(lib);
	}

	@Override
	public Libro sacarLibro(String tit) {
		Libro res = null;
		for (Libro lib : libro) {
			if(lib.getTitulo().equals(tit)) {
				res = lib;
				libro.remove(lib);
			}
		}
		return res;
	}

	@Override
	public Usuario buscarUsuario(String nom) {
		Usuario res = null;
		for (Usuario u : usuario) {
			if(u.getNombre().equals(nom)) 
			res = u;
		}
		return res;
	}

	@Override
	public boolean prestarLibro(String titulo, String nombre) {
		Usuario usu1 = this.buscarUsuario(nombre);
		if (usu1 == null)
			return false;
		
		Libro lib1 = this.sacarLibro(titulo);
		if (lib1 == null)
			return false;
		
		if(!usu1.sacaLibro(lib1)) { // no se ha podido sacar el libro por este usuario
			this.altaLibro(lib1);
			return false;
		}
		
		return true;
	}
	


	@Override
	public boolean devolverLibro(String titulo, String nombre) {
		Usuario usu = this.buscarUsuario(nombre);
		if(usu==null)
			return false;
				
		Libro lib = usu.devuelveLibro(titulo);
		if (lib==null)
			return false;
		
		return true;
		
	}

	@Override
	public String librosDisponibles() {
		return libro.toString();
	}

	@Override
	public String librosPrestadosUsuario(String nombre) {
		Usuario usu = this.buscarUsuario(nombre);
		if (usu == null)
			return null;
		
		return usu.toString();
		
	}

	@Override
	public SortedSet<Libro> copias(String titulo) {
		SortedSet<Libro> copias = new TreeSet<Libro>();
		copias.addAll(libro);
		
		for(Libro lib : copias) {
			if(!lib.getTitulo().equals(titulo))
				copias.remove(lib);
		}
		
		return copias;
	}

	@Override
	public Set<Libro> getLibrosUsuario(String nomCli) {
		Usuario usu = this.buscarUsuario(nomCli);
		if (usu == null)
			return null;
		
		return usu.getLista();
	}
	
}
