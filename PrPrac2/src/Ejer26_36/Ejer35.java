package Ejer26_36;

import java.util.Scanner;

public class Ejer35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a,b, sumaa = 1, sumab= 1, sumac= 1, comb, resta;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número a: ");
		a = sc.nextFloat();
		
		System.out.println("Introduce el número b: ");
		b = sc.nextFloat();
		
		if (a > b && a > 0 && b > 0) {
			for (int cont=1;cont<=a;cont++) {
				sumaa = cont * sumaa;
			}
			for (int cont=1;cont<=b;cont++) {
				sumab = cont * sumab;
			}
			
			resta = a - b;
			
			for (int cont=1;cont<=resta;cont++) {
				sumac = cont * sumac;
			}
			
			comb = sumaa/(sumab*sumac);
			System.out.println("El combinatorio de a sobre b es: " + comb);
		}
		else 
			System.out.println("No se puede calcular el combinatorio de estos números ");

		
		sc.close();
	}

}
