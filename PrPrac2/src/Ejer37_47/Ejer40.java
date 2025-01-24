package Ejer37_47;

import java.util.Locale;
import java.util.Scanner;


public class Ejer40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num;
		int bil500= 0,bil200 = 0, bil100= 0, bil50= 0,bil20= 0,bil10= 0,bil5= 0,mon2e= 0,mon1e= 0,mon50c= 0,mon20c= 0,mon10c= 0,mon5c= 0,mon2c= 0,mon1c= 0;
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		System.out.println("Introduce el dinero para desglosar: ");
		num = sc.nextDouble();
		sc.close();
		
		while (num>500) {
			bil500++;
			num = num - 500;
			System.out.println(bil500 + "billetes de 500");
			}
		
		while (num>=200 && num<500) {
			bil200++;
			num = num - 200;
			System.out.println(bil200 + "billetes de 200");
		}
		
		while (num<200 && num>=100) {
			bil100++;
			num = num - 100;
			System.out.println(bil100 + "billetes de 100");
		}
		
		
		while (num<100 && num>=50) {
			bil50++;
			num = num - 50;
			System.out.println(bil50 + "billetes de 50");
		}
		
		while (num<50 && num>=20) {
			bil20++;
			num = num - 20;
			System.out.println(bil20 + "billetes de 20");
		}
		
		while (num<20 && num>=10) {
			bil10++;
			num = num - 10;
			System.out.println(bil10 + "billetes de 10");
		}
		
		while (num<10 && num>=5) {
			bil5++;
			num = num - 5;
			System.out.println(bil5 + "billetes de 5");
		}
		
		while (num<5 && num>=2) {
			mon2e++;
			num = num - 2;
			System.out.println(mon2e + "monedas de 2€");
		}
		
		while (num<2 && num>=1) {
			mon1e++;
			num = num - 1;
			System.out.println(mon1e + "monedas de 1€");
		}
		
		while (num<1 && num>=0.5) {
			mon50c++;
			num =num - 0.5f;
			System.out.println(mon50c + "monedas de 50 céntimos");
		}
		
		while (num<0.5 && num>=0.2) {
			mon20c++;
			num =num - 0.2f;
			System.out.println(mon20c + "monedas de 20 céntimos");
		}
		
		while (num<0.2 && num>=0.1) {
			mon10c++;
			num =num - 0.1f;
			System.out.println(mon10c + "monedas de 10 céntimos");
		}
		
		while (num<0.1 && num>=0.05) {
			mon5c++;
			num =num - 0.05f;
			System.out.println(mon5c + "monedas de 5 céntimos");
		}
		
		while (num<0.05 && num>=0.02) {
			mon1c++;
			num =num - 0.02f;
			System.out.println(mon2c + "monedas de 2 céntimos");
		}
		
		
		while (num<0.02 && num>=0.01) {
			mon1c++;
			num =num - 0.01f;
			System.out.println(mon1c + "monedas de 1 céntimos");
		}
		
	
		
		
		
	
		
		
		
		
	
	
		
	
		
	
		} 
		
}


