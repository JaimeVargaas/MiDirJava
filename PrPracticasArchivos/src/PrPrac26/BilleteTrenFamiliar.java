package PrPrac26;

public class BilleteTrenFamiliar extends BilleteTren{

	private String nombreCompleto;

	public BilleteTrenFamiliar(Punto origen, Punto destino, enumDescuento desc, String nombreCompleto) {
		super(origen, destino, desc);
		this.nombreCompleto = nombreCompleto;
	}
	
	@Override 
	public float calculaPrecio() {
		float precio = super.calculaPrecio();
		float descuento = (precio/4);
		
		return precio-descuento;
	}

	@Override
	public String toString() {
		return super.toString() + 
				"\nDescuento extra por familia: 25%" + 
				"\nFamiliar: " + this.nombreCompleto;
	}
	
	

}
