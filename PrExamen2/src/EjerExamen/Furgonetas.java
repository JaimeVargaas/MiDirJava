package EjerExamen;

public class Furgonetas extends Vehiculo {
	private byte volumenDeCarga;
	
	public Furgonetas(String matricula, String modelo, byte numPlazas, double precioPorDia, float consumoPorKm,byte volumenDeCarga) {
		super(matricula, modelo, numPlazas, precioPorDia, consumoPorKm);
		this.volumenDeCarga = volumenDeCarga;
	}
	public double getVolumenDeCarga() {return volumenDeCarga;}
	public void setVolumenDeCarga(byte volumenDeCarga) {this.volumenDeCarga = volumenDeCarga;}
	
	@Override
	public String toString() {
			return "FURGONETA: " + super.getMatricula() + " - " + super.getModelo() +
					"\n\tImpuestos anuales: " + this.impuestoAnual() +
					"\n\tPrecio alquiler diario: " + super.getPrecioPorDia() + 
					"\n\tNúmero de plazas: " + super.getNumPlazas() + 
					"\n\tVolumen de Carga: " + this.volumenDeCarga + " mt. cúbicos";
	}
	
	@Override
	public double impuestoAnual() {
		double plazas = (super.getNumPlazas() * 10);
		double total = plazas;
		
		if (volumenDeCarga > 5)
			total = total +100;
		else
			total = total +50;
		
		return total;
	
	}	
	
	
	
	
}
