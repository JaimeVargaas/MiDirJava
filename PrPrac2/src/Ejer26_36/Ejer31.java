package Ejer26_36;

import java.util.Scanner;

public class Ejer31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lista, cont=1, num;
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce los números que quieras de lista: ");
		lista = sc.nextInt();
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		do {
			cont++;
			System.out.println("Introduce el número de la lista: ");
			num = sc.nextInt();
			
			 if (num > max) {
	             max = num;
	         }
			 else if (num < min) {
	             min = num;
	             
	         }
		}
		
		while (cont<=lista);
		
		
		System.out.println("El valor máximo de la lista es: " + max);
		System.out.println("El valor mínimo de la lista es: " + min);
		
		
		sc.close();
	}

}
