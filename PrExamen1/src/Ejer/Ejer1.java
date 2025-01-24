package Ejer;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad=0, contjuv=0, contpro=0,contse=0,contveta=0,contvetb=0,contvetc=0;
		
		
		Scanner sc = new Scanner(System.in);
		
		while (edad>=0) {
			System.out.print("Indique su edad para inscribirse: ");
			edad = sc.nextInt();
			
			if (edad>=0 && edad<18)
				System.out.println("No pueden escribirse menores de edad");
			
			if (edad>=18 && edad<=22)
				contjuv++;
			else if (edad>=23 && edad<=30)
				contpro++;
			else if (edad>=31 && edad<=39)
				contse++;
			else if (edad>=40 && edad<=49)
				contveta++;
			else if (edad>=50 && edad<=59)
				contvetb++;
			else if (edad>=60)
				contvetc++;
			}// end while
		System.out.println();
		System.out.println("Junior: "+ contjuv + " corredores");
		System.out.println("Promesa: "+ contpro + " corredores");
		System.out.println("Senior: "+ contse + " corredores");
		System.out.println("Veterano A: "+ contveta + " corredores");
		System.out.println("Veterano B: "+ contvetb + " corredores");
		System.out.println("Veterano C: "+ contvetc + " corredores");
	
		
		
		sc.close();
		
		
	}

}
