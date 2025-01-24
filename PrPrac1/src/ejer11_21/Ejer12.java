package ejer11_21;

import java.util.Locale;
import java.util.Scanner;

public class Ejer12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float horas;
		int cobrar;
		float impuestos;
		float sueldo;
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		System.out.print("Cuántas horas has trabajado esta semana: ");
		horas = sc.nextFloat();
		
		System.out.print("Cuánto cobras por hora: ");
		cobrar = sc.nextInt();
		
		impuestos = ((horas * cobrar)*11) / 100;
		
		sueldo = cobrar * horas - impuestos;
		
		System.out.println("Cobras " + sueldo + "€ por semana");
		
		sc.close();
		
	}

}
