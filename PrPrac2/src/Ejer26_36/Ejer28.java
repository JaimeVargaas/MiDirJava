package Ejer26_36;

import java.util.Scanner;

public class Ejer28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		int suma = 0;
		int aux = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		num1 = sc.nextInt();
		
		System.out.print("Introduce otro número: ");
		num2 = sc.nextInt();
		
		if (num1>num2)
			System.out.println("El número 2 es menor que el número 1");
		
		else if (num1%2==1) {
			num1 = num1 + 1;
		}
		
			for (int cont=num1;cont<num2;) {
				System.out.println(cont);
				suma = suma + cont;
				cont++;
				cont++;
				aux++;
			}
			
		System.out.println("Se han contado " + aux + " numeros y suman " + suma);
		
		
		sc.close();
	}

}
