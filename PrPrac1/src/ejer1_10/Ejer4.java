package ejer1_10;

import java.util.Locale;
import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double longitud;
		double area;
		float radio;
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		System.out.print("Introduzca el radio: ");
		radio = sc.nextFloat();
		
		longitud = 2 * 3.14 * Math.pow(radio, 2); 
		area = 3.14 * radio;
		System.out.println("La longitud es: " + longitud);
		System.out.println("El area es: " + area);
		
		
		
		sc.close();
		
	}

}
