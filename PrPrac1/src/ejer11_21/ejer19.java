package ejer11_21;

import java.util.Locale;
import java.util.Scanner;

public class ejer19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Variables
		int seg;
		int hor;
		int min;
		int segu;
		
		// Scanner
		Scanner sc = new Scanner(System.in).useLocale(Locale.UK);
		
		// Pedir datos
		System.out.print("Introduce los segundos: ");
		seg = sc.nextInt();
		
		// definición de variables
		hor = seg / 3600;
		min = (seg % 3600) /60;
		segu = seg % 60;
		
		// Mostrar resultado
		System.out.println("Son " + hor + " horas " + min + " minutos " + segu + " segundos");
		
		
		sc.close();
		
		
		
	}

}
