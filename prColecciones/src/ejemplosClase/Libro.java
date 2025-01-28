package ejemplosClase;

public class Libro {

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
		System.out.println("El objeto se ha creado");
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
	public boolean equals(Object ob) {
		
		Libro otroLibro = (Libro)ob;
		
		if (this.Titulo.equals(otroLibro.getTitulo()) == true &&
			this.Autor.equals(otroLibro.getAutor()) == true)
		    return true;
		else 
			return false;
	}
	
	
	
	
}
