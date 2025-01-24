package Ejer1;

public class Libro extends Publicacion implements Prestable {

	public boolean prestado;
	
	public Libro(String codigoISBN, String titulo, String fecha, boolean prestado) {
		super(codigoISBN, titulo, fecha);
		this.prestado = prestado;
	}

	@Override
	public void presta() {
		if (this.prestado == true)
			System.out.println("El libro está prestado");
		else 
			System.out.println("El libro no está prestado");
	}

	@Override
	public void devuelve() {
		if (this.prestado == false)
			System.out.println("El libro se ha devuelto");
		else
			System.out.println("El libro no se ha devuelto");
	}

	@Override
	public boolean estaPrestado() {
		return this.prestado;
	}

	@Override
	public String toString() {
		return super.toString()+"prestado=" + prestado;
	}

	
	

}
