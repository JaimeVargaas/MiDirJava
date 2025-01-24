package Ejer26_36;

import java.util.Scanner;

public class Ejer34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, aux1, aux2, aux = 1, cont = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número fibonacci: ");
		num = sc.nextInt();
		aux1 = 1;
		aux2 = 1;
		while (cont<num) {
			aux = aux1 + aux2;
			aux1 = aux2;
			aux2 = aux;
			cont++;
			
		}
		System.out.println(aux);
		sc.close();
	}

}
