package Ejer26_36;

import java.util.Scanner;

public class Ejer30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1;
		int num2;
		boolean mostrar = true;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		num1 = sc.nextInt();
		
		System.out.print("Introduce otro número: ");
		num2 = sc.nextInt();
		// cambiar numeros si el num1 es mayor que num2
		if (num1>num2) {
			int aux;
			aux = num1;
			num1 = num2;
			num2 = aux;
		}
		else 
			for (int cont = num1; cont<num2;cont++) {
				if (cont % 3 == 0) { // sacar los multiplos de 3
				if (mostrar)
					System.out.println(cont);
				mostrar= !mostrar;
				
				} // end if
			} // end for
		
		
		sc.close();
	}

}
