package Ejer37_47;

import java.util.Scanner;


public class Ejer44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu nota: ");
		num = sc.nextByte();
		sc.close();
		
		if (num<0 || num>10)
			System.out.println("Introduce una nota válida");
		
		else if (num>0 && num<3)
			System.out.println("Muy deficiente");
		else if (num>=3 && num<5)
			System.out.println("Insuficiente");
		else if (num>=5 && num<6)
			System.out.println("Suficiente");
		else if (num>=6 && num<7)
			System.out.println("Bien");
		else if (num>=7 && num<9)
			System.out.println("Notable");
		else if (num>=9 && num<=10)
			System.out.println("Sobresaliente"); 
		
		
		switch (num) {
		case 0:
		case 1:
		case 2: System.out.println("Muy deficiente"); break;
		case 3:
		case 4: System.out.println("Insuficiente"); break;
		case 5:System.out.println("Suficiente"); break;
		case 6: System.out.println("Bien"); break;
		case 7:
		case 8: System.out.println("Notable"); break;
		case 9:
		case 10:System.out.println("Sobresaliente"); break;
		default: System.out.println("Nota incorrecta");
		}
		

		
		
		
		
		}
		
	
		} 
		



