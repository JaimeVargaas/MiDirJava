package ejer1_10;

import java.util.Locale;
import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float nota1;
		float nota2;
		float nota3;
		
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("Introduzca la primera nota; ");
		nota1 = sc.nextFloat();
		
		System.out.print("Introduzca la segunda nota; ");
		nota2 = sc.nextFloat();
		
		System.out.print("Introduzca la tercera nota; ");
		nota3 = sc.nextFloat();
		
		System.out.println("Su media aritmetica es de: " + ((nota1+nota2+nota3)/3));
		
		sc.close();
		
	}

}
