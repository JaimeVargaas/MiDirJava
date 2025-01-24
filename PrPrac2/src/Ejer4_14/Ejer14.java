package Ejer4_14;

import java.util.Locale;
import java.util.Scanner;

public class Ejer14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float a;
		float b;
		float c;
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.UK);
		System.out.print("Introduce el lado a: ");
		a = sc.nextFloat();
		
		System.out.print("Introduce el lado b");
		b = sc.nextFloat();
		
		System.out.print("Introduce el lado c");
		c = sc.nextFloat();
		
		
		if (a >= b + c);
			System.out.println("No es un triángulo");
		if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2));
			System.out.println("Es un triángulo rectángulo");
		if (Math.pow(a, 2) > Math.pow(b, 2) + Math.pow(c, 2));
			System.out.println("Es un triángulo obtusángulo");
		if (Math.pow(a, 2) < Math.pow(b, 2) + Math.pow(c, 2));
			System.out.println("Es un triángulo acutángulo");
		
		
		sc.close();
		
	}

}
