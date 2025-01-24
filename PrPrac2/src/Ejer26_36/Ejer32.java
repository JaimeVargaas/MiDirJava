package Ejer26_36;

import java.util.Scanner;

public class Ejer32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		
		
		Scanner sc = new Scanner(System.in);
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		do {
			System.out.println("Introduce el número de la lista: ");
			num = sc.nextInt();
			
			 if (num > max) {
	             max = num;
	         }
	         if (num < min) {
	             min = num;
	             
	         }
		}
		
		while (num>0 || num<0);
		
		
		System.out.println("El valor máximo de la lista es: " + max);
		System.out.println("El valor mínimo de la lista es: " + min);
		
		
		sc.close();
	}

}
