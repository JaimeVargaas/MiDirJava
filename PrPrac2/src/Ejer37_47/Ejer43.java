package Ejer37_47;

import java.util.Scanner;


public class Ejer43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número del mes: ");
		num = sc.nextByte();
		
		switch (num) {
		case 1 -> System.out.println("Enero"); 
		case 2 -> System.out.println("Febrero");
		case 3 -> System.out.println("Marzo");
		case 4 -> System.out.println("Abril");
		case 5 -> System.out.println("Mayo");
		case 6 -> System.out.println("Junio");
		case 7 -> System.out.println("Julio");
		case 8 -> System.out.println("Agosto");
		case 9 -> System.out.println("Septiembre");
		case 10 -> System.out.println("Octubre");
		case 11 -> System.out.println("Noviembre");
		case 12 -> System.out.println("Diciembre");
		default -> System.out.println("No es un mes");
		
		}
		
		
		
		sc.close();
		} 
		
}


