package Ejer15_25;

import java.util.Scanner;

public class Ejer21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte numTabla;

		
		Scanner sc = new Scanner(System.in);
		System.out.print("Numero de la tabla que quieras multiplicar: ");
		numTabla = sc.nextByte();
		
		for (int cont=0; cont<=10; cont++) {
			System.out.println(numTabla + " x " + cont + " = " + (numTabla * cont));
		}
		
		
		
		
		sc.close();
	}

}
