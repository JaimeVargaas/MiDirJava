package Ejer4_14;

import java.util.Locale;
import java.util.Scanner;

public class Ejer11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float num;
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.UK);
		System.out.print("Introduce un número: ");
		num = sc.nextFloat();
		
		if (num < 1 && num > -1)
			System.out.println("Es un número casi-cero: ");
		else 
			System.out.println("No es un número casi-cero");
		
		sc.close();
		
	}

}
