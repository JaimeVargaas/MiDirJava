package Ejer4_14;

import java.util.Locale;
import java.util.Scanner;

public class Ejer7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float num;
		float divi;
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.UK);
		System.out.print("Introduzca un número: ");
		num = sc.nextFloat();
		
		divi = num % 2;
		
		if (divi == 0)
			System.out.println("El número introducido es par");
		else 
			System.out.println("El número introducido es impar");
		
		
		System.out.println((num%2)==0? "El número es par":"El número es impar");
		
		
		
		
		
		sc.close();
	
		
	}

}
