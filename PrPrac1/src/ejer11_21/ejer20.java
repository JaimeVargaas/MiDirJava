package ejer11_21;

import java.util.Locale;
import java.util.Scanner;

public class ejer20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Variables
		float hormigas;
		float arañas;
		float cochinillas;
		float totalPatas;
		
		// Scanner
		Scanner sc = new Scanner(System.in).useLocale(Locale.UK);
		
		// Pedir datos
		System.out.print("Introduce las hormigas capturadas: ");
		hormigas = sc.nextFloat();
		
		System.out.print("Introduce las arañas capturadas: ");
		arañas = sc.nextFloat();
		
		System.out.print("Introduce las cochinillas capturadas: ");
		cochinillas = sc.nextFloat();
		
		
		totalPatas = (hormigas * 6) + (arañas * 8) + (cochinillas * 14);
		
		// Mostrar resultado
		System.out.println("Las patas totales son " + totalPatas);
	

		
		
		sc.close();
		
		
		
	}

}
