package Ejer48_55;

import java.util.Scanner;

public class Ejer52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dado1= 0,dado2=0, num=0, contca=0, contcr=0, contseg = 0;
		int max = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuantas tiradas quieres hacer? ");
		num = sc.nextInt();
		
		
		for (int cont=0;cont<=num;cont++) {
		dado1=(int)(Math.random()*2);
		dado2=(int)(Math.random()*2);
		System.out.print(dado1 );
		System.out.println(" "+dado2);
			if (dado1 == 0 && dado2==0) {
				contseg++;
				
				if (contseg>max)
				max = contseg;	
			}
			else 
				contseg = 0;
		
			if (dado1 == 0) {
				contca++;
				contseg++;
			}
			
			else { 
				contcr++;
				contseg = 0;
			}
			
			
			
		}
		
		
		System.out.println("Caras: " + contca);
		System.out.println("Cruces: " + contcr);
		System.out.println("Máximo de caras consecutivas: " + max);
		
		sc.close();
		

		
		
	}

}
