package ejer1_10;

import java.util.Locale;
import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cateto1;
		int cateto2;
		double hipotenusa;
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("Introduzca el cateto 1: ");
		cateto1 = sc.nextInt();
		
		System.out.print("Introduzca el cateto 2: ");
		cateto2 = sc.nextInt();
		
		hipotenusa =  Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
		
		System.out.println("El resultado de la hipotenusa es: " + hipotenusa);
		
		sc.close();
		
		
	}

}
