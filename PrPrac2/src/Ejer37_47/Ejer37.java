package Ejer37_47;

import java.util.Scanner;

public class Ejer37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, suma = 0, cont=0;
		double media;
		
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Introduce un número: ");
			num = sc.nextInt();
			
			for (; num>0; cont++) {
				suma = suma + Math.abs(num);
				System.out.print("Introduce un número: ");
				num = sc.nextInt();
			}

			media = (double)suma / cont;
			System.out.println("La media es " + media);
			
			
			
		}
	}

}
