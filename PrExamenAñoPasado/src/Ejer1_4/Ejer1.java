package Ejer1_4;


public class Ejer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2,num3, cont = 0;
		
		while (true) {
			cont++;
			num1 = (int)(Math.random()*1000+1);
			num2 = (int)(Math.random()*1000+1);
			num3 = (int)(Math.random()*1000+1);
			System.out.print(num1);
			System.out.print(" "+num2);
			System.out.println(" "+ num3);
			
			if (num1%2==0 && num2%2==0 && num3%2==1) {
				System.out.println("Se han realizado " + cont + " intentos hasta obtener par, par, impar");
				break;
			}
		}
		
		
		
		
		
		
	}

}
