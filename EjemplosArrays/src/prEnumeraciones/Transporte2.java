package prEnumeraciones;

public enum Transporte2 {
	
	COCHE(60), CAMION(50), AVION(600), TREN(70), BARCO(20);
	
	/**
	 * Variable de instancia de cada constante
	 */
	private int velocidad; //velocidad típica de cada transporte
	
	/**
	 * Constructor, se ejecutará por cada constante definida
	 * en la enumreación
	 * @param s
	 */
	Transporte2(int s){
		velocidad=s;}
	
	/**
	 * Método que se ejecuta en función de una de las constantes
	 * @return
	 */
	int getVelocidad(){return velocidad;}
}
