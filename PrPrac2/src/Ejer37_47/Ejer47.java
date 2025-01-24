package Ejer37_47;

import java.util.Scanner;


public class Ejer47 {	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		int cont = 0, dado;
		for (int i=1;i<=100;i++) {
		dado=(int)(Math.random()*6)+1;
		if (dado == 6) cont++;
		System.out.println(dado + "  ");
		}
		System.out.println("Ha aparecido " + cont + " veces");
		
		sc.close();	
		
		
			
			
		
		
		
		}
		
	
		} 
		



