package ejemplos;

import java.util.Scanner;

public class Ejemplo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero;
		char caracter;
		String cadena;
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Introduce el caracter: ");
			caracter = sc.nextLine().charAt(0);
			
			System.out.println("Introduce una cadena: ");
			cadena = sc.nextLine();
			
			System.out.println("Introduce un número: ");
			numero = sc.nextInt();
			
		}
		

	}

}
