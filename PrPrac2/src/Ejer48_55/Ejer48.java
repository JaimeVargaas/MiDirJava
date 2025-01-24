package Ejer48_55;

import java.util.Scanner;


public class Ejer48 {	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		int cont = 0, dado1, dado2;
		
		
		for (int i=1;i<=100;i++) {
		dado1=(int)(Math.random()*6)+1;
		dado2=(int)(Math.random()*6)+1;
		if (dado1 + dado2 == 10) cont++;
		System.out.println(dado1 + " " + dado2 + " = " +(dado1+dado2));
		
		}
		System.out.println("Es igual a 10 " + cont + " veces");
		
		sc.close();	
		
		
			
			
		
		
		
		}
		
	
		} 
		



