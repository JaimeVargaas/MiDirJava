package Ejer;

import java.util.InputMismatchException;
import java.util.Scanner;

// clase para testear el método que calcula el factorial de un numero
// @author Jaime Vargas

public class TestFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		long resultado;
		
		
		try (Scanner sc = new Scanner(System.in)) {
			
			System.out.print("Introduce un valor: ");
			numero = sc.nextInt();
			resultado = LibreriaMatematica.factorial(numero);
			
			if (resultado==-1) {
				System.out.println("ERROR, no existe el factorial de números negativos");
			}
			
			else {
				System.out.println("El factorial de " + numero + " es " + resultado  );
			}
		}
		
		catch (InputMismatchException e) {
			System.out.println("Valor no válido");
		}
		
	}

}
