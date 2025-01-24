package Ejem;

import java.util.Scanner;

public class Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Definir un array de 4 elementos de tipo entero
		int [] array = new int[4];
		
		// Pedir valores por teclado para los componentes del array
		try (Scanner sc = new Scanner(System.in)) {
			for (int i=0; i<array.length;i++) {
				System.out.print("Introduzca elemento de posicion " + (i + 1)+ ":");
				array[i] = sc.nextInt();
			}
		}
		// mostrar el contenido del array por consola
		for (int i=0;i<array.length;i++) {
			System.out.print(array[i]+ " ");
		}
		
	}

}
