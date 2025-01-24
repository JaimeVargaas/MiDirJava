package Ejemplos;

import java.util.Random;

public class Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Generar números aleatorios con metodos de la clase Random
		Random obAleatorio = new Random();
		
	
	
		System.out.println("Aleatorio entre 0 y 9 " +  obAleatorio.nextInt(10));
		System.out.println("Aleatorio entre 1 y 10 " + (obAleatorio.nextInt(10)+1));
		System.out.println("Aleatorio entre 10 y 30 " + (obAleatorio.nextInt(21)+10));
		System.out.println("Dado " + (obAleatorio.nextInt(6)+1));
		System.out.println("Moneda " + (obAleatorio.nextInt(2)));
		
		int moneda = obAleatorio.nextInt(2);
		System.out.println("Moneda " + (moneda==0 ? "Cara":"Cruz"));
		
		if (obAleatorio.nextBoolean()==true)
			System.out.println("Cara");
		
		System.out.println("Cruz");
		
	}

}
