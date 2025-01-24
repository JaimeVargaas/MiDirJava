package ejer1_10;

import java.util.Locale;
import java.util.Scanner;

public class Ejer9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte edadJuan = 20;
		byte edadPedro = 42;
		short sueldoBase = 1980;
		short complementos = 400;
		System.out.println(sueldoBase);
		
		// Salen warnings porque no se han utilizado las variables
		// Que no admitiría el número
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		System.out.print("El sueldo real del empleado de " + edadJuan + "es: " sueldoBase + complementos; 
		
		sc.close();
		
	}

}
