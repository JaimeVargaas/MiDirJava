package Ejer3;

import java.util.Objects;

public class Libro implements Comparable<Libro>{

	private String Autor;
	private String Titulo;
	private boolean Estado;

	public Libro(String a, String t, boolean e) {
		this.Autor=a;
		this.Titulo=t;
		this.Estado=e;
	}
	
	public Libro(String t, String a) {
		this(t,a,true);
	}
	

	public String getAutor() {
		return Autor;
	}

	public void setAutor(String autorLibro) {
		this.Autor = autorLibro;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String tituloLibro) {
		this.Titulo = tituloLibro;
	}

	public boolean getEstado() {
		return Estado;
	}

	public void setEstado(boolean estadoLibro) {
		this.Estado = estadoLibro;
	}
	
	
	@Override
	public String toString() {
		//	if (this.Estado== true)
		//		return this.Titulo+ " de " + this.Autor + " está en la biblioteca";
		//	else 
		//		return this.Titulo+ " de " + this.Autor + " está prestado";
		
		return this.Titulo + " de " + this.Autor + (this.Estado?" está en la biblioteca":" está prestado");
	}

	@Override
	public int hashCode() {
		return Objects.hash(Autor, Estado, Titulo);
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
		return Objects.equals(Autor, other.Autor) && Estado == other.Estado && Objects.equals(Titulo, other.Titulo);
	}


	@Override
	public int compareTo(Libro o) {
		int compara = this.getAutor().compareTo(o.getAutor());
		if (compara !=0) // Los autores son diferentes
			return compara;
		
		// Si era el mismo autor, compararemos por título
		return this.getTitulo().compareTo(o.getTitulo());
	}
	
	/*
	@Override
	public boolean equals(Object ob) {
		
		Libro otroLibro = (Libro)ob;
		
		if (this.Titulo.equals(otroLibro.getTitulo()) == true &&
			this.Autor.equals(otroLibro.getAutor()) == true)
		    return true;
		else 
			return false;
	}
	*/
	
	
	
	
	
	
}
