package Ejer4_14;

import java.util.Locale;
import java.util.Scanner;

public class Ejer9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		int prov;
		int prov2;
		int top;
		int nop;
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.UK);
		System.out.print("Introduce un número de 4 digitos: ");
		num = sc.nextInt();
		
		if (num > 9999)
			System.out.println("Error: Código inválido");
		else {
			prov = num / 1000;
			prov2 = num % 1000;
			top = prov2 / 100;
			nop = prov2 % 100;
		System.out.println("Provincia: " + prov);
		System.out.println("Tipo de operación: " + top);
		System.out.println("Número de operación: " + nop);
		}
	
		
		
		sc.close();
		
	}

}
