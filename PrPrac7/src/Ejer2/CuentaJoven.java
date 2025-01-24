package Ejer2;

public class CuentaJoven extends Cuenta {
	public byte edad;

	public CuentaJoven(String numCuenta, String nombreTitular, double saldoActual, int numSecreto, byte edad) {
		super(numCuenta, nombreTitular, saldoActual, numSecreto);
		this.edad = edad;
	}
	@Override
	public void reintegro(double cantidad) {
		if (cantidad > super.getSaldoActual())
			System.out.println("No tienes dinero suficiente");
		else 
			super.saldoActual = super.saldoActual - cantidad;
	}
	
}
