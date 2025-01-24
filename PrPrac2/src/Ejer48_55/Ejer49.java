package Ejer48_55;

import java.util.Scanner;

public class Ejer49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte hora=0, min=0, seg=0;
		char resp;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Desea poner el reloj en hora (S/N)?");
		resp = sc.nextLine().charAt(0);
	
		if (resp=='s') {
			System.out.print("Hora: ");
			System.out.print("Minutos: ");
			System.out.print("Segundos: ");
		}
		
		else {
			
		}
		
		
		
		
		sc.close();	
		
		
		
	}

}
