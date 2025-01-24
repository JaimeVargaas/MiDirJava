package Ejer15_25;

import java.util.Scanner;

public class Ejer23 {

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
		if (num1>num2)
			System.out.println("El número 2 no puede ser mayor que el número 1");
		else
		 for (int cont = num1; cont <= num2; cont++) {
             suma = suma + cont;
         }
		 
         System.out.println("La suma de los números naturales entre " + num1 + " y " + num2 + " es: " + suma);
		
	
		
		sc.close();
	}

}
