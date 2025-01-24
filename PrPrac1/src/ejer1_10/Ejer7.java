package ejer1_10;

import java.util.Locale;
import java.util.Scanner;

public class Ejer7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int naranjas1;
		int naranjas2; 
		int limones1;
		int limones2;
		float precionar;
		float preciolim;
		double totalnar;
		double totallim;
		double total;
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("Introduce cuantos kilos de naranjas has vendido en el primer semestre: ");
		naranjas1 = sc.nextInt();
		System.out.print("Introduce cuantos kilos de naranjas has vendido en el segundo semestre: ");
		naranjas2 = sc.nextInt();  
		
		
		System.out.print("Introduce cuantos kilos de limones has vendido en el primer trimestre: ");
		limones1 = sc.nextInt();
		System.out.print("Introduce cuantos kilos de limones has vendido en el segundo trimestre: ");
		limones2 = sc.nextInt();
	
		precionar = 1.25f;
		preciolim = 1.90f; 
		
		totalnar = (naranjas1 + naranjas2) * precionar;
		totallim = (limones1 + limones2) * preciolim;
		total = totalnar + totallim;
		
		System.out.print("El beneficio de este año es: " + total + "€");
		
		
		sc.close();
		
		
		
	}

}
