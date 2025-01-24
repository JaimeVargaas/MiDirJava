package Ejer48_55;

import java.util.Scanner;

public class Ejer54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int primerapos, ultimapos, num, cont=0;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el número que quieras: ");
		num = sc.nextInt();
		
		while (num!=0) {
			cont++;
			System.out.print("Introduce el número que quieras: ");
			num = sc.nextInt();
			if (num==12) {
				primerapos = cont;
			}
			
		}
		
		
		
		sc.close();
		

		
		
	}

}
