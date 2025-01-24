package ejercicio02;

public class Cuenta {
	//variables de instancia
	private String numCuenta;
	private String nombre;
	private double saldo;
	private int numSecreto;
	
	/**
	 * 
	 * @param numCuenta
	 * @param nombre
	 * @param saldo
	 * @param numSecreto
	 * 
	 * @author Natalia
	 */
	public Cuenta(String numCuenta, String nombre, double saldo, int numSecreto) {
		this.numCuenta = numCuenta;
		this.nombre = nombre;
		this.saldo = saldo;
		this.numSecreto = numSecreto;
	}
	
	/**
	 * Getter's and setter's
	 * @return
	 */

	public String getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumSecreto() {
		return numSecreto;
	}

	public void setNumSecreto(int numSecreto) {
		this.numSecreto = numSecreto;
	}
	
	//Metodo en el que añadimos una cantidad a la cuenta 
	public void imposicion(double n) {
		this.saldo+=n;
	}
	
	//metodo que retira una cantidad de la cuenta 
	public void reintegro (double n) {
			this.saldo-=n;
		
	}
	
	//toString redefinido 
	@Override
	public String toString() {
		return "\nNumero de cuenta: "+this.numCuenta+"\nTitular: "+this.nombre
				+"\nSaldo: "+this.saldo;
	}
	
	//Metodo equals mediante su numero de cuenta
	@Override
	public boolean equals(Object ob) {
		Cuenta miCuenta = (Cuenta)ob;
		if(this.numCuenta.equals(miCuenta.numCuenta)) {
			return true;
		}
		return false;
	}
	
	
	//Metodo validad clave 
	public void validarClave(int clave) {
		if(this.numSecreto==clave) {
			System.out.println("La clave es correcta");
		}else {
		System.out.println("La clave es incorrecta");
		}
	}
	

}
