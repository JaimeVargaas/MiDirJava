package Ejer37_47;

import java.util.Scanner;


public class Ejer41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2;
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número mayor a 0");
		num1 = sc.nextInt();
		
		System.out.println("Introduce un número menor a 50");
		num2 = sc.nextInt();
		if (num1<=0)
			System.out.println("Introduce un número mayor a 0");
		else if (num1>num2)
			System.out.println("El número 1 no puede ser mayor que el numero 2");
		else if (num2 > 50)
			System.out.println("El numero 2 tiene que ser menor que 50");
		else
			System.out.println(num1 + num2);
			while (num1<=num2) {
			num1= num1 + 5;
			num2= num2 - 2;
			System.out.println(num1 + " " + num2);
		}
		
		
		sc.close();
		} 
		
}


