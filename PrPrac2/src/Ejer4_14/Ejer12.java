package Ejer4_14;

import java.util.Locale;
import java.util.Scanner;

public class Ejer12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		char caracter;
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Introduce el caracter: ");
			caracter = sc.nextLine().charAt(0);
			
			System.out.println("Introduce un número: ");
			num1 = sc.nextInt();
			
			System.out.println("Introduce otro número: ");
			num2 = sc.nextInt();
			
			
		if (caracter == '*') 
			System.out.println(num1 + "x" + num2 + "=" + (num1 * num2));
		
		else if (caracter == '+')
			System.out.println(num1 + "x" + num2 + "=" + (num1 + num2));
		else if (caracter == '-')
			System.out.println(num1 + "x" + num2 + "=" + (num1 - num2));
		else if (caracter == '/')
			System.out.println(num1 + "x" + num2 + "=" + (num1 / num2));
		else 
			System.out.println("Carácter inválido");
		
		}
		
	}

}
