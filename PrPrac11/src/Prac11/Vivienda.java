package Prac11;

public class Vivienda extends Propiedad {
	private TipoVivienda tipoVivienda;
	private int numBaños;
	private int numDormitorios;
	
	public Vivienda(int codigo, TipoPropiedad tipo, String direccion, double metros, String descripcion, double precio,
			TipoVivienda tipoVivienda, int numBaños, int numDormitorios) {
		super(codigo, tipo.vivienda, direccion, metros, descripcion, precio);
		this.tipoVivienda = tipoVivienda;
		this.numBaños = numBaños;
		this.numDormitorios = numDormitorios;
	}
	public TipoVivienda getTipoVivienda() {return tipoVivienda;}
	public void setTipoVivienda(TipoVivienda tipoVivienda) {this.tipoVivienda = tipoVivienda;}
	
	public int getNumBaños() {return numBaños;}
	public void setNumBaños(int numBaños) {this.numBaños = numBaños;}
	
	public int getNumDormitorios() {return numDormitorios;}
	public void setNumDormitorios(int numDormitorios) {this.numDormitorios = numDormitorios;}
	
	@Override
	public double beneficio() {
		double ben = super.getPrecio() * 0.0025;
		return (ben + super.beneficio());
	}
	
	@Override
	public String toString() {
		return super.toString() + 
				"\n\tNúmero de baños: " + this.numBaños +
				"\n\tNúmero de dormitorios: " + this.numDormitorios;
	}
}
