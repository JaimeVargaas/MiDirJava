package vinos;

public class Reserva extends Vino {
	
	//varaibles de instancia 
	private String denominacion;


	//Constructor 
	public Reserva(String nombreVino, Vendimia ven, Enologo eno, int maduracion, String tipoVino, float alcohol,
			String denominacion) {
		super(nombreVino, ven, eno, maduracion, tipoVino, alcohol);
		this.denominacion = denominacion;
	}

	
	//metodos getter's and setter's
	public String getDenominacion() {return denominacion;}


	public void setDenominacion(String denominacion) {this.denominacion = denominacion;}
	
	
	//toString redefinido
	@Override
	public String toString() {
		return super.toString()+"\n\tDenominacion de origen:"+this.denominacion;
	}

}
