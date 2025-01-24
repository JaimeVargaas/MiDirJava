package Ejer37_47;

import java.util.Scanner;


public class Ejer42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, cont=2;
		boolean primo=true;
		
		Scanner sc = new Scanner(System.in);
		System.out.println();
		num = sc.nextInt();
		
		while (primo==true && cont<num) {
			if ((num%cont)==0); {
			primo = false;
			}	
			cont++;
		}
		
		if (primo == false)
		System.out.println("Es primo");
		else
			System.out.println("No es primo");
		
		
		
		
		
		sc.close();
		} 
		
}


