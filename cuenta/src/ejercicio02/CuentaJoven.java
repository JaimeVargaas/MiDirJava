package ejercicio02;

public class CuentaJoven extends Cuenta {

	//variables de instancia 
	private int edad;
	
	//COnstructor 
	public CuentaJoven(String numCuenta, String nombre, double saldo, int numSecreto,int edad) {
		super(numCuenta, nombre, saldo, numSecreto);
		this.edad=edad;
	}
	
	//getter's and setter's
	
	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	//redefinimos el metodo de sacar dinero 
	@Override
	public void reintegro (double n) {
		if(super.getSaldo()>n) {
				//super.reintegro(n); Metodo llamado de la clase padre
				super.setSaldo(-n);
		}
		System.out.println("No hay suficiente dinero para poder retirar "+n+"€");
	}
	
	//toString 
	@Override 
	public String toString () {
		return super.toString()+"\nEdad:"+this.edad;
	}
	
	
}
