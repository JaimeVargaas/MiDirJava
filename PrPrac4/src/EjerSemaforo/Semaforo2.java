package EjerSemaforo;

public class Semaforo2 {

	/*
	 * Variables de instancia 
	 */
	private String colorSemaforo;
	
	/*
	 * Constructor 1, inicializa la variable de instancia con el valor recibido
	 */
	public Semaforo2(String colorSemaforo){
		this.colorSemaforo = colorSemaforo;
	}
	
	// Constructor por defecto, sin parametros
	public Semaforo2() {
		this.colorSemaforo="Rojo";
	}
	
	
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
		
		String cadena;
		
		switch (this.colorSemaforo) {
		case "Rojo" -> cadena = "Atención, el semáforo está en Rojo";
		case "Amarillo" -> cadena = "Precaución, el semáforo está a punto de cambiar";
		case "Verde" -> cadena = "Puede pasar, el semáforo está en verde";
		default -> cadena = "El semáforo está averiado";
		}
		
		return cadena;
		
	}

	


}
