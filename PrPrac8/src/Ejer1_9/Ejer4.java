package Ejer1_9;

import java.util.Scanner;

public class Ejer4 {

	public static void main(String[] args) {
		int [] array = new int [8];
		
		try (Scanner sc = new Scanner(System.in)) {
			for (int i=0;i<array.length;i++) {
				System.out.print("Introduce el valor " + (i+1) +": ");
				array[i]= sc.nextInt();	
			}
			for (int i=array.length;i>=0;i--) {
				System.out.print(array[i] + " ");
			}
		}

	}

}
