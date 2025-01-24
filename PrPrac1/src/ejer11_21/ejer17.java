package ejer11_21;

import java.util.Locale;
import java.util.Scanner;

public class ejer17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a;
		float b;
		float c;
		float d;
		float resultado;
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.UK);
		
		System.out.print("Introduce un número: ");
		a = sc.nextFloat();
		
		System.out.print("Introduce un número: " );
		b = sc.nextFloat();
		
		System.out.print("Introduce un número: " );
		c = sc.nextFloat();
		
		System.out.print("Introduce un número: " );
		d = sc.nextFloat();
		
		resultado =(float) (Math.pow(a, b) + Math.pow(c,d)) * (float)(Math.pow(a,c) + Math.pow(b,d));
		
		System.out.println("El resultado de la fórmula es: " + resultado);
		
		sc.close();
		
		
		
	}

}
