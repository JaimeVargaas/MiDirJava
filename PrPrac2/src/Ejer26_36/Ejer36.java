package Ejer26_36;

import java.util.Scanner;

public class Ejer36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num= 1, contp=0, contn=0;
		
		Scanner sc = new Scanner(System.in);
		while (num!=0) {
			System.out.println("Introduce el número de la lista: ");
			num = sc.nextInt();
			if (num>0) {
				contp++;
			}
			else if (num<0) {
				contn++;
			}
		}
		
		System.out.println(contp + " números positivos y " + contn + " números negativos");
		
		
		sc.close();
	}

}
