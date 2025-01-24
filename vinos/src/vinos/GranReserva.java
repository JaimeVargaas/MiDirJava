package vinos;

public class GranReserva extends Reserva {
	
	//varaibles de instancia 
	private String tipoTonel;
	
	//Constructor 
	public GranReserva(String nombreVino, Vendimia ven, Enologo eno, int maduracion, String tipoVino, float alcohol,
			String denominacion, String tipoTonel) {
		super(nombreVino, ven, eno, maduracion, tipoVino, alcohol, denominacion);
		this.tipoTonel = tipoTonel;
	}

	
	//metodos getter's and setter's 
	public String getTipoTonel() {return tipoTonel;}

	public void setTipoTonel(String tipoTonel) {this.tipoTonel = tipoTonel;}

	
	//Si disponemos de esta última información el cálculo del
	//costo bruto del vino se ve incrementado en 4€ si su tonel es de tipo “Barril”.
	
	@Override
	public double precioBruto() {
		if(this.tipoTonel=="Barril") {
			return super.precioBruto()+4;
		}
		return super.precioBruto();
	}
	
	
	//metodo toString 
	@Override
	public String toString() {
		return super.toString()+"\n\tTipo de Tonel:"+this.tipoTonel;
	}
}
