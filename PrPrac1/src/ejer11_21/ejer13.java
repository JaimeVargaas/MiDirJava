package ejer11_21;

import java.util.Locale;
import java.util.Scanner;

public class ejer13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float segundos;
		float minutos;
		float totalSegundos;
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		System.out.print("Introducir segundos: ");
		totalSegundos = sc.nextInt();
		
		minutos = totalSegundos / 60;
		segundos = totalSegundos % 60;
		
		System.out.println("Son " + minutos + " minutos" + " y " + segundos + " segundos");
		
		sc.close();
		
		
		
	}

}
