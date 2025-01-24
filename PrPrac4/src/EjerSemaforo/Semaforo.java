package EjerSemaforo;

public class Semaforo {

	/*
	 * Variables de instancia 
	 */
	private String colorSemaforo = "Rojo";
	
	/*
	 * Método get, para consultar el valor de la variables
	 */
	public String getColor() {
		return this.colorSemaforo;
	}
	
	/*
	 * Método que permite modificar el color del Semaforo
	 */
	public void setColor(String nuevoColor) {
		this.colorSemaforo = nuevoColor;
	}
	
	/*
	 * Método que comprueba si un coche puede pasar o no
	 */
	
	public boolean puedoPasar() {
	
		if(colorSemaforo.equals ("Verde"))
			return true;
		else 
			return false;
	}

	/*
	 * Redefinicion de toString
	 */
	
	@Override
	public String toString() {
		return "Semaforo [colorSemaforo=" + colorSemaforo + "]";
	}

	


}
