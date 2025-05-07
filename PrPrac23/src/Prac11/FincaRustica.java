package Prac11;

public class FincaRustica extends Propiedad {
	
	private TipoTerreno tipoTerreno;
	private boolean agua;
	private boolean luz;
	private boolean vivienda;
	
	public FincaRustica(int codigo, TipoPropiedad tipo, String direccion, double metros, String descripcion,
			double precio, TipoTerreno tipoTerreno, boolean agua, boolean luz, boolean vivienda) {
		super(codigo, tipo.finca, direccion, metros, descripcion, precio);
		this.tipoTerreno = tipoTerreno;
		this.agua = agua;
		this.luz = luz;
		this.vivienda = vivienda;
	}
	
	public TipoTerreno getTipoTerreno() {return tipoTerreno;}
	public void setTipoTerreno(TipoTerreno tipoTerreno) {this.tipoTerreno = tipoTerreno;}
	
	public boolean isAgua() {return agua;}
	public void setAgua(boolean agua) {this.agua = agua;}

	public boolean isLuz() {return luz;}
	public void setLuz(boolean luz) {this.luz = luz;}
	
	public boolean isVivienda() {return vivienda;}
	public void setVivienda(boolean vivienda) {this.vivienda = vivienda;}
	
	@Override
	public double beneficio() {
		double ben = super.beneficio() * 0.005;
		return (ben + super.beneficio());
	}
	
	@Override
	public String toString() {
		
		return super.toString() + 
				"\n\tTipo de terreno: " + this.tipoTerreno +
				"\n\tDispone de luz: " + (this.luz? "si" : "no") +
				"\n\tDispone de agua" + (this.agua? "si" : "no") +
				"\n\tDispone de vivienda" + (this.vivienda? "si" : "no");
	}
	
	
	
}
