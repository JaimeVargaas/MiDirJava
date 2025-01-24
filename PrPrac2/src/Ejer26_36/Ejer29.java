package Ejer26_36;

import java.util.Scanner;

public class Ejer29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cont = 0;
		
		Scanner sc = new Scanner(System.in);
		do {	
			System.out.println("Hola");
			System.out.println("Adiós");
			cont++;
		}
		while ((int) cont<=100);
			
		sc.close();
	}

}
