package Ejer;

import java.util.InputMismatchException;
import java.util.Scanner;

// clase para testear el método que calcula el factorial de un numero
// @author Jaime Vargas

public class TestCombinatorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		double resultado;
		System.out.println("El combinatorio de 5 sobre 2: " + LibreriaMatematica.combinatorio(5, 2));
		
		
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.print("Introduce el valor a: ");
			a = sc.nextInt();
			System.out.print("Introduce el valor b: ");
			b = sc.nextInt();
					
			resultado = LibreriaMatematica.combinatorio(a,b);
			
			if (resultado==-1) {
				System.out.println("ERROR, no existe el factorial de números negativos");
			}
			
			else {
				System.out.println("El combinatorio de " + a + " "+ b + " es " + resultado  );
			}
		}
		
		catch (InputMismatchException e) {
			System.out.println("Valor no válido");
		}
		
	}

}
