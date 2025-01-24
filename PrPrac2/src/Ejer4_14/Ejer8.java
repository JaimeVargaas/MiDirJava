package Ejer4_14;

import java.util.Locale;
import java.util.Scanner;

public class Ejer8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float num1;
		float num2;
		float divi;
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.UK);
		System.out.print("Introduce el primero número: ");
		num1 = (float) sc.nextFloat();
		
		System.out.print("Introduce el segundo número: ");
		num2 = (float) sc.nextFloat();
		
		
		divi = num1 % num2;
		
		if (divi == 0)
			System.out.println("Divide de forma entera.");
		else
			System.out.println("No divide de forma entera");
		
		
		
		
		
		sc.close();
	
		
	}

}
