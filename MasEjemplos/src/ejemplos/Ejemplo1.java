package ejemplos;

public class Ejemplo1 {
	/**
	 * Método de clase que averigua el menor de dos valores recibidos
	 * como parámetros
	 * @param x
	 * @param y
	 * @return --> devuelve el menor de los valores
	 */
	public static int minimo(int x, int y) {
		if (x < y)
			return x;
		else
			return y;
	}
	/**
	 * Método principal
	 */
	public static void main(String[] args) {
		int menor = minimo(10,7);
		System.out.println("El valor menor es: " + menor);

		System.out.println("El menor de 8 y 10 es: " + minimo(8,10));    
	}
}
	

