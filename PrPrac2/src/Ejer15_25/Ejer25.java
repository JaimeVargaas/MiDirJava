package Ejer15_25;

import java.util.Scanner;

public class Ejer25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		int cont = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el resto: ");
		num1 = sc.nextInt();
		
		System.out.println("Introduce el cociente: ");
		num2 = sc.nextInt();
		
		if (num2==0) {
			System.out.println("ERROR: No se puede dividir por 0");
		}
		
		else 
			num1=num2;
			while (num1>=num2) {
				num1 = num1 - num2;
				cont++;
			}
			System.out.println();
		
		sc.close();
	}

}
