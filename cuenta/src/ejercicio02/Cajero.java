package ejercicio02;

public class Cajero implements InterfazCajero {

	//variables de instancia 
	private int b10;
	private int b20;
	private int b50;
	private int b100;

	//construcotr 
	public Cajero(int b10, int b20, int b50, int b100) {
		this.b10 = b10;
		this.b20 = b20;
		this.b50 = b50;
		this.b100 = b100;
	}

	
	//metodos getter's and setter's

	public int getB10() {
		return b10;
	}

	public void setB10(int b10) {
		this.b10 = b10;
	}

	public int getB20() {
		return b20;
	}

	public void setB20(int b20) {
		this.b20 = b20;
	}

	public int getB50() {
		return b50;
	}

	public void setB50(int b50) {
		this.b50 = b50;
	}

	public int getB100() {
		return b100;
	}

	public void setB100(int b100) {
		this.b100 = b100;
	}
	
	//metodo disponible 
	@Override
	public double disponible() {
		return this.b10*10+this.b20*20+this.b50*50+this.b100*100;
	}
	
	//metodo toString 
	@Override 
	public String toString() {
		return "Disponible en el cajero:"+
					"\n\t"+this.b10+"billetes de 10€"+
					"\n\t"+this.b20+"billetes de 20€"+
					"\n\t"+this.b50+"billetes de 50€"+
					"\n\t"+this.b100+"billetes de 100€";

	}


	//redefinimos el metodo de la interfaz sacar 
	@Override
	public 	String sacar(Cuenta c, int pin, int cantidad){

		//MALL MALL MALL
		
		
		while(this.disponible()>cantidad) {
			if(c.getSaldo()<=cantidad) {
				return("Error, no hay dinero suficiente en su cuenta");
			}
			else {
				if(c.getNumSecreto()==pin) {
					return("El pin es correcto,podemos sacar los "+cantidad+ " €");
				}
				else {
					return("ERROR, el pin no es correcto");
				}
			}


		}
		return "Error el cajero no tiene suficiente dinero";
	}
}
