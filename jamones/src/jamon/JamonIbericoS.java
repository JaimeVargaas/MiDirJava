package jamon;

public class JamonIbericoS extends Cerdo {
	/**
	 * Variables de instancia
	 */

	private String tipo;

	/**
	 * Constructor
	 */
	public JamonIbericoS(String ni, Granja g, double pa, char s,String tipo) {
		super(ni, g, pa, s);
		this.tipo = tipo;
		super.setRaza("Iberico");
	}

	/**
	 * toString
	 */
	@Override
	public String toString () {
		return super.toString()+
				"\n\tTipo:"+this.tipo;
	}



	/**
	 * añadir dinero
	 */
	public double calcularPrecio() {
		double precio = super.Precio();
		if(this.tipo=="Cebo") {
			precio+=5;
		}
		if(this.tipo=="Cebo campo") {
			precio+=10;
		}
		if(this.tipo=="Recebo"){
			precio+=15;
		}
		if(this.tipo=="Bellota") {
			precio+=5;
		}
		return precio;
	}



}



