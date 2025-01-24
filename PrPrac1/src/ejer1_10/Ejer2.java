package ejer1_10;

import java.util.Locale;
import java.util.Scanner;

public class Ejer2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		short actual;
		short nacimiento;
		int edad;
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("Introduzca el año actual: ");
		actual = sc.nextShort();
		
		System.out.print("Introduzca su año de nacimiento: ");
		nacimiento = sc.nextShort();
		
		edad = actual - nacimiento;
		System.out.print("Su edad es: " + edad);
		sc.close();
		
		
	}

}  