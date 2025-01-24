package EjerExamen;

public class Turismos extends Vehiculo {
	public String clasificacion;
	public boolean electrico;
	
	public Turismos(String matricula, String modelo, byte numPlazas, double precioPorDia, float consumoPorKm, 
			String clasificacion, boolean electrico) {
		super(matricula, modelo, numPlazas, precioPorDia, consumoPorKm);
		this.clasificacion = clasificacion;
		this.electrico = electrico;
	}
	public String getClasificacion() {return clasificacion;}
	public void setClasificacion(String clasificacion) {this.clasificacion = clasificacion;}
	public boolean isElectrico() {return electrico;}
	public void setElectrico(boolean electrico) {this.electrico = electrico;}

	@Override
	public String toString() {
		if (electrico == true)
			return "TURISMO: " + super.getMatricula() + " - " + super.getModelo() +
					"\n\tImpuestos anuales: " + this.impuestoAnual() +
					"\n\tPrecio alquiler diario: " + this.getPrecioPorDia() + 
					"\n\tNúmero de plazas: " + this.getNumPlazas() + 
					"\n\tEléctrico"+ " - " + this.clasificacion;
			else 
				return "TURISMO: " + super.getMatricula() + " - " + super.getModelo() +
						"\n\tImpuestos anuales: " + this.impuestoAnual() +
						"\n\tPrecio alquiler diario: " + this.getPrecioPorDia() + 
						"\n\tNúmero de plazas: " + this.getNumPlazas() + 
						"\n\tTipo:"+ this.clasificacion;
	}
	
	@Override
	public double impuestoAnual() {
		double plazas = (super.getNumPlazas() * 10);
		double total = plazas;
		
		if (electrico == true)
			total = total - 20;
		else 
			total = total + 50;
		
		if (clasificacion == "SUV")
			total = total + 25;
		
		return total;
	}	
	
	
}
