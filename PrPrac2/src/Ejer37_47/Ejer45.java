package Ejer37_47;

import java.util.Scanner;


public class Ejer45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte num;
		float contIns = 0, contSuf= 0, contBie= 0, contNot= 0, contSob= 0, cont=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu nota: ");
		num = sc.nextByte();
		
		while (num!=0) {
			System.out.println("Introduce tu nota: ");
			num = sc.nextByte();
			if (num<0 && num>10) {
				System.out.println("Nota incorrecta");
			}
			if (num<5) {
				contIns++;
			}
			else if (num<6) {
				contSuf++;
			}
			else if (num<7) {
				contBie++;
			}
			else if (num<9) {
				contNot++;
			}
			else if (num<10) {
				contSob++;
			}
			
			cont++;
		
		}
			System.out.println((contIns*100.00/cont)+ " % de insuficientes");
			System.out.println((contSuf*100.00/cont)+ " % de suficientes");
			System.out.println((contBie*100.00/cont)+ " % de bien");
			System.out.println((contNot*100.00/cont)+ " % de notables");
			System.out.println((contSob*100.00/cont)+ " % de sobresalientes");
			
			
			
			
			sc.close();

		
		
		
		
		}
		
	
		} 
		



