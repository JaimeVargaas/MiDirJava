package ejer1_10;

import java.util.Locale;
import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte edad;
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("Introduce tu edad: ");
		edad = sc.nextByte();
		
		String resultado = (edad >= 18) ? "Eres mayor de edad." : "Eres menor de edad.";
		
		System.out.println(resultado);
		
		
		
		
		
		sc.close();
		
	}

}
