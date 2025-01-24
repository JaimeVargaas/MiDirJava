package Ejemplos;

public class Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Generación de números aleatorios con el método
		// random de la clase Math
		double num = Math.random();
		
		System.out.println("Número aleatorio: " + num);
		System.out.println("Aleatorio entre 0 y 9 " + Math.floor(Math.random()*10));
		System.out.println("Aleatorio entre 1 y 10 " + (int)(Math.random()*10+1));
		System.out.println("Aleatorio entre 10 y 30 " + (int)(Math.random()*21+10));
		System.out.println("Dado " + (int)(Math.random()*6+1));
		System.out.println("Moneda " + (int)(Math.random()*2));
		
		int moneda = (int)(Math.random()*2);
		System.out.println("Moneda " + (moneda==0 ? "Cara":"Cruz"));
		
	}

}
