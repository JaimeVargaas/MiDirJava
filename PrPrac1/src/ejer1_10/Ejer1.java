package ejer1_10;

import java.util.Locale;
import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte edad;
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("Introduzca su edad: ");
		edad = sc.nextByte();
	
		
		System.out.print("Su edad el año que viene será: " + (edad+1));
		
		
		sc.close();
		
	}

}
