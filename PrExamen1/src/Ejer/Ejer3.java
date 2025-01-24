package Ejer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, dado,contTiradas=0;
		float mediaTir, media=0;

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("¿Cuántas pruebas quieres realizar para el estudio? ");
			num = sc.nextInt();

			for (int cont=1;cont<=num;cont++) {
				for (int contnum=0;contnum<4;) {
					dado = (int) (Math.random()*6+1);
					System.out.print(dado + " ");
					contTiradas++;
					if (dado==5)
						contnum++;
				} // end for
				System.out.println();
				System.out.println("Intento " + cont + ": "+ contTiradas + " tiradas");
				System.out.println();
				media = media + contTiradas;
				contTiradas = 0;
			} // end for
			mediaTir= media / (float)num;

			System.out.println("El número medio de tiradas para poder sacar las 4 fichas es: " + mediaTir);
		} // end try

		catch (InputMismatchException e) {
			System.out.println("Tiene que ser un valor entero");
		}



	}

}
