package Ejer26_36;

import java.util.Scanner;

public class Ejer26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		
		Scanner sc = new Scanner(System.in);
		
		// primera version
	/*	System.out.println("Introduce un número: ");
		num1 = sc.nextInt();
	
		for (int cont=0;cont<num1;cont++) {
			System.out.println(cont);
			cont++;
		}
		System.out.println(); */
			
		// segunda versión 
		System.out.println("Introduce un número: ");
		num1 = sc.nextInt();
		if (num1%2 != 0)
			num1 = num1 - 1;
	
		
		for (int cont = num1;cont>0;cont-=2) {
				System.out.println(cont);
			}
				
		
		
		sc.close();
	}

}
