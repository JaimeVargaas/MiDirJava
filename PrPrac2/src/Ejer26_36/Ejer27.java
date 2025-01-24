package Ejer26_36;

import java.util.Scanner;

public class Ejer27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		long suma = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número: ");
		num1 = sc.nextInt();

		if (num1<0)
			System.out.println("El número es negativo, no tiene factorial");
		else

			for (int cont=1;cont<=num1;cont++) {
				suma = cont	 * suma;
			}

		System.out.println("El factorial de " + num1 + " es " + suma);




		sc.close();
	}

}
