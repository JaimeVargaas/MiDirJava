package Ejer26_36;

import java.util.Scanner;

public class Ejer33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base, exp, cont = 0, sol;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la base: ");
		base = sc.nextInt();
		
		System.out.println("Introduce el exponente: ");
		exp = sc.nextInt();
		
		
		while (cont <= exp) {
			sol = (int)Math.pow(base, cont);
			System.out.println(base + "^" + cont + "=" + sol);
			cont++;
			
		}
		 
		
		sc.close();
	}

}
