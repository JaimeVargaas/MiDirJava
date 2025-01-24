package Ejer15_25;

import java.util.Scanner;

public class Ejer20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n;
		float suma = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el valor de N: ");
		n = sc.nextInt();
		
		for (int cont=1; cont<=n; cont++) {
			suma = suma + 1.0f/cont;
		}
		System.out.println("El resultado de la serie es: " + suma);
		
		
		
		sc.close();
	}

}
