package ejer11_21;

import java.util.Locale;
import java.util.Scanner;

public class ejer16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float u;
		float v; 
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.UK);
		System.out.print("Introduzca el primer valor: ");
		u = (float)sc.nextFloat();
			
		System.out.print("Introduzca el segundo valor: ");
		v = (float)sc.nextFloat();
		
		u = (float)v;
		v = (float)u;
		
		System.out.println("u = " + u + " v = " + v);
		
		sc.close();
		
		
		
	}

}
