package Ejer2;

public class Cuenta {
	public String numCuenta;
	public String nombreTitular;
	public double saldoActual;
	public int numSecreto;
	public Cuenta(String numCuenta, String nombreTitular, double saldoActual, int numSecreto) {
		super();
		this.numCuenta = numCuenta;
		this.nombreTitular = nombreTitular;
		this.saldoActual = saldoActual;
		this.numSecreto = numSecreto;
	}
	
	public String getNumCuenta(){return numCuenta;}
	public void setNumCuenta(String numCuenta) {this.numCuenta = numCuenta;}
	public String getNombreTitular() {return nombreTitular;}
	public void setNombreTitular(String nombreTitular) {this.nombreTitular = nombreTitular;}
	public double getSaldoActual() {return saldoActual;}
	public void setSaldoActual(double saldoActual) {this.saldoActual = saldoActual;}
	public int getNumSecreto() {return numSecreto;}
	public void setNumSecreto(int numSecreto) {this.numSecreto = numSecreto;}
	
	public void imposicion(double cantidad) {
		saldoActual=cantidad + saldoActual;
	}
	
	public void reintegro(double cantidad) {
		saldoActual=saldoActual - cantidad;
	}

	@Override
	public String toString() {
		return "Cuenta [numCuenta=" + numCuenta + ", nombreTitular=" + nombreTitular + ", saldoActual=" + saldoActual + "]";
	}
	
	public boolean equals(Object ob) {	
		Cuenta otraCuenta = (Cuenta)ob;
		
		if (this.numCuenta == (otraCuenta.getNumCuenta()) &&
			this.nombreTitular.equals(otraCuenta.getNombreTitular()) == true)
		    return true;
		else 
			return false;
	}

	public boolean validar(int clave) {
		if (clave == numSecreto)
			return true;
		else 
			return false;
	}
	
	
	
	
	
	
}
