package Ejer15_25;

import java.util.Scanner;

public class Ejer24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		int suma = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		num1 = sc.nextInt();
		
		System.out.println("Introduce otro número: ");
		num2 = sc.nextInt();
		
		for (int cont=1; cont<=num2; cont++) {
			suma = suma + num1;
        }
		System.out.println("El resultado es: " + suma);
		
		sc.close();
	}

}
