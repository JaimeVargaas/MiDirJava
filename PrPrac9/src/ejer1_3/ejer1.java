package ejer1_3;

import java.util.Random;

public class ejer1 {

	public static void main(String[] args) {
		Random aleatorio = new Random();
		double num;
		
		num=aleatorio.nextDouble();
		System.out.println("Tiempo antes de ejecutar el programa: "+ System.nanoTime());          
		System.out.println("Clase: " + aleatorio.getClass().getSimpleName());
		System.out.println("Paquete: " + aleatorio.getClass().getPackage());
		
		  
	    System.out.println(System.nanoTime());
		
	}

}
