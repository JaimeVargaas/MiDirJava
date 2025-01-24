package Ejer4_14;

import java.util.Locale;
import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float num1;
		float num2;
		float num3;
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.UK);
		System.out.print("Introduce el primer número: ");
		num1 = sc.nextFloat();
		System.out.print("Introduce el segundo número: ");
		num2 = sc.nextFloat();
		System.out.print("Introduce el tercer número: ");
		num3 = sc.nextFloat();
		
		if (num1 > num2 && num1 > num3)
			System.out.println("El número más grande es: " + num1);
		else if ((num2 > num1 && num2 > num3))
			System.out.println("El número más grande es: " + num2);
		else 
			System.out.println("El número más grande es: " + num3);
		
		
		// Solución simplificada
		// int mayor = num1;
		// if (num2>mayor) mayor = num2;
		// if (num3>mayor) mayor = num2;
		
		
		sc.close();
		
	}

}
