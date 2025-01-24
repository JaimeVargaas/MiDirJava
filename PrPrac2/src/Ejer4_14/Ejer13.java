package Ejer4_14;

import java.util.Locale;
import java.util.Scanner;

public class Ejer13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float valor;
		float num;
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.UK);
		System.out.print("Introduce un número entre 1 y 3: ");
		valor = sc.nextFloat();
		
		System.out.print("Introduce un número: ");
		num = sc.nextFloat();
		
		if (valor == 1)
			System.out.println(num * num);
		else if (valor == 2)
			System.out.println(num * num * num);
		else 
			System.out.println(Math.sqrt(num));
		
		
		
		
		sc.close();
		
	}

}
