package EjerExamen;

public class Vehiculo {
	private String Matricula;
	private String Modelo;
	private byte numPlazas;
	private double precioPorDia;
	private float consumoPorKm;

	
	public Vehiculo(String matricula, String modelo, byte numPlazas, double precioPorDia, float consumoPorKm,
			Furgonetas fur, Turismos tur) {
		super();
		Matricula = matricula;
		Modelo = modelo;
		this.numPlazas = numPlazas;
		this.precioPorDia = precioPorDia;
		this.consumoPorKm = consumoPorKm;

	}
	
	public Vehiculo(String matricula, String modelo, byte numPlazas, double precioPorDia, float consumoPorKm) {
		super();
		Matricula = matricula;
		Modelo = modelo;
		this.numPlazas = numPlazas;
		this.precioPorDia = precioPorDia;
		this.consumoPorKm = consumoPorKm;
	}
	
	
	public String getMatricula() {return Matricula;}
	public void setMatricula(String matricula) {Matricula = matricula;}
	public String getModelo() {return Modelo;}
	public void setModelo(String modelo) {Modelo = modelo;}
	public byte getNumPlazas() {return numPlazas;}
	public void setNumPlazas(byte numPlazas) {this.numPlazas = numPlazas;}
	public double getPrecioPorDia() {return precioPorDia;}
	public void setPrecioPorDia(double precioPorDia) {this.precioPorDia = precioPorDia;}
	public float getConsumoPorKm() {return consumoPorKm;}
	public void setConsumoPorKm(float consumoPorKm) {this.consumoPorKm = consumoPorKm;}

	
	public double impuestoAnual() {
		return 0;
	}
	
	public double consumo(float precio, double km) {
		return UtilidadesVehiculos.combustibleConsumido(km,consumoPorKm,(float) precio);
	}
	
	
	
	@Override
	public String toString() {
		return "Vehiculo [Matricula=" + Matricula + ", Modelo=" + Modelo + ", numPlazas=" + numPlazas
				+ ", precioPorDia=" + precioPorDia + ", consumoPorKm=" + consumoPorKm + "]";
	}

	public boolean equals(Object ob) {	
		Vehiculo otroVehiculo = (Vehiculo)ob;

		if (this.Matricula.equals(otroVehiculo.getMatricula()) == true)
		    return true;
		else 
			return false;
	}


	
	
	
	
	
}
