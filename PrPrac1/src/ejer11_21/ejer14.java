package ejer11_21;

import java.util.Locale;
import java.util.Scanner;

public class ejer14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float num1;
		float num2;
		float suma;
		float resta;
		float multi;
		float divi;
		
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("Introduce un número: ");
		num1 = sc.nextInt();
		
		System.out.print("Introduce otro número: ");
		num2 = sc.nextInt()	;	
		
		suma = num1 + num2;
		resta = num1 - num2;
		multi = num1 * num2;
		divi = num1 / num2;
		
		System.out.println(num1 + " + " + num2 + " = " + suma);
		System.out.println(num1 + " - " + num2 + " = " + resta);
		System.out.println(num1 + " * " + num2 + " = " + multi);
		System.out.println(num1 + " / " + num2 + " = " + divi);
		
		sc.close();
		
		
		
	}

}
