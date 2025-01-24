package Ejer37_47;

import java.util.Scanner;


public class Ejer46 {	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char resp;
		byte moneda;
		
		Scanner sc = new Scanner(System.in);
	

		do {
			if ((Math.random()*2)==0.0) {
				System.out.println("Cara");
			}
			else 
				System.out.println("Cruz");
			
			System.out.println("Quieres seguir con el programa?");
			resp = sc.nextLine().charAt(0);
		}
			
			
		while (resp=='s');
		
		
		
		sc.close();	
		
		
			
			
		
		
		
		}
		
	
		} 
		



