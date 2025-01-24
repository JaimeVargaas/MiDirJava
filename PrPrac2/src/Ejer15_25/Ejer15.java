package Ejer15_25;

import java.util.Scanner;

public class Ejer15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float num1;
		float num2;
		float num3;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el primer número: ");
		num1 = sc.nextFloat();
		
		System.out.print("Introduce el segundo número: ");
		num2 = sc.nextFloat();
		
		System.out.print("Introduce el tercer número: ");
		num3 = sc.nextFloat();
		
		if (num1 > num2 && num1 > num3 && num2 > num3)
			System.out.println("1. " + num1 + " 2. " + num2 + " 3. " + num3);
		else if (num2 > num1 && num2 > num3 && num1 > num3)
			System.out.println("1. " + num2 + " 2. " + num1 + " 3. " + num3);
		else if (num3 > num2 && num3 > num1 && num2 > num1)
			System.out.println("1. " + num3 + " 2. " + num2 + " 3. " + num1);
		else if (num1 > num2 && num2 > num1 && num1 > num3)
			System.out.println("1. " + num2 + " 2. " + num1 + " 3. " + num3);
		
		
		sc.close();
	}

}
