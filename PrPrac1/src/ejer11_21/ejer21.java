package ejer11_21;

import java.util.Locale;
import java.util.Scanner;

public class ejer21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Variables
		float einfantil;
		float enormal;
		float infantil;
		float normal;
		float totalInfantil;
		float totalNormal;
		float totalEntradas;
		float descuento;
		
		// Scanner
		Scanner sc = new Scanner(System.in).useLocale(Locale.UK);
		
		// Pedir datos
		System.out.print("Cuántas entradas infantiles quieres: ");
		einfantil = sc.nextFloat();
		
		System.out.print("Cuántas entradas normales quieres: ");
		enormal = sc.nextFloat();
		
		infantil = (float) 15.50;
		normal = (float) 20.00;
		
		totalInfantil = einfantil * infantil;
		totalNormal = enormal * normal;
	
		totalEntradas = totalInfantil + totalNormal;
		
		descuento = (totalEntradas * 5) /100;
		
		
		if (totalEntradas > 100) {
			System.out.println("Tienes un descuento de " + descuento);
			System.out.println("El precio final es: " + (totalEntradas - descuento));
		}
		
		// Mostrar resultado
		System.out.println("");
	

		
		
		sc.close();
		
		
		
	}

}
