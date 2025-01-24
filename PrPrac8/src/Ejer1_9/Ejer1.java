package Ejer1_9;

import java.util.Scanner;

public class Ejer1 {

	public static void main(String[] args) {
		
		int [] array = new int[10];
		int suma = 0;
		
		try (Scanner sc = new Scanner(System.in)) {
			
			for (int i = 0; i < array.length; i++) {
				System.out.print("Introduzca el valor " + (i+1) + ": ");
				array[i] = sc.nextInt();
			}
			
			for (int i = 1;i<array.length;i++) {
				System.out.print(array[i]+" ");
				suma = suma + array[i];
			}
			
			System.out.println("\n\nLa suma de los elementos pares vale " + suma);
			
		}

	}

}
