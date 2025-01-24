package EjerCuenta;

public class Cuenta {
	private int numCuenta;
	private String nombreTitular;
	private float saldo;
	private static final float INTERES;
	private static double disponibleBanco;
	
	static {
		INTERES = 1.03f;
		disponibleBanco=0;
	}
	
	public Cuenta(int numCuenta, String nombreTitular, float saldo) {
		this.numCuenta = numCuenta;
		this.nombreTitular = nombreTitular;
		this.saldo = saldo;
	}
	
	public void ingreso(float num) {
		this.saldo = (this.saldo + num);
		this.disponibleBanco = this.saldo + num;
	}
	
	public void reintegro(int num) {
		if (num > this.saldo)
			System.out.println("No tienes dinero suficiente en la cuenta");
		else 
			this.saldo = (this.saldo - num);	
		
		this.disponibleBanco= this.saldo - num;
	}
	
	public void reseteaAcumuladorBanco() {
		this.disponibleBanco=0;
	}
	
	public float calcularIntereses() {
		return (this.saldo * INTERES);
	}

	public int getNumCuenta() {return numCuenta;}
	public void setNumCuenta(int numCuenta) {this.numCuenta = numCuenta;}
	
	public String getNombreTitular() {return nombreTitular;}
	public void setNombreTitular(String nombreTitular) {this.nombreTitular = nombreTitular;}
	
	public float getSaldo() {return saldo;}
	public void setSaldo(float saldo) {this.saldo = saldo;}
	
	public boolean equals(Object ob) {	
		Cuenta otraCuenta = (Cuenta)ob;
		
		if (this.numCuenta == (otraCuenta.getNumCuenta()) &&
			this.nombreTitular.equals(otraCuenta.getNombreTitular()) == true)
		    return true;
		else 
			return false;
	}

	@Override
	public String toString() {
		return "Datos de cuenta Bancaria" + 
				"\n\tNº de cuenta: " + numCuenta + 
				"\n\tTitular: " + nombreTitular + 
				"\n\tSaldo: " + saldo + 
				"\n\tInterés obtenido: " + this.calcularIntereses();
	}
	
	@Override
	public void finalize() throws Throwable{
	    System.out.println("Objeto destruido. \n\tNumero Cuenta: " + this.numCuenta);
	}
	
	
	
}
