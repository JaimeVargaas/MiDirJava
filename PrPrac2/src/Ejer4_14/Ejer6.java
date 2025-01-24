package Ejer4_14;

import java.util.Locale;
import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float num1;
		float num2;
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.UK);
		System.out.print("Introduce el primer número: ");
		num1 = sc.nextFloat();
		
		System.out.print("Introduce el segundo número: ");
		num2 = sc.nextFloat();
		
		if (num1>num2) 
			System.out.println(num1 + (" es mayor que " + num2));
		else 
			if (num2>num1)
				System.out.println(num2 + (" es mayor que " + num1));
			else
				System.out.println(num1 + "son iguales" + num2);
		
		
		sc.close();
		
		
	}

}
