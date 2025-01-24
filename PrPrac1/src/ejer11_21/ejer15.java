package ejer11_21;

import java.util.Locale;
import java.util.Scanner;

public class ejer15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float base;
		float altura;
		float superficie;
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		System.out.print("Introduce la base: ");
		base = sc.nextFloat();
		
		System.out.print("Introduce la altura: ");
		altura = sc.nextFloat();
		
		superficie = (base * altura)/2; 
		System.out.println("La superficie es " + superficie);
				
		sc.close();
		
		
		
	}

}
